package com.codewithmosh.mementoRefactor.states;

public class FontNameState {
    private final String fontName;

    public FontNameState(String fontName){
        this.fontName = fontName;
    }

    public String getFontName() {
        return this.fontName;
    }
}
