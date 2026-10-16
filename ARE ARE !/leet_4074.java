import java.util.* ;
public class leet_4074 {
    public static void main(String[] args) {
       int arr[]={100 ,-100};
       int target=0;
        int [] result=maxProductPair(arr,target);
       System.out.println(Arrays.toString(result));
    }
    static  int[] maxProductPair(int[] nums, int target) {
        int [] arr={-1,-1};
        int maxproduct= -10001;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]>nums[j] && nums[i]+nums[j]==target){
                    int product= nums[i]*nums[j];
                    if(product>maxproduct){
                        maxproduct=product;
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
            }
        }
    return arr;
    }

}
/*Problem: Maximum Product Pair
Description:Given an integer array nums and an integer target, find two distinct indices i and j such that their elements sum to the target and nums[i] > nums[j].
Among all valid pairs, return the indices of the pair with the maximum product. If no valid pair exists, return [-1, -1].
Approach:Use two nested loops to check all possible pairs. If a pair satisfies the given conditions, calculate its product and compare it with the maximum product found so far.
Update the result indices whenever a larger product is found.
Time Complexity: O(n^2)
Space Complexity: O(1)*/