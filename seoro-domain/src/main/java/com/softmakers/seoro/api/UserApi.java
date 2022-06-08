package com.softmakers.seoro.api;

import com.softmakers.seoro.entity.User;

public interface UserApi {

    public User findUser(String loginId, String name);
}
