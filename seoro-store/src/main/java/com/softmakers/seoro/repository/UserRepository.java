package com.softmakers.seoro.repository;

import com.softmakers.seoro.data.UserData;
import com.softmakers.seoro.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

//@Repository
public interface UserRepository extends JpaRepository<UserData, BigInteger> {

    public Optional<UserData> findByEmail(String email);
    public Optional<UserData> findByLoginId(String loginId);
}
