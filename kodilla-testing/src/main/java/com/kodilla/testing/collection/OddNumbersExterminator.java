package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    private ArrayList<Integer> evenNumbers;

    public OddNumbersExterminator(ArrayList<Integer> numbers) {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
            evenNumbers = new ArrayList<>();
        if(numbers.isEmpty()){
            System.out.println("Your list is empty");
            return new ArrayList<Integer>();
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if ((numbers.get(i) % 2) == 0) {
                    evenNumbers.add(numbers.get(i));
                }
            }
            return evenNumbers;
        }
    }
}
