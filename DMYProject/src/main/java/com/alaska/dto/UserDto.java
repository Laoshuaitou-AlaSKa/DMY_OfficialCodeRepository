package com.alaska.dto;

import com.alaska.entity.User;
import com.alaska.enums.MatchingResult;
import lombok.Data;

@Data
public class UserDto {
    private MatchingResult matchingResult;
    private User user;
}
