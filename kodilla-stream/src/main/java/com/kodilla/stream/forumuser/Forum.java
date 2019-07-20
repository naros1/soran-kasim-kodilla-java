package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {

        forumUsersList.add(new ForumUser(0001, "User1", 'M', LocalDate.of(1978,12,10), 124));
        forumUsersList.add(new ForumUser(0002, "User2", 'M', LocalDate.of(2000,12,10), 123));
        forumUsersList.add(new ForumUser(0003, "User3", 'F', LocalDate.of(1995,12,10), 456));
        forumUsersList.add(new ForumUser(0004, "User4", 'M', LocalDate.of(1999,12,10), 789));
        forumUsersList.add(new ForumUser(0005, "User5", 'F', LocalDate.of(2002,12,10), 562));
        forumUsersList.add(new ForumUser(0006, "User6", 'M', LocalDate.of(2010,12,10), 258));
        forumUsersList.add(new ForumUser(0007, "User7", 'M', LocalDate.of(1996,12,10), 0));
    }

    public List<ForumUser> getList(){
        return new ArrayList<>(forumUsersList);
    }
}
