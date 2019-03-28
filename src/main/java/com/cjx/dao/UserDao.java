package com.cjx.dao;

import com.cjx.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserDao {
    public User login(User user);
}
