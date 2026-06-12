package dsa.arrays.questions;

public class missingNumberInArrayof1toN {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6}; // Example array where 3 is missing
        int n = arr.length + 1; // Since one number is missing, the total count should be N
        
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int num : arr) {
            actualSum += num;
        }
        
        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }

}