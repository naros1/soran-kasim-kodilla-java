package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char male;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int id,final String userName,final char male,final LocalDate dateOfBirth,final int numberOfPosts) {
        this.id = id;
        this.userName = userName;
        this.male = male;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getMale() {
        return male;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", male=" + male +
                ", yearOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (id != forumUser.id) return false;
        if (male != forumUser.male) return false;
        if (numberOfPosts != forumUser.numberOfPosts) return false;
        if (!userName.equals(forumUser.userName)) return false;
        return dateOfBirth.equals(forumUser.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userName.hashCode();
        result = 31 * result + (int) male;
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + numberOfPosts;
        return result;
    }
}
