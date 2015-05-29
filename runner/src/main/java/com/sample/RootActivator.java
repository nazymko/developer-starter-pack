package com.sample;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by andrew on 12/17/2014.
 */
public class RootActivator {

    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<List<HashMap>> rootHandler() {

        List<List<HashMap>> query = jdbcTemplate.query("SELECT * FROM users;", new RowMapper<List<HashMap>>() {
            @Override
            public List<HashMap> mapRow(ResultSet rs, int rowNum) throws SQLException {
                List result = new ArrayList();

                while (!rs.isAfterLast()) {
                    HashMap map = new HashMap();
                    int id = rs.getInt("id");
                    String name = rs.getString("name");

                    map.put("id", id);
                    map.put("name", name);

                    result.add(map);

                    rs.next();
                }

                return result;
            }
        });

        return query;
    }

    public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
