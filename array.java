// 1. Two Sum

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.
// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
 

// Constraints:

// 2 <= nums.length <= 104
// -109 <= nums[i] <= 109
// -109 <= target <= 109
// Only one valid answer exists.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int [2];
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]+nums[j] == target){
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
            }
        }
        return arr;
    }
}


// 75. Sort Colors

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.

// class Solution {
//     public void sortColors(int[] nums) {
//        for(int i=0;i<nums.length-1;i++){
//         for(int j=0;j<nums.length-i-1;j++){
//             if(nums[j]>nums[j+1]){
//                 int temp = nums[j];
//                 nums[j] = nums[j+1];
//                 nums[j+1] = temp;
//             }
//         }
//        }


//     }
// }



// 287. Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and using only constant extra space.

 

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
// Example 3:

// Input: nums = [3,3,3,3,3]
// Output: 3
 

// Constraints:

// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one integer which appears two or more times.
 

// import java.util.*;
// class Solution {
//     public int findDuplicate(int[] nums) {


// int count =0;
// int ans=0;
// HashMap<Integer,Integer> map = new HashMap<>();
// for(int i=0;i<nums.length;i++){
//     if(map.containsKey(nums[i])){
//          map.put(nums[i],map.get(nums[i])+1); 
//     }
//     else{
//           map.put(nums[i],1);
//     }
// }

//  for(Map.Entry<Integer,Integer> e: map.entrySet()) {
//     if(e.getValue() > 1){
//         ans = e.getKey();
//     }
//         }
//         return ans;
//     }
// }


// 121. Best Time to Buy and Sell Stock

// You are given an array prices where prices[i] is the price of a given stock on the ith day.

// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

 

// Example 1:

// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
// Example 2:

// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are done and the max profit = 0.
 

// Constraints:

// 1 <= prices.length <= 105
// 0 <= prices[i] <= 104



// class Solution {
//     public int maxProfit(int[] prices) {
//        int maxprofit = 0 ;
//        int min = Integer.MAX_VALUE;
//        for(int i=0;i<prices.length;i++){
//         if(prices[i]<min){
//             min = prices[i];
//         }
//         else{
//             int profit = prices[i] - min;
//              maxprofit = Math.max(maxprofit, profit);
//         }
//        }


    //    2nd approach (but time limit exceed)
    // for(int i=0;i<prices.length;i++){
    //     for(int j=i+1;j<prices.length;j++){
    //         int currentprofit = prices[j]-prices[i];
    //         if(currentprofit>maxprofit){
    //             maxprofit = currentprofit ;
    //         }
    //     }
    // }
//        return maxprofit;
//     }
// }


// 283. Move Zeroes

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]
 

// Constraints:

// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1

class Solution {
    public void moveZeroes(int[] nums) {
        // int nonzero = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i] != 0){
        //         nonzero++;
        //     }
        // }
        // int index = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(index<nonzero){
        //         if(nums[i] != 0){
        //             nums[index] = nums[i];
        //             index++;
        //         }
        //     }
        // }
        // for(int i=nonzero;i<nums.length;i++){
        //     nums[i] = 0;
        // }

        int nonzero = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nonzero++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
nums[count] =nums[i];
count++;
            }
        }
        for(int i=count;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}