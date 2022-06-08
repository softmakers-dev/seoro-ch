package com.softmakers.seoro.api;

import com.softmakers.seoro.entity.User;
import com.softmakers.seoro.entity.request.ReqUser;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserApiImpl /*implements UserApiImpl*/ {

    private final UserApi api;

    public UserApiImpl(UserApi api) {
        this.api = api;
    }

    @PostMapping(value = "/info")
    @ResponseBody
    public User findUser(@RequestBody ReqUser paramMap) {

        String loginId = paramMap.getLoginId();
        String name = paramMap.getName();
        return this.api.findUser(loginId, name);
    }
}
