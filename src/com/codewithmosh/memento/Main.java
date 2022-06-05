package com.codewithmosh.memento;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
          var doc = new Document();
          var contentHistory = new DocumentHistory();
          var fontNameHistory = new DocumentHistory();
          var fontSizeHistory = new DocumentHistory();

          doc.setFontName(new FontName("Fira"));
          doc.setFontSize(new FontSize(12));
          doc.setContent(new Content("one"));
          System.out.println(doc.toString());

          contentHistory.push(doc.createContentState());
          fontNameHistory.push(doc.createFontNameState());
          fontSizeHistory.push(doc.createFontSizeState());

          doc.setContent(new Content("two"));
          doc.setFontName(new FontName("Mono"));
          doc.setFontSize(new FontSize(11));
          System.out.println(doc.toString());

          contentHistory.push(doc.createContentState());
          fontNameHistory.push(doc.createFontNameState());
          fontSizeHistory.push(doc.createFontSizeState());

          doc.setContent(new Content("three"));
          doc.setFontName(new FontName("Fancy"));
          doc.setFontSize(new FontSize(9));
          System.out.println(doc.toString());

          doc.restoreContent((Content)contentHistory.pop().getValue("content"));
          doc.restoreFontName((FontName)fontNameHistory.pop().getValue("fontName"));
          doc.restoreFontSize((FontSize)fontSizeHistory.pop().getValue("fontSize"));

          System.out.println(doc.toString());

          doc.restoreContent((Content)contentHistory.pop().getValue("content"));
          doc.restoreFontName((FontName)fontNameHistory.pop().getValue("fontName"));
          doc.restoreFontSize((FontSize)fontSizeHistory.pop().getValue("fontSize"));
          System.out.println(doc.toString());

    }
}
