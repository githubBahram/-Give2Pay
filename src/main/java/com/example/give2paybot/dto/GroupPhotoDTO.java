package com.example.give2paybot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupPhotoDTO {
    private static final String CAPTION = "caption";
    private static final String PHOTOS = "photos";

    @JsonProperty(CAPTION)
    private String caption;

    @JsonProperty(PHOTOS)
    private List<Photo> photos;

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}
