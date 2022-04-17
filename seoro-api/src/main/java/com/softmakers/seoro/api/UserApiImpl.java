package com.softmakers.seoro.api;

import com.softmakers.seoro.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserApiImpl /*implements UserApiImpl*/ {

    private final UserApi api;

    public UserApiImpl(UserApi api) {
        this.api = api;
    }

//    @GetMapping(value = "/{email}/{password}")
//    public User findUser() {
//        return this.api.findUser();
//    }
}
