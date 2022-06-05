package com.codewithmosh.memento;

import javax.print.Doc;

public class Document {
    private Content content;
    private FontName fontName;
    private FontSize fontSize;

    public DocumentState createContentState() {
        return new DocumentState("content", content);
    }

    public DocumentState createFontNameState() {
        return new DocumentState("fontName", fontName);
    }

    public DocumentState createFontSizeState() {
        return new DocumentState("fontSize", fontSize);
    }

    public void restoreContent(Content state) {
        setContent(state);
    }

    public void restoreFontName(FontName state) {
        setFontName(state);
    }

    public void restoreFontSize(FontSize state) {
        setFontSize(state);
    }

    public String getContent() {
        return content.getContent();
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName.getFontName();
    }

    public void setFontName(FontName fontName) {
        this.fontName = fontName;
    }

    public Integer getFontSize() {
        return fontSize.getFontSize();
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content.getContent() + '\'' +
                ", fontName='" + fontName.getFontName() + '\'' +
                ", fontSize=" + fontSize.getFontSize() +
                '}';
    }
}
