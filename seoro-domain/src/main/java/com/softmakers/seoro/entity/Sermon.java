package com.softmakers.seoro.entity;

import com.google.gson.Gson;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class Sermon {

    private long sermonId;
    private String linkUrl;
    private Timestamp createTimestamp;
    private Timestamp updateTimestamp;

    public Sermon fromJson(String json) {

        return new Gson().fromJson(json, Sermon.class);
    }
}
