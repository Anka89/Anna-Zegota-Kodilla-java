package com.kodilla.testing.statistic;

import java.util.ArrayList;

public class StatisticMock implements Statistic {

    @Override
    public ArrayList<String> usersNames() {
        ArrayList<String> userNumbers = new ArrayList<String>();

        for(int n = 0; n < 1000; n++) {
            userNumbers.add("Anna" + n);
        }
        return userNumbers;
    }
    @Override
    public int postsCount() {
        int postNumber = 1000;
        return postNumber;
    }
    @Override
    public int commentsCount() {
        int commentsNumber = 0;
        return commentsNumber;
    }
}
