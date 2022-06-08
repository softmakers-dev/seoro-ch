package com.softmakers.seoro.entity;

import com.google.gson.Gson;
import com.softmakers.seoro.utils.JsonUtil;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private static final long serialVersionID = 1L;

    private BigInteger id;
    private String email;
    private String password;
    private String token;
    private String name;
    private String loginId;
    private Timestamp createTimestamp;
    private Timestamp updateTimestamp;

    public User fromJson(String json) {
        return new Gson().fromJson(json, User.class);
    }
}
