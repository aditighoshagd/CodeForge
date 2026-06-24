package com.codeforge.project.application.dto.chat;


import com.codeforge.project.application.entity.ChatEvent;
import com.codeforge.project.application.entity.ChatSession;
import com.codeforge.project.application.enums.MessageRole;

import java.time.Instant;
import java.util.List;

public record ChatResponse(
        Long id,
        ChatSession chatSession,
        MessageRole role,
        List<ChatEvent> events,
        String content,
        Integer tokensUsed,
        Instant createdAt

) {
}
