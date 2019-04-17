package com.alaska.entity;

import lombok.Data;

@Data
public class User {
    private long userId;
    private String username;
    private String password;
}
