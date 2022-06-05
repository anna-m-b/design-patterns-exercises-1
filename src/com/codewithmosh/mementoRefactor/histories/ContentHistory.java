package com.codewithmosh.mementoRefactor.histories;

import com.codewithmosh.mementoRefactor.states.ContentState;

import java.util.Stack;

public class ContentHistory {
    private final Stack<ContentState> history = new Stack<ContentState>();

    public void push(ContentState state) {
        this.history.push(state);
    }

    public ContentState pop() {
        return this.history.pop();
    }
}
