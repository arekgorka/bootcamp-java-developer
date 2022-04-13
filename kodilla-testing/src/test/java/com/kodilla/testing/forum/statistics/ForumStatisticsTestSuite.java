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

    private List<Post> generateListOfNPost(int postsQuantity) {
        List<Post> resultList = new ArrayList<>();
        for(int n = 1; n <= postsQuantity; n++) {
            Post thePost = new Post("Post" + n);
            resultList.add(thePost);
        }
        return resultList;
    }

    private List<Comment> generateListOfNComments(int commentsQuantity) {
        List<Comment> resultList = new ArrayList<>();
        for(int n = 1; n <= commentsQuantity; n++) {
            Comment theComment = new Comment("Comment" + n);
            resultList.add(theComment);
        }
        return resultList;
    }

    @Mock
    private Statistics statisticsMock;


    @Test
    void amountOfPostsIs0() {
        //Given
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<Post> listWith0Posts = new ArrayList<>();
        List<String> listUser = generateListOfNUser(50);
        List<Comment> listComment = generateListOfNComments(160);
        when(statisticsMock.postsCount()).thenReturn(listWith0Posts.size());
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(listComment.size());

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
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<Post> listWith1000Posts = generateListOfNPost(1000);
        List<String> listUser = generateListOfNUser(20);
        List<Comment> listComment = generateListOfNComments(160);
        when(statisticsMock.postsCount()).thenReturn(listWith1000Posts.size());
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(listComment.size());
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
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<Comment> listWith0Comments = new ArrayList<>();
        List<Post> listPost = generateListOfNPost(70);
        List<String> listUser = generateListOfNUser(20);
        when(statisticsMock.postsCount()).thenReturn(listPost.size());
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(listWith0Comments.size());
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
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<Post> listPosts = generateListOfNPost(1000);
        List<String> listUser = generateListOfNUser(20);
        List<Comment> listComment = generateListOfNComments(160);
        when(statisticsMock.postsCount()).thenReturn(listPosts.size());
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(listComment.size());
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
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<Post> listPosts = generateListOfNPost(120);
        List<String> listUser = generateListOfNUser(5);
        List<Comment> listComment = generateListOfNComments(1600);
        when(statisticsMock.postsCount()).thenReturn(listPosts.size());
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(listComment.size());
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
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<String> listWith0User = new ArrayList<>();
        List<Post> listPosts = generateListOfNPost(120);
        List<Comment> listComment = generateListOfNComments(150);
        when(statisticsMock.postsCount()).thenReturn(listPosts.size());
        when(statisticsMock.usersNames()).thenReturn(listWith0User);
        when(statisticsMock.commentsCount()).thenReturn(listComment.size());
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
        ForumStatistic forumStatistic = new ForumStatistic(statisticsMock);
        List<Post> listPosts = generateListOfNPost(120);
        List<String> listUser = generateListOfNUser(100);
        List<Comment> listComment = generateListOfNComments(1500);
        when(statisticsMock.postsCount()).thenReturn(listPosts.size());
        when(statisticsMock.usersNames()).thenReturn(listUser);
        when(statisticsMock.commentsCount()).thenReturn(listComment.size());
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
