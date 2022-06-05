package com.codewithmosh.mementoRefactor;

import java.util.Stack;

public class FontSizeHistory {
    private Stack<FontSizeState> history = new Stack<FontSizeState>();

    public void push(FontSizeState state) {
        history.push(state);
    }

    public FontSizeState pop() {
        return history.pop();
    }

}
