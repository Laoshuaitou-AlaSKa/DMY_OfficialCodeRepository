package com.alaska.dao;

import com.alaska.dto.UserMessageDto;
import com.alaska.entity.UserMessage;

public interface UserMessageMapper {
    public UserMessage selectUserMessage(String username);
}
