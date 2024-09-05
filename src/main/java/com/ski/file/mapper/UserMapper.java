package com.ski.file.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ski.file.model.User;

public interface UserMapper extends BaseMapper<User> {
    void insertUser(User user);
    List<User> selectUser();
}
