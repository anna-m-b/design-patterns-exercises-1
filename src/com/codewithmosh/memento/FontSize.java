package com.codewithmosh.memento;

public class FontSize implements DocumentStateValue {
    private int fontSize;

    public FontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public int getFontSize() {
        return fontSize;
    }
}
