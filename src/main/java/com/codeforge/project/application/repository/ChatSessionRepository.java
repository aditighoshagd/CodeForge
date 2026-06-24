package com.codeforge.project.application.repository;

import com.codeforge.project.application.entity.ChatSession;
import com.codeforge.project.application.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}
