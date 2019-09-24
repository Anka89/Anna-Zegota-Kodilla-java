package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(12);
        list.add(11);
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(list);
        System.out.println("Your even numbers from the list are : " + oddNumbersExterminator.exterminate(list));
        ArrayList<Integer> listToCompare = new ArrayList<Integer>();
            listToCompare.add(12);
            listToCompare.add(10);
            listToCompare.add(8);
            listToCompare.add(6);

            Assert.assertEquals(listToCompare, oddNumbersExterminator.exterminate(list));
        }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator(list);
        System.out.println( oddNumbersExterminator.exterminate(list));
        boolean isEmpty = list.isEmpty();

        Assert.assertEquals(true, list.isEmpty());
    }
}
