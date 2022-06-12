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
    public User findUser(String loginId, String name) throws NoSuchFieldException{

        User result = null;
        try {
            result = this.store.retrieveUser(loginId, name);
        } catch (NoSuchFieldException nse) {
            throw nse;
        }

        return result;
    }
}
