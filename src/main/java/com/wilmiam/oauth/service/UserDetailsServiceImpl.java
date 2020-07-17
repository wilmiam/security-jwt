package com.wilmiam.oauth.service;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wilmiam.oauth.dao.UserDao;
import com.wilmiam.oauth.entity.JwtUser;
import com.wilmiam.oauth.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserDao userDao;

    public UserDetailsServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userDao.selectOne(Wrappers.lambdaQuery(User.builder().username(username).build()));

        return new JwtUser(user);
    }

}
