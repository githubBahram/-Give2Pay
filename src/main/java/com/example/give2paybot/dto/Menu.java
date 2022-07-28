package com.example.give2paybot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Menu {
    private static final String KEYBOARD_FIELD = "keyboard";

    @JsonProperty(KEYBOARD_FIELD)
    private List<List<Button>> keyboard;

    public List<List<Button>> getKeyboard() {
        return keyboard;
    }

    public Menu setKeyboard(List<List<Button>> keyboard) {
        this.keyboard = keyboard;
        return this;
    }

}
