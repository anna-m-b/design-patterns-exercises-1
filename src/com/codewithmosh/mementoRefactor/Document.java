package com.codewithmosh.mementoRefactor;

public class Document {
    private String content = "";
    private String fontName = "Arial";
    private Integer fontSize = 10;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) { this.content = content; }

    public String getFontName() { return this.fontName; }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public Integer getFontSize() {
        return this.fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public void restoreContent(String content) {
        setContent(content);
    }

    public void restoreFontName(String fontName) { setFontName(fontName); }

    public void restoreFontSize(Integer fontSize) {
        setFontSize(fontSize);
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
