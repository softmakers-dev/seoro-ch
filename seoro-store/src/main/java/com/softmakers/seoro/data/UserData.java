package com.softmakers.seoro.data;

import com.softmakers.seoro.entity.User;
import lombok.*;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "TB_USER")
public class UserData {

    @Id
    @Column(name = "id")
    private BigInteger id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "token")
    private String token;
    @Column(name = "name")
    private String name;
    @Column(name = "loginId")
    private String loginId;
    @Column(name = "create_timestamp")
    private Timestamp createTimestamp;
    @Column(name = "update_timestamp")
    private Timestamp updateTimestamp;

    public UserData() {
        // default initialization
    }

    public UserData(User user) {
        BeanUtils.copyProperties(user, this);
    }

    public User toDomain() {
        User user = new User();
//        BeanUtils.copyProperties(this, user);
        user.setEmail(this.getEmail());
        user.setPassword(this.getPassword());
        user.setToken(this.getToken());
        user.setName(this.getName());
        user.setLoginId(this.getLoginId());
        user.setCreateTimestamp(this.getCreateTimestamp());
        user.setUpdateTimestamp(this.updateTimestamp);
        user.setId(this.getId());

        return user;
    }
}
