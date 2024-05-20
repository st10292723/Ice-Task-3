package com.mycompany.icetask3;


//Question 3:


 public class GCD {
    public static int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(greatestCommonDivisor(10, 15));  // Output: 5
        System.out.println(greatestCommonDivisor(54, 24));  // Output: 6
    }
}
    
