package com.codewithmosh.memento;

public class FontName implements DocumentStateValue {
    private String fontName;

    public FontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontName() {
        return fontName;
    }
}
