package com.codewithmosh.memento;

public class Content implements DocumentStateValue {
    private String content;

    public Content(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
