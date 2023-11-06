package com.metrica.vibely.model;

import java.util.List;

import com.metrica.vibely.model.enumerator.PrivacyType;
import com.metrica.vibely.model.enumerator.Status;

public class Admin extends User {
    
    // <<-CONSTRUCTORS->>
    public Admin() {
        this.setUserId();
    }

    public Admin(
            java.util.UUID userId,
            String username,
            String password,
            String nickname,
            String email,
            List<User> followers,
            List<User> following,
            List<Chat> chats,
            List<Post> posts,
            PrivacyType privacyType,
            Status status,
            Integer logins,
            java.time.LocalDate blockedDate) {
        this.setUserId(userId);
        this.setUsername(username);
        this.setPassword(password);
        this.setNickname(nickname);
        this.setEmail(email);
        this.setFollowers(followers);
        this.setFollowing(following);
        this.setPosts(posts);
        this.setChats(chats);
        this.setPrivacyType(privacyType);
        this.setStatus(status);
        this.setLogins(logins);
        this.setBlockedDate(blockedDate);
    }
    
}
