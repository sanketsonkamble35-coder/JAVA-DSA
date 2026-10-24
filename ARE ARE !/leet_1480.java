import java.util.*;
public class leet_1480 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);   int[]a={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(runningSum(a)));
    }
    static int[] runningSum(int[] nums) {int sum=0;
        int[] arr=new int[nums.length];
        for (int i=0;i<nums.length;i++){sum+=nums[i];arr[i]=sum;}
        return arr;
    }
}
// 1480. Running Sum of 1d Array
// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.

// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

// Example 2:
// Input: nums = [1,1,1,1,1]
// Output: [1,2,3,4,5]
// Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

// Example 3:\
// Input: nums = [3,1,2,10,1]
// Output: [3,4,6,16,17]
 
// Constraints:
// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6