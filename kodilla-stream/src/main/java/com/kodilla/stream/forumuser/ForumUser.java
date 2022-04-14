package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int siganture;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int publishedPosts;

    public ForumUser(final int siganture,final String userName,final char sex, int yearOfBirth, int monthOfBirth
            , int dayOfBirth,final int publishedPosts) {
        this.siganture = siganture;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.publishedPosts = publishedPosts;
    }

    public int getSiganture() {
        return siganture;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        return siganture == forumUser.siganture;
    }

    @Override
    public int hashCode() {
        return siganture;
    }

    @Override
    public String toString() {
        return " " + userName +
                " {sex: " + sex +
                ", dateOfBirth: " + dateOfBirth +
                ", publishedPosts: " + publishedPosts + "}";
    }
}
