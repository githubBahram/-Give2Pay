package com.example.give2paybot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDTO {

    private static final String MESSAGE_ID_FIELD = "message_id";
    private static final String SENDER_ID = "sender_id";
    private static final String CHAT_FIELD = "chat";
    private static final String TEXT_FIELD = "text";
    private static final String PHOTOS_FIELD = "photos";
    private static final String CALL_BACK = "call_back";
    private static final String MESSAGE_TYPE = "message_type";


    private static final String REPLY_TO_MESSAGE_FIELD = "reply_to_message";

    @JsonProperty(MESSAGE_ID_FIELD)
    private String messageID;
    @JsonProperty(REPLY_TO_MESSAGE_FIELD)
    private String replyToMessage;

    @JsonProperty(SENDER_ID)
    private String from; ///< Optional. Sender, can be empty for messages sent to channels

    @JsonProperty(CHAT_FIELD)
    private String chatId;

    @JsonProperty(TEXT_FIELD)
    private String text; ///< Optional. For text messages, the actual UTF-8 text of the message

    @JsonProperty(PHOTOS_FIELD)
    private GroupPhotoDTO groupPhotoDTO;

    @JsonProperty(CALL_BACK)
    private String callBack;

    @JsonProperty(MESSAGE_TYPE)
    private MessageType messageType;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,
        CALL_BACK,
        REPLY,
    }

    public String getReplyToMessage() {
        return replyToMessage;
    }

    public void setReplyToMessage(String replyToMessage) {
        this.replyToMessage = replyToMessage;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public GroupPhotoDTO getGroupPhotoDTO() {
        return groupPhotoDTO;
    }

    public void setGroupPhotoDTO(GroupPhotoDTO groupPhotoDTO) {
        this.groupPhotoDTO = groupPhotoDTO;
    }

    public String getCallBack() {
        return callBack;
    }

    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessageID() {
        return messageID;
    }

    public void setMessageID(String messageID) {
        this.messageID = messageID;
    }
}
