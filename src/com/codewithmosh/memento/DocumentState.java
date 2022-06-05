package com.codewithmosh.memento;

import java.util.HashMap;

public class DocumentState {
    private final HashMap<String, DocumentStateValue> state = new HashMap<String, DocumentStateValue>();

    public DocumentState(String key, DocumentStateValue value) {
        state.put(key, value);
    }

    public DocumentStateValue getValue(String key) {
        var v = this.state.get(key);
        return (DocumentStateValue) v;
    }

}
