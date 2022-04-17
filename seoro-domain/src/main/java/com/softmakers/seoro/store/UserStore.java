package com.softmakers.seoro.store;

import com.softmakers.seoro.entity.User;

public interface UserStore {

    public User retrieveUser(String email, String password);
}
