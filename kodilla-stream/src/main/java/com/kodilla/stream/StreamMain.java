package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForuUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getMale() == 'M')
                .filter(forumUser -> forumUser.getYearOfBirth().getYear() <= 1999 )
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements :" + theResultMapOfForuUsers.size());
        theResultMapOfForuUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);



    }
}






