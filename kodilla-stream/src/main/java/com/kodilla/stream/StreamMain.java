package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

       List<ForumUser> forumUsersList = new ArrayList<>();

        forumUsersList.add(new ForumUser(0001, "User1", 'M', LocalDate.of(1978,12,10), 124));
        forumUsersList.add(new ForumUser(0002, "User2", 'M', LocalDate.of(2000,12,10), 123));
        forumUsersList.add(new ForumUser(0003, "User3", 'F', LocalDate.of(1995,12,10), 456));
        forumUsersList.add(new ForumUser(0004, "User4", 'M', LocalDate.of(1999,12,10), 789));
        forumUsersList.add(new ForumUser(0005, "User5", 'F', LocalDate.of(2002,12,10), 562));
        forumUsersList.add(new ForumUser(0006, "User6", 'M', LocalDate.of(2010,12,10), 258));
        forumUsersList.add(new ForumUser(0007, "User7", 'M', LocalDate.of(1996,12,10), 0));

        Forum theForum = new Forum(forumUsersList);

        Map<Integer, ForumUser> theResultMapOfForuUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getMale() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isAfter(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements :" + theResultMapOfForuUsers.size());
        theResultMapOfForuUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}






