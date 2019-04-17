package com.alaska.dao;

import com.alaska.dto.UserDto;
import com.alaska.entity.User;
import com.alaska.enums.MatchingResult;

public interface UserMapper {
    public void insertUser(User newUser);

    public User selectUser(String username);
}
