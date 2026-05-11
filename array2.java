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
import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
 StringBuilder sb = new StringBuilder();

        for(int i =0; i<s.length();i++ ){
            if(s.charAt(i) >=48 && s.charAt(i)<=57){
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)>=65 &&  s.charAt(i)<=90){
                sb.append((char)(s.charAt(i)+32));
            }
            else if(s.charAt(i)>=97 &&  s.charAt(i)<=122){
                sb.append(s.charAt(i));
            }
        }

        int left = 0;
        int right = sb.length()-1;
        while(left <= right){
            if(!(sb.charAt(left)==sb.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;


    }
}
