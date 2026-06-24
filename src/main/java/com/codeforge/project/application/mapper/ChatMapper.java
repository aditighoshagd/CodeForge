package com.codeforge.project.application.mapper;

import com.codeforge.project.application.dto.chat.ChatResponse;
import com.codeforge.project.application.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}
