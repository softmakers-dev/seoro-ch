package com.softmakers.seoro.store;

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
    public User retrieveUser(String email, String password) {

        Optional<User> oUser = this.repository.findById(email);
        User user = null;
        if (oUser.isPresent()) {
            user = oUser.get();
        }
        
        return user;
    }
}
