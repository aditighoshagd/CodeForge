package com.codeforge.project.application.service;


import com.codeforge.project.application.dto.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);
}
