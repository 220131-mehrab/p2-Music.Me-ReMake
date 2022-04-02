package com.revature.p2musicme.chat;

import com.revature.p2musicme.chat.enumeration.MessageType;

import javax.persistence.*;

@Entity
@Table(name = "messanger")
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "content")
    private String content;
    @Column(unique = true, nullable = false)
    private String sender;

    private MessageType type;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}