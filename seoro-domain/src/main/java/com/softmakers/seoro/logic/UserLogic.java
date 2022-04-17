package com.softmakers.seoro.logic;

import com.softmakers.seoro.api.UserApi;
import com.softmakers.seoro.entity.User;
import com.softmakers.seoro.store.UserStore;
import org.springframework.stereotype.Component;

@Component
public class UserLogic implements UserApi {

    private final UserStore store;

    public UserLogic(UserStore store) {
        this.store = store;
    }

    @Override
    public User findUser(String email, String password) {

        return this.store.retrieveUser(email, password);
    }
}
