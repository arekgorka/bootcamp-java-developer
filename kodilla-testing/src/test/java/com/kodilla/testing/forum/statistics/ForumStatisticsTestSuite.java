package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    private List<String> generateListOfNUser(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for(int n = 1; n <= usersQuantity; n++) {
            String theUser = ("Name" + n);
            resultList.add(theUser);
        }
        return resultList;
    }

    @Mock
    private Statistics statisticsMock;


    @Test
    void amountOfPostsIs0() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> listUser = generateListOfNUser(50);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(160);

        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        double resultMeanPostPerUser = forumStatistic.getMeanPostsPerUser();
        double resultMeanCommentsPerUser = forumStatistic.getMeanCommentsPerUser();
        double resultMeanCommentsPerPost = forumStatistic.getMeanCommentsPerPost();
        forumStatistic.showStatistics();

        //Then
        Assertions.assertEquals(0,resultMeanPostPerUser);
        Assertions.assertEquals(3.2,resultMeanCommentsPerUser);
        Assertions.assertEquals(0,resultMeanCommentsPerPost);
    }

    @Test
    void amountOfPostsIs1000() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> listUser = generateListOfNUser(20);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(160);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        double resultMeanPostPerUser = forumStatistic.getMeanPostsPerUser();
        double resultMeanCommentsPerUser = forumStatistic.getMeanCommentsPerUser();
        double resultMeanCommentsPerPost = forumStatistic.getMeanCommentsPerPost();
        forumStatistic.showStatistics();

        //Then
        Assertions.assertEquals(50,resultMeanPostPerUser);
        Assertions.assertEquals(8,resultMeanCommentsPerUser);
        Assertions.assertEquals(0.16,resultMeanCommentsPerPost);
    }

    @Test
    void amountOfCommentsIs0() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> listUser = generateListOfNUser(20);
        when(statisticsMock.postsCount()).thenReturn(70);
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        double resultMeanPostPerUser = forumStatistic.getMeanPostsPerUser();
        double resultMeanCommentsPerUser = forumStatistic.getMeanCommentsPerUser();
        double resultMeanCommentsPerPost = forumStatistic.getMeanCommentsPerPost();
        forumStatistic.showStatistics();

        //Then
        Assertions.assertEquals(3.5,resultMeanPostPerUser);
        Assertions.assertEquals(0,resultMeanCommentsPerUser);
        Assertions.assertEquals(0,resultMeanCommentsPerPost);
    }

    @Test
    void amountOfCommentsIsLessThanPosts() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> listUser = generateListOfNUser(20);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(160);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        double resultMeanPostPerUser = forumStatistic.getMeanPostsPerUser();
        double resultMeanCommentsPerUser = forumStatistic.getMeanCommentsPerUser();
        double resultMeanCommentsPerPost = forumStatistic.getMeanCommentsPerPost();
        forumStatistic.showStatistics();

        //Then
        Assertions.assertEquals(50,resultMeanPostPerUser);
        Assertions.assertEquals(8,resultMeanCommentsPerUser);
        Assertions.assertEquals(0.16,resultMeanCommentsPerPost);
    }

    @Test
    void amountOfCommentsIsMoreThanPosts() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> listUser = generateListOfNUser(5);
        when(statisticsMock.postsCount()).thenReturn(120);
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(1600);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        double resultMeanPostPerUser = forumStatistic.getMeanPostsPerUser();
        double resultMeanCommentsPerUser = forumStatistic.getMeanCommentsPerUser();
        double resultMeanCommentsPerPost = forumStatistic.getMeanCommentsPerPost();
        forumStatistic.showStatistics();

        //Then
        Assertions.assertEquals(24.0,resultMeanPostPerUser);
        Assertions.assertEquals(320.0,resultMeanCommentsPerUser);
        Assertions.assertEquals(13.333333333333334,resultMeanCommentsPerPost);
    }

    @Test
    void amountOfUsersIs0() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> listWith0User = new ArrayList<>();
        when(statisticsMock.postsCount()).thenReturn(120);
        when(statisticsMock.usersNames()).thenReturn(listWith0User);
        when(statisticsMock.commentsCount()).thenReturn(150);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        double resultMeanPostPerUser = forumStatistic.getMeanPostsPerUser();
        double resultMeanCommentsPerUser = forumStatistic.getMeanCommentsPerUser();
        double resultMeanCommentsPerPost = forumStatistic.getMeanCommentsPerPost();
        forumStatistic.showStatistics();

        //Then
        Assertions.assertEquals(0,resultMeanPostPerUser);
        Assertions.assertEquals(0,resultMeanCommentsPerUser);
        Assertions.assertEquals(1.25,resultMeanCommentsPerPost);
    }

    @Test
    void amountOfUsersIs100() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic();
        List<String> listUser = generateListOfNUser(100);
        when(statisticsMock.postsCount()).thenReturn(120);
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(1500);
        //when
        forumStatistic.calculateAdvStatistics(statisticsMock);
        double resultMeanPostPerUser = forumStatistic.getMeanPostsPerUser();
        double resultMeanCommentsPerUser = forumStatistic.getMeanCommentsPerUser();
        double resultMeanCommentsPerPost = forumStatistic.getMeanCommentsPerPost();
        forumStatistic.showStatistics();

        //Then
        Assertions.assertEquals(1.2,resultMeanPostPerUser);
        Assertions.assertEquals(15.0,resultMeanCommentsPerUser);
        Assertions.assertEquals(12.5,resultMeanCommentsPerPost);
    }
}
