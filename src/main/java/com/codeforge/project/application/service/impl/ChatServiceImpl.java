package com.codeforge.project.application.service.impl;

import com.codeforge.project.application.dto.chat.ChatResponse;
import com.codeforge.project.application.entity.ChatMessage;
import com.codeforge.project.application.entity.ChatSession;
import com.codeforge.project.application.entity.ChatSessionId;
import com.codeforge.project.application.mapper.ChatMapper;
import com.codeforge.project.application.repository.ChatMessageRepository;
import com.codeforge.project.application.repository.ChatSessionRepository;
import com.codeforge.project.application.security.AuthUtil;
import com.codeforge.project.application.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatSessionRepository chatSessionRepository;
    private final AuthUtil authUtil;
    private final ChatMapper chatMapper;

    @Override
    public List<ChatResponse> getProjectChatHistory(Long projectId) {
        Long userId = authUtil.getCurrentUserId();

        ChatSession chatSession = chatSessionRepository.getReferenceById(
                new ChatSessionId(projectId, userId)
        );

        List<ChatMessage> chatMessageList = chatMessageRepository.findByChatSession(chatSession);

        return chatMapper.fromListOfChatMessage(chatMessageList);
    }
}
