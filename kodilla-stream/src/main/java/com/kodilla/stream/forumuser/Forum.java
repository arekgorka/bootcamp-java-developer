package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(001, "John", 'M', 2007,02,15, 17));
        forumUserList.add(new ForumUser(002, "Marc", 'M', 2000,11,01, 42));
        forumUserList.add(new ForumUser(003, "Dan", 'M', 1983,04,14, 0));
        forumUserList.add(new ForumUser(004, "Bruce", 'M', 1991,10,12, 855));
        forumUserList.add(new ForumUser(005, "Clara", 'F', 2003,04,27, 15));
        forumUserList.add(new ForumUser(006, "Sophie", 'F', 2010,03,22, 10));
        forumUserList.add(new ForumUser(007, "Martha", 'F', 1987,03,05, 7));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }

}
