package com.kda.collection.DZ2;

import java.util.List;

public class Chat {

    private String chatName;
    private List<User> user;

    public Chat(String chatName, List<User> user){
        this.chatName = chatName;
        this.user = user;

    }

    public String getChatName() {
        return chatName;
    }

    public List<User> getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "chatName='" + chatName + '\'' +
                ", user=" + user +
                '}';
    }
}
