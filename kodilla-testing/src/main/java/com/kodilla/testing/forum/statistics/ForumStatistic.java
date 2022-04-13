package com.kodilla.testing.forum.statistics;

public class ForumStatistic {

    private double usersAmount;
    private double postsAmount;
    private double commentsAmount;
    private double meanPostsPerUser;
    private double meanCommentsPerUser;
    private double meanCommentsPerPost;
    private Statistics statistics;

    public ForumStatistic(Statistics statistics) {
        this.statistics = statistics;
    }


    public void calculateAdvStatistics(Statistics statistics) {

        usersAmount = statistics.usersNames().size();
        postsAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();
        if (usersAmount>0) {
            meanPostsPerUser = postsAmount/usersAmount;
            meanCommentsPerUser = commentsAmount/usersAmount;
        } else {
            meanPostsPerUser = 0;
            meanCommentsPerUser = 0;
        }
        if (postsAmount>0) {
            meanCommentsPerPost = commentsAmount/postsAmount;
        } else {
            meanCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Amount of user: " + usersAmount);
        System.out.println("Amount of post: " + postsAmount);
        System.out.println("Amount of comment: " + commentsAmount);
        System.out.println("Mean posts per user: " + meanPostsPerUser);
        System.out.println("Mean comments per user: " + meanCommentsPerUser);
        System.out.println("Mean comments per post: " + meanCommentsPerPost);
    }

    public double getUsersAmount() {
        return usersAmount;
    }

    public double getPostsAmount() {
        return postsAmount;
    }

    public double getCommentsAmount() {
        return commentsAmount;
    }

    public double getMeanPostsPerUser() {
        return meanPostsPerUser;
    }

    public double getMeanCommentsPerUser() {
        return meanCommentsPerUser;
    }

    public double getMeanCommentsPerPost() {
        return meanCommentsPerPost;
    }
}
