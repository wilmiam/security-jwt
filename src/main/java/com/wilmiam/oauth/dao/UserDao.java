package com.wilmiam.oauth.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wilmiam.oauth.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends BaseMapper<User> {
}
