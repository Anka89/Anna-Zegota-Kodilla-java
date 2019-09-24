
package com.kodilla.testing.statistic;

import java.util.ArrayList;

public interface Statistic {

    ArrayList<String> usersNames(); // list of users names
    int postsCount();          // total quantity of forum posts
    int commentsCount();       // total quantity of forum comments
}