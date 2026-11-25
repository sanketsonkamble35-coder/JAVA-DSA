public class leet_349 {
    
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length];
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean duplicate = false;

                    for (int k = 0; k < count; k++) {
                        if (arr[k] == nums1[i]) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (!duplicate) {
                        arr[count] = nums1[i];
                        count++;
                    }
                    break;
                }
            }
        }

        return java.util.Arrays.copyOf(arr, count);
    }
}


// 349. Intersection of Two Arrays
// Easy
// Topics
// premium lock icon
// Companies
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 

// Constraints:

// 1 <= nums1.length, nums2.length <= 1000
// 0 <= nums1[i], nums2[i] <= 1000
