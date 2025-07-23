package org.example;

public class CalculationsUsingForLoop {
    
    public int maximumUsingForLoop(int[] nums) { 
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int minimumUsingForLoop(int[] nums) { 
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
     }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
      }

    public int averageUsingForLoop(int[] nums) {  
        if (nums.length == 0) {
            return 0; // Avoid division by zero
        }
        int sum = sumUsingForLoop(nums);
        return sum / nums.length;
    }
}
