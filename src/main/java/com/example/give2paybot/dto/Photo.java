package com.example.give2paybot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Photo {
    public static final String PHOTO_FIELD = "file_id";
    public static final String PHOTO_URL = "url";

    @JsonProperty(PHOTO_FIELD)
    private String fileId;
    @JsonProperty(PHOTO_URL)
    private String url;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
