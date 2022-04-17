package com.softmakers.seoro.entity;

import com.google.gson.Gson;
import com.softmakers.seoro.utils.JsonUtil;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {

    private static final long serialVersionID = 1L;

    private String email;
    private String password;
    private String token;
    private Timestamp createTimestamp;
    private Timestamp updateTimestamp;

    public User fromJson(String json) {
        return new Gson().fromJson(json, User.class);
    }
}
