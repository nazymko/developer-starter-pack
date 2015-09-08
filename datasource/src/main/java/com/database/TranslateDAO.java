package com.database;

import com.database.model.Owner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Nazymko on 9/6/2015.
 */
@Component
public class TranslateDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;


    List<Owner> readAll(int limit) {
        List<Owner> result = jdbcTemplate.query("SELECT * FROM owners;", new RowMapper<Owner>() {
            @Override
            public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new Owner(rs.getInt("id"), rs.getString("name_first"), rs.getString("second_name"));
            }
        });

        return result;

    }
}
