package org.example;

import java.util.Arrays;

public class CalculationsUsingStream {
    //Using Stream API

    public int maximumUsingStream(int[] nums) { 
        return Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
     }
    public int minimumUsingStream(int[] nums) { 
        return Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
     }
    public int sumUsingStream(int[] nums) { 
        return Arrays.stream(nums).sum();
     }
    public int averageUsingStream(int[] nums) { 
        if (nums.length == 0) {
            return 0;
        }
        return (int) Arrays.stream(nums).average().orElse(0.0);
     }

     public int[] evenNumbersUsingStream(int[] nums) {
        return Arrays.stream(nums).filter(num -> num % 2 == 0).toArray();
     }

     public int[] oddNumbersUsingStream(int[] nums) {
        return Arrays.stream(nums).filter(num -> num % 2 != 0).toArray();
     }

     public int[] addFiveToEachElementUsingStream(int[] nums) {
        return Arrays.stream(nums).map(num -> num + 5).toArray();
     }

     public int[] squareEachElementUsingStream(int[] nums) {
        return Arrays.stream(nums).map(num -> num * num).toArray();
     }
}
