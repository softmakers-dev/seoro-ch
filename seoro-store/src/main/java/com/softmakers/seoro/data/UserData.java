package com.softmakers.seoro.data;

import com.softmakers.seoro.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name = "TB_USER")
public class UserData {

    @Id
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "token")
    private String token;
    @Column(name = "create_timestamp")
    private Timestamp createTimestamp;
    @Column(name = "update_timestamp")
    private Timestamp updateTimestamp;

    public UserData(User user) {
        BeanUtils.copyProperties(user, this);
    }

    public User toDomain() {
        User user = new User();
        BeanUtils.copyProperties(this, user);
        return user;
    }
}
