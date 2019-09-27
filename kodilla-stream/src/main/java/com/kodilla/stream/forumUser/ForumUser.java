package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {
    private final int identifier;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postNumber;

    public ForumUser(int identifier, String userName, char sex, LocalDate birthDate, int postNumber) {
        this.identifier = identifier;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postNumber = postNumber;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostNumber() {
        return postNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postNumber=" + postNumber +
                '}';
    }
}
