package com.metrica.vibely.model;

import java.util.List;

public record User(
        String userId,
        String email,
        String nickname,
        String password,
        Status status,
        java.time.LocalDate blockedDate,
        Integer logins,
        PrivacyType privacyType,
        List<User> followers,
        List<User> following
) {}
