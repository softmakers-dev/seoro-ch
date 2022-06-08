package com.softmakers.seoro.logic;

import com.softmakers.seoro.store.UserStore;
import io.swagger.v3.oas.annotations.servers.Server;

@Server
public class UserSpringLogic extends UserLogic{

    public UserSpringLogic(UserStore store) {
        super(store);
    }
}
