package com.wilmiam.oauth.service;

import com.wilmiam.oauth.dao.UserDao;
import com.wilmiam.oauth.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.insert(user);
    }

}
