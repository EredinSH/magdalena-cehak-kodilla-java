package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = forum.getUserList().stream()
                .filter(user -> user.getUserSex() == 'M')
                .filter(user -> user.getDateOfBirth().getYear() <= 2001)
                .filter(user -> user.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, user -> user));

        System.out.println("# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .forEach(System.out::println);

    }

}
