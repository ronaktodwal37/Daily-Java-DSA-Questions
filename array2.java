import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
// 125. Valid Palindrome

// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
 

// Constraints:

// 1 <= s.length <= 2 * 105
// s consists only of printable ASCII characters.
// import java.util.*;
// class Solution {
//     public boolean isPalindrome(String s) {
//  StringBuilder sb = new StringBuilder();

//         for(int i =0; i<s.length();i++ ){
//             if(s.charAt(i) >=48 && s.charAt(i)<=57){
//                 sb.append(s.charAt(i));
//             }
//             else if(s.charAt(i)>=65 &&  s.charAt(i)<=90){
//                 sb.append((char)(s.charAt(i)+32));
//             }
//             else if(s.charAt(i)>=97 &&  s.charAt(i)<=122){
//                 sb.append(s.charAt(i));
//             }
//         }

        // int left = 0;
        // int right = sb.length()-1;
        // while(left <= right){
        //     if(!(sb.charAt(left)==sb.charAt(right))){
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return true;



// 56. Merge Intervals

// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

// Example 1:

// Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
// Example 2:

// Input: intervals = [[1,4],[4,5]]
// Output: [[1,5]]
// Explanation: Intervals [1,4] and [4,5] are considered overlapping.
// Example 3:

// Input: intervals = [[4,7],[1,4]]
// Output: [[1,7]]
// Explanation: Intervals [1,4] and [4,7] are considered overlapping.
 

// Constraints:

// 1 <= intervals.length <= 104
// intervals[i].length == 2
// 0 <= starti <= endi <= 104

// import java.util.*;
// class Solution {
//     public int[][] merge(int[][] intervals) {
        //  for(int i=0;i<intervals.length-1;i++){
        //     for(int j=0;j<intervals.length-i-1;j++){
        //         if(intervals[j][0]>intervals[j+1][0]){
        //             int temp = intervals[j][0];
        //             intervals[j][0] = intervals[j+1][0];
        //             intervals[j+1][0] = temp;
        //         }
        //     }
        //  }

        // for(int i=0;i<intervals.length-1;i++){
        //     if( i>=1 && intervals[i][1])
        //     if(intervals[i][1] >= intervals[i+1][0]){
        //         intervals[i][1] = Math.max(intervals[i][1],intervals[i+1][1]);
        //     }
        // }

        // return intervals;


//         Arrays.sort(intervals , (a,b) -> a[0]-b[0]);
//         List<int[]> result = new ArrayList<>();

//         result.add(intervals[0]);
//         for(int i=1;i<intervals.length;i++){
//             int[] last = result.get(result.size() -1);

//             int currentStart = intervals[i][0];
//             int currentEnd = intervals[i][1];

//             if(currentStart<=last[1]){
//                 last[1] = Math.max(last[1],currentEnd);
//             }
//             else{
//                 result.add(intervals[i]);
//             }
//         }
//         return result.toArray(new int[result.size()][]);
//     }
// }


// 11. Container With Most Water

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

 

// Example 1:


// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
// Example 2:

// Input: height = [1,1]
// Output: 1
 

// Constraints:

// n == height.length
// 2 <= n <= 105
// 0 <= height[i] <= 104

// import java.util.*;
// class Solution {
//     public int maxArea(int[] height) {

// int maxarea = 0;
        // for(int i=0;i<height.length-1;i++){
        //     int area = 0;
        //     for(int j=i+1;j<height.length;j++){
        //          int length = Math.min(height[i], height[j]);
        //          int width = j-i;
        //          area = length*width;
        //          if(area>maxarea){
        //             maxarea = area;
        //          }
        //     }
        // }
        // return maxarea;

        // approach 2 
//     int left = 0;
//     int right = height.length-1;
//     int maxarea = 0;
//     while(left<right){
//         int width = right-left;
//         int length = Math.min(height[left],height[right]);
//         int currentarea = length*width;
//         if(currentarea>maxarea){
//             maxarea = currentarea;
//         }
//         if(height[left]<=height[right]){
//             left++;
//         }
//         else{
//             right--;
//         }
//     }
//     return maxarea;


//     }
// }
    }
}
