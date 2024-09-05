package com.ski.file.service;

import com.ski.file.common.RestResult;
import com.ski.file.model.User;

public interface UserService {
    RestResult<String> registerUser(User user);
    RestResult<User> login(User user);
    User getUserByToken(String token);
}