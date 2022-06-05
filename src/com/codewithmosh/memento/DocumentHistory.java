package com.codewithmosh.memento;

import java.util.Stack;

public class DocumentHistory {
    private Stack<DocumentState> states = new Stack<DocumentState>();

    public void push(DocumentState state) {
        states.push(state);
    }

    public DocumentState pop() {
        return states.pop();
    }
}
