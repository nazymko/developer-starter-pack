package com.database.model;

import com.database.model.meta.Meta;

/**
 * Created by Nazymko on 9/17/2015.
 */
public class Tile {

    private String body;
    private String header;
    private Meta meta;

    public Tile(String body, String header, Meta meta) {
        this.body = body;
        this.header = header;
        this.meta = meta;
    }

    public String getBody() {
        return body;
    }

    public String getHeader() {
        return header;
    }

    public Meta getMeta() {
        return meta;
    }
}
