package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatingStatisticsTest {

    @Mock
    private Statistics statistics;

    @Test
    public void zeroPostsTest() {
        //GIVEN
        Calculating calculate = new Calculating();
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(List.of("Andy"));

        //WHEN
        calculate.calculateAdvStatistics(statistics);

        //THEN
        assertEquals(0,calculate.getNumberOfPosts());
        assertEquals(10,calculate.getNumberOfComments());
        assertEquals(1,calculate.getNumberOfUsers());
        assertEquals(0,calculate.getAveragePostsToUser());
        assertEquals(10,calculate.getAverageCommentsToUser());
        assertEquals(0,calculate.getAverageCommentsToPost());

    }

    @Test
    public void thousandPostsTest() {
        //GIVEN
        Calculating calculate = new Calculating();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(List.of("Andy"));

        //WHEN
        calculate.calculateAdvStatistics(statistics);

        //THEN
        assertEquals(1000,calculate.getNumberOfPosts());
        assertEquals(10,calculate.getNumberOfComments());
        assertEquals(1,calculate.getNumberOfUsers());
        assertEquals(1000,calculate.getAveragePostsToUser());
        assertEquals(10,calculate.getAverageCommentsToUser());
        assertEquals(0.01,calculate.getAverageCommentsToPost(),0.01);

    }

    @Test
    public void zeroCommentsTest() {
        //GIVEN
        Calculating calculate = new Calculating();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(List.of("Andy"));

        //WHEN
        calculate.calculateAdvStatistics(statistics);

        //THEN
        assertEquals(1000,calculate.getNumberOfPosts());
        assertEquals(0,calculate.getNumberOfComments());
        assertEquals(1,calculate.getNumberOfUsers());
        assertEquals(1000,calculate.getAveragePostsToUser());
        assertEquals(0,calculate.getAverageCommentsToUser());
        assertEquals(0,calculate.getAverageCommentsToPost());

    }

    @Test
    public void lessCommentsThenPostsTest() {
        //GIVEN
        Calculating calculate = new Calculating();
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(List.of("Andy"));

        //WHEN
        calculate.calculateAdvStatistics(statistics);

        //THEN
        assertEquals(1000,calculate.getNumberOfPosts());
        assertEquals(10,calculate.getNumberOfComments());
        assertEquals(1,calculate.getNumberOfUsers());
        assertEquals(1000,calculate.getAveragePostsToUser());
        assertEquals(10,calculate.getAverageCommentsToUser());
        assertEquals(0.01,calculate.getAverageCommentsToPost(), 0.01);

    }

    @Test
    public void moreCommentsThenPostsTest() {
        //GIVEN
        Calculating calculate = new Calculating();
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(List.of("Andy"));

        //WHEN
        calculate.calculateAdvStatistics(statistics);

        //THEN
        assertEquals(10,calculate.getNumberOfPosts());
        assertEquals(100,calculate.getNumberOfComments());
        assertEquals(1,calculate.getNumberOfUsers());
        assertEquals(10,calculate.getAveragePostsToUser());
        assertEquals(100,calculate.getAverageCommentsToUser());
        assertEquals(10.00,calculate.getAverageCommentsToPost(), 0.01);

    }

    @Test
    public void zeroUsersTest() {
        //GIVEN
        Calculating calculate = new Calculating();
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(new ArrayList<>());

        //WHEN
        calculate.calculateAdvStatistics(statistics);

        //THEN
        assertEquals(10,calculate.getNumberOfPosts());
        assertEquals(100,calculate.getNumberOfComments());
        assertEquals(0,calculate.getNumberOfUsers());
        assertEquals(0,calculate.getAveragePostsToUser());
        assertEquals(0,calculate.getAverageCommentsToUser());
        assertEquals(10.00,calculate.getAverageCommentsToPost(), 0.01);

    }

    @Test
    public void hundredUsersTest() {
        //GIVEN
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersList.add("User "+ i);
        }

        Calculating calculate = new Calculating();
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersList);

        //WHEN
        calculate.calculateAdvStatistics(statistics);

        //THEN
        assertEquals(10,calculate.getNumberOfPosts());
        assertEquals(100,calculate.getNumberOfComments());
        assertEquals(100,calculate.getNumberOfUsers());
        assertEquals(0.01,calculate.getAveragePostsToUser(), 0.01);
        assertEquals(1,calculate.getAverageCommentsToUser());
        assertEquals(10.00,calculate.getAverageCommentsToPost(), 0.01);

    }





}
