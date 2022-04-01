package com.revature.p2musicme.chat.enumeration;

public enum MessageType {
    CHAT("CHAT"),
    LEAVE("LEAVE"),
    JOIN("JOIN");
    private final String message;

    MessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
