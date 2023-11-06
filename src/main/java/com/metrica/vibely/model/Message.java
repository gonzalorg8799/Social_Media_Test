package com.metrica.vibely.model;

public class Message {
    
    // <<-FIELDS->>
    private Chat chatOwner;
    private String srcUsername;
    private String content;
    
    // <<-CONSTRUCTORS->>
    public Message() {
    }
    
    public Message(
            Chat chatOwner,
            String srcUsername,
            String content) {
        this.setChatOwnerId(chatOwner);
        this.setSrcUsername(srcUsername);
        this.setContent(content);
    }

    // <<-GETTERS & SETTERS->>
    public Chat getChatOwner() {
        return chatOwner;
    }

    public void setChatOwnerId(Chat chatOwner) {
        this.chatOwner = chatOwner;
    }

    public String getSrcUsername() {
        return srcUsername;
    }

    public void setSrcUsername(String srcUsername) {
        this.srcUsername = srcUsername;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
}
