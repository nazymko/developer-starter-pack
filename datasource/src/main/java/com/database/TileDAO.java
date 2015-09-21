package com.database;

import com.database.model.Tile;
import com.mysql.jdbc.PreparedStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by Nazymko on 9/6/2015.
 */
@Component
public class TileDAO {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    void save(Tile tile) {
//        PreparedStatement ps = jdbcTemplate.

        jdbcTemplate.update("INSERT INTO tile (title, body, created_at, saved_at)  VALUES (:title,:body,:created_at,now());",
                new MapSqlParameterSource()
                        .addValue("title",tile.getHeader())
                        .addValue("body",tile.getBody())
                        .addValue("created_at",tile.getMeta().getCreatedAt())
        );
    }
}
