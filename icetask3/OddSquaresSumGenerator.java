package com.mycompany.icetask3;


//Question 2:

import java.util.Iterator;

   

public class OddSquaresSumGenerator implements Iterator<Long> {
    private long currentOdd = 1;
    private long currentSum = 0;

    @Override
    public boolean hasNext() {
        return true; // Infinite generator
    }

    @Override
    public Long next() {
        currentSum += currentOdd * currentOdd;
        currentOdd += 2;
        return currentSum;
    }

    public static void main(String[] args) {
        OddSquaresSumGenerator generator = new OddSquaresSumGenerator();

        // Generate the first 10 values
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }
    }
}
    

