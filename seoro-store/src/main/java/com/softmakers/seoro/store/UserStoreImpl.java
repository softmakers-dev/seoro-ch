package com.softmakers.seoro.store;

import com.softmakers.seoro.data.UserData;
import com.softmakers.seoro.entity.User;
import com.softmakers.seoro.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserStoreImpl implements UserStore{

    private final UserRepository repository;

    public UserStoreImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User retrieveUser(String loginId, String name) {

        Optional<UserData> oUser = this.repository.findByLoginId(loginId);
        User user = null;
        if (oUser.isPresent()) {
            user = oUser.get().toDomain();
        }

        return name.equals(user.getName()) ? user : null;
    }
}
