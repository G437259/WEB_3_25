package com.cjx.service.user;

import com.cjx.dao.UserDao;
import com.cjx.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;
    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
