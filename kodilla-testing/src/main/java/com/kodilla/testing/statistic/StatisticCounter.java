package com.kodilla.testing.statistic;

public class StatisticCounter {
    Statistic statistic;
    int userNumberForStatictic;
    int commentNumberForStatictic;
    int postNumberForStatictic;
    double avaregePosts;
    double avaregComments;
    double avaregeCommentsPerPost;

    public StatisticCounter(Statistic statistic) {
        this.statistic = statistic;
    }

    public void calculateAdvStatistic (Statistic statistic) {
        userNumberForStatictic = statistic.usersNames().size();
        commentNumberForStatictic = statistic.commentsCount();
        postNumberForStatictic = statistic.postsCount();
        avaregePosts = (double) postNumberForStatictic / userNumberForStatictic;
        avaregComments = (double) commentNumberForStatictic / userNumberForStatictic;
        avaregeCommentsPerPost = (double) commentNumberForStatictic / postNumberForStatictic;
    }
    public  int getuUerNumberForStatictic () {
        return  userNumberForStatictic;
    }
    public int getCommentNumberForStatictic () {
        return  commentNumberForStatictic;
    }
    public int getPostNumberForStatictic () {
        return postNumberForStatictic;
    }
    public double getAvaregePosts () {
        return avaregePosts;
    }
    public double getAvaregComments () {
        return avaregComments;
    }
    public double getAvaregeCommentsPerPost () {
        return avaregeCommentsPerPost;
    }

    public void showStatistic () {
        System.out.println("Numbers of users : " + userNumberForStatictic);
        System.out.println("Numbers of posts : " + commentNumberForStatictic);
        System.out.println("Numbers of comments : " + postNumberForStatictic);
        System.out.println("The average numbers of posts per user : " + avaregePosts);
        System.out.println("The average number of comments per person : " + avaregComments);
        System.out.println("The average number of comments per post : " + avaregeCommentsPerPost);
    }
}
