package com.kodilla.testing.statistic;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.*;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class StatisticCounterTestSuit {

    @Test
    public void testCalculateAdvStatistic() {
        //Given
        Statistic statistic= Mockito.mock(Statistic.class);
        ArrayList<String> userNumbers = new ArrayList<>();
        for(int n = 0; n < 1000; n++) {
            userNumbers.add("Anna" + n);
        }
        when(statistic.usersNames()).thenReturn(userNumbers);

        int postNumber = 100;
        when(statistic.postsCount()).thenReturn((postNumber));

        int commentsNumber = 5000;
        when(statistic.commentsCount()).thenReturn(commentsNumber);

        StatisticCounter statisticCounter = new StatisticCounter(statistic);
        statisticCounter.calculateAdvStatistic(statistic);

        //When
        int usersNamesTestNumbers = statisticCounter.getuUerNumberForStatictic();
        int postsTestNumbers = statisticCounter.getPostNumberForStatictic();
        int commentsTestNumbers = statisticCounter.getCommentNumberForStatictic();
        double averagePostsTestNumbers = statisticCounter.getAvaregePosts();
        double averageCommentsTestNumbers = statisticCounter.getAvaregComments();
        double averageCommentsPerPostTestNumbers = statisticCounter.getAvaregeCommentsPerPost();
        statisticCounter.showStatistic();


        //Then
        Assert.assertEquals(1000, usersNamesTestNumbers);
        Assert.assertEquals(5000, commentsTestNumbers);
        Assert.assertEquals(100, postsTestNumbers);
        Assert.assertEquals(0.1,  averagePostsTestNumbers, 0.1);
        Assert.assertEquals(5.0 , averageCommentsTestNumbers, 0.1);
        Assert.assertEquals(50.0 , averageCommentsPerPostTestNumbers, 0.1);

    }
}
