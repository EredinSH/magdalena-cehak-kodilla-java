package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(001,"Levi",'M',1988,12,25,12));
        theForumUserList.add(new ForumUser(002,"Mikasa",'F',2002,1,10,0));
        theForumUserList.add(new ForumUser(003,"Reiner",'M',2000,8,1,7));
        theForumUserList.add(new ForumUser(004,"Erwin",'M',1981,10,14,27));
        theForumUserList.add(new ForumUser(005,"Zeke",'M',1996,8,1,0));
        theForumUserList.add(new ForumUser(006,"Hange",'F',1990,9,5,33));
        theForumUserList.add(new ForumUser(007,"Sasha",'F',2002,6,26,5));
        theForumUserList.add(new ForumUser(010,"Eren",'M',2002,3,30,22));
        theForumUserList.add(new ForumUser(011,"Armin",'M',2002,11,3,12));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }

}
