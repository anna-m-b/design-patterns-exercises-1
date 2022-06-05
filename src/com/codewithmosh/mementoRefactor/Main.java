package com.codewithmosh.mementoRefactor;

import com.codewithmosh.mementoRefactor.histories.ContentHistory;
import com.codewithmosh.mementoRefactor.histories.FontNameHistory;
import com.codewithmosh.mementoRefactor.histories.FontSizeHistory;
import com.codewithmosh.mementoRefactor.states.ContentState;
import com.codewithmosh.mementoRefactor.states.FontNameState;
import com.codewithmosh.mementoRefactor.states.FontSizeState;

public class Main {
    public static void main(String[] args) {
        var doc = new Document();
        var contentHistory = new ContentHistory();
        var fontNameHistory = new FontNameHistory();
        var fontSizeHistory = new FontSizeHistory();

        System.out.println(doc.toString());

        updateDocumentContent("one", contentHistory, doc);
        System.out.println(doc.toString());

        updateDocumentContent("two", contentHistory, doc);
        System.out.println(doc.toString());

        updateDocumentContent("three", contentHistory, doc);
        System.out.println(doc.toString());

        updateDocumentFontSize(14, fontSizeHistory, doc);
        System.out.println(doc.toString());

        updateDocumentFontSize(6, fontSizeHistory, doc);
        System.out.println(doc.toString());

        updateDocumentFontName("Fira", fontNameHistory, doc);
        System.out.println(doc.toString());

        updateDocumentFontName("Mono", fontNameHistory, doc);
        System.out.println(doc.toString());

        doc.restoreContent(contentHistory.pop().getContent());
        System.out.println(doc.toString());

        doc.restoreContent(contentHistory.pop().getContent());
        System.out.println(doc.toString());

        doc.restoreContent(contentHistory.pop().getContent());
        System.out.println(doc.toString());

        doc.restoreFontName(fontNameHistory.pop().getFontName());
        System.out.println(doc.toString());

        doc.restoreFontName(fontNameHistory.pop().getFontName());
        System.out.println(doc.toString());

        doc.restoreFontSize(fontSizeHistory.pop().getFontSize());
        System.out.println(doc.toString());

        doc.restoreFontSize(fontSizeHistory.pop().getFontSize());
        System.out.println(doc.toString());

    }


    private static void updateDocumentContent(String content, ContentHistory history, Document doc){
        history.push(new ContentState(doc.getContent()));
        doc.setContent(content);
    }

    private static void updateDocumentFontName(String name, FontNameHistory history, Document doc){
        history.push(new FontNameState(doc.getFontName()));
        doc.setFontName(name);
    }

    private static void updateDocumentFontSize(Integer size, FontSizeHistory history, Document doc){
        history.push(new FontSizeState(doc.getFontSize()));
        doc.setFontSize(size);
    }
}
