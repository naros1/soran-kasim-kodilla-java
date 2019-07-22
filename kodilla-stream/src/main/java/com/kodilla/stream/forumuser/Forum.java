package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {

    private final List<ForumUser> users;

    public Forum(final List<ForumUser> users) {
        this.users = new ArrayList<ForumUser>(users);
    }




    public List<ForumUser> getList(){
        return new ArrayList<>(users);
    }
}
