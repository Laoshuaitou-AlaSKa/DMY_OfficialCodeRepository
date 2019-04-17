package com.alaska.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum RegistResult {
    UNKNOWN(404,"未知结果");

    private int resultId;
    private String result;

    public static RegistResult stateOf(int resultId){
        for (RegistResult registResult : values()) {
            if (registResult.getResultId() == resultId) {
                return registResult;
            }
        }
        return null;
    }
}
