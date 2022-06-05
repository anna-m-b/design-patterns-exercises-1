package com.codewithmosh.mementoRefactor;

import java.util.Stack;

public class FontNameHistory {
    private final Stack<FontNameState> history = new Stack<FontNameState>();

    public void push(FontNameState state) {
        this.history.push(state);
    }

    public FontNameState pop() {
        return this.history.pop();
    }
}
