package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

import java.util.ArrayList;
import java.util.List;

public class Calculating {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsToUser;
    private double averageCommentsToUser;
    private double averageCommentsToPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsToUser() {
        return averagePostsToUser;
    }

    public double getAverageCommentsToUser() {
        return averageCommentsToUser;
    }

    public double getAverageCommentsToPost() {
        return averageCommentsToPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers != 0 && numberOfPosts != 0) {
            averagePostsToUser = numberOfPosts / numberOfUsers;
        } else {
            averagePostsToUser = 0;
        }

        if (numberOfPosts != 0 && numberOfComments != 0) {
            averageCommentsToPost = numberOfComments / numberOfPosts;
        } else {
            averageCommentsToPost = 0;
        }

        if (numberOfComments != 0 && numberOfUsers != 0) {
            averageCommentsToUser = numberOfComments / numberOfUsers;
        } else {
            averageCommentsToUser = 0;
        }

    }

    public void showStatistics() {

        System.out.println("Number of users = " + numberOfUsers);
        System.out.println("Number of posts = " + numberOfPosts);
        System.out.println("Number of comments = " + numberOfComments);
        System.out.println("Average posts to user = " + averagePostsToUser);
        System.out.println("Average comments to user = " + averageCommentsToUser);
        System.out.println("Average comments to post = " + averageCommentsToPost);

    }
}
