package com.example.give2paybot.service.impl;

import com.example.give2paybot.dto.MessageDTO;
import com.example.give2paybot.dto.UserPrincipal;
import com.example.give2paybot.service.inf.ChatService;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatServiceImpl implements ChatService {
    private final SimpMessagingTemplate simpMessagingTemplate;

    public ChatServiceImpl(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    @Override
    public void sendMessageToUser(MessageDTO message, UserPrincipal user) {
        String messageText = "Hello dear user";
        message.setText(messageText);
        simpMessagingTemplate.convertAndSendToUser(user.getUuid(),"/queue/messages",message);
    }
}
