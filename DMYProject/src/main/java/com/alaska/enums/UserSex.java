package com.alaska.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter@AllArgsConstructor
@ToString
public enum  UserSex {
    MALE(1,"男"),
    FEMALE(0,"女"),
    UNKNOWN(404,"未知");

    private int sexId;
    private String sex;

    public static UserSex stateOf(int sexId){
        for (UserSex userSex : values()) {
            if (userSex.getSexId() == sexId) {
                return userSex;
            }
        }
        return null;
    }
}
