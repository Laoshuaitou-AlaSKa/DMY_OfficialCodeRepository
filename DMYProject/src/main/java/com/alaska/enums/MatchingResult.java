package com.alaska.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum MatchingResult {
    UNKNOWN(404,"未知结果");

    private int resultId;
    private String result;

    public static MatchingResult stateOf(int resultId){
        for (MatchingResult matchingResult : values()) {
            if (matchingResult.getResultId() == resultId) {
                return matchingResult;
            }
        }
        return null;
    }

}
