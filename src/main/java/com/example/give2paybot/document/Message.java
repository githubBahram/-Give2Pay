package com.example.give2paybot.document;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    private static final String MESSAGEID_FIELD = "message_id";
    private static final String FROM_FIELD = "from";
    private static final String DATE_FIELD = "date";
    private static final String CHAT_FIELD = "chat";
    private static final String TEXT_FIELD = "text";
    private static final String AUDIO_FIELD = "audio";
    private static final String DOCUMENT_FIELD = "document";
    private static final String PHOTO_FIELD = "photo";
    private static final String STICKER_FIELD = "sticker";
    private static final String VIDEO_FIELD = "video";
    private static final String REPLYTOMESSAGE_FIELD = "reply_to_message";
    private static final String VOICE_FIELD = "voice";
    private static final String CAPTION_FIELD = "caption";
    private static final String GAME_FIELD = "game";

    @JsonProperty(MESSAGEID_FIELD)
    private Integer messageId;
}

//    @JsonProperty(FROM_FIELD)
//    private User from; ///< Optional. Sender, can be empty for messages sent to channels
//    @JsonProperty(DATE_FIELD)
//    private Integer date; ///< Optional. Date the message was sent in Unix time
//    @JsonProperty(CHAT_FIELD)
//    private Chat chat; ///< Conversation the message belongs to
//}
