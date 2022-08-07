package com.example.give2paybot.controller;

import com.example.give2paybot.dto.MessageDTO;
import com.example.give2paybot.service.inf.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import java.security.Principal;

@Controller
public class ChatController {
    private ChatService chatService;
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @MessageMapping("/chat.sendMessage")
    @SendToUser("/queue/private")
    public MessageDTO sendMessage(@Payload MessageDTO chatMessage,Principal principal) {
        chatMessage.setText("hello");
        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendToUser("/queue/private")
    public MessageDTO addUser(@Payload MessageDTO chatMessage, Principal principal,
                              SimpMessageHeaderAccessor headerAccessor) {
        // Add username in web socket session
        //headerAccessor.getSessionAttributes().put("username", chatMessage.getFrom());
        return chatMessage;
    }


}
