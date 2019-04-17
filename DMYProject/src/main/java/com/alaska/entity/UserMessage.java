package com.alaska.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserMessage {
    private long userId;
    private String nickname;
    private String sex;
//    private Date birthdate;
    private String resident;
    private String personalizedSignature;
}
