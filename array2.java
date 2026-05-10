import java.util.HashMap;
import java.util.Map;

public class array2 {
    public static void main(String[] args) {
//169. Majority Element
// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 

// Constraints:

// n == nums.length
// 1 <= n <= 5 * 104
// -109 <= nums[i] <= 109
// The input is generated such that a majority element will exist in the array.

// import java.util.*;
// class Solution {
//     public int majorityElement(int[] nums) {
//            HashMap<Integer , Integer> map = new HashMap<>(); 
//            for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//              map.put(nums[i], map.get(nums[i])+1);
//         }
//         else{
//             map.put(nums[i],1);
//         }
//            }
//            int ans = 0;

//             for(Map.Entry<Integer,Integer> e: map.entrySet()) {
//         //     System.out.print(e.getKey() + " ");
//        if(e.getValue() > nums.length/2){
//     ans =  e.getKey();
//        }
//         }
//         return ans;
//     }
// }



// 560. Subarray Sum Equals K

// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

// A subarray is a contiguous non-empty sequence of elements within an array.

 

// Example 1:

// Input: nums = [1,1,1], k = 2
// Output: 2
// Example 2:

// Input: nums = [1,2,3], k = 3
// Output: 2
 

// Constraints:

// 1 <= nums.length <= 2 * 104
// -1000 <= nums[i] <= 1000
// -107 <= k <= 107

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int count = 0;
//         for(int i=0;i<n;i++){
//             int sum = 0;
//             for(int j=i;j<n;j++){
//                 sum = sum + nums[j];
//                 if(sum==k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }



    }
}
