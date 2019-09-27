package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Misiek", 'M', LocalDate.of(1975, Month.JANUARY, 2),4));
        userList.add(new ForumUser(2, "Kamil", 'M', LocalDate.of(1999, Month.FEBRUARY, 4),8));
        userList.add(new ForumUser(3, "Bartosz", 'M', LocalDate.of(2001, Month.MARCH, 6),12));
        userList.add(new ForumUser(4, "Tuśka", 'F', LocalDate.of(2006, Month.APRIL, 8),16));
        userList.add(new ForumUser(5, "Marta", 'F', LocalDate.of(1995, Month.MAY, 10),20));
        userList.add(new ForumUser(6, "Piotrek", 'M', LocalDate.of(1998, Month.JUNE, 12),24));
        userList.add(new ForumUser(7, "Ola", 'F', LocalDate.of(1989, Month.JULY, 14),28));
        userList.add(new ForumUser(8, "Budyń", 'M', LocalDate.of(2001, Month.AUGUST, 16),32));
        userList.add(new ForumUser(9, "Mariola", 'F', LocalDate.of(1993, Month.SEPTEMBER, 18),36));
        userList.add(new ForumUser(10, "Amelia", 'F', LocalDate.of(1999, Month.OCTOBER, 20),40));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<ForumUser>(userList);
    }
}
