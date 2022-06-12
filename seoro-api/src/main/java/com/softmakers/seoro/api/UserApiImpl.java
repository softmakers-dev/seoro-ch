package com.softmakers.seoro.api;

import com.softmakers.seoro.entity.User;
import com.softmakers.seoro.entity.request.ReqUser;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    public User findUser(@RequestBody ReqUser paramMap) throws NoSuchFieldException {

        String loginId = paramMap.getLoginId();
        String name = paramMap.getName();
        User result = null;

        try {
            result = this.api.findUser(loginId, name);
        } catch (NoSuchFieldException nse) {
            throw nse;
        }

        return result;
    }

    @ExceptionHandler(NoSuchFieldException.class)
    public Map noSuchFieldExe(Exception e) {

        Map errMessage = new HashMap();
        errMessage.put("errMessage", "No data found with the login id & name");
        return errMessage;
    }
}
