public class binarysearch {
    public static void main(String[] args) {
        // leetcode question 33 
//         class Solution {
//     public int search(int[] nums, int target) {
//         int ans = -1;
//         int low = 0;
//         int high = nums.length-1;

//         while(low<=high){
//             int mid = low + (high-low)/2 ;
//             if(nums[mid]==target){
//                 ans = mid;
//                 break;
//             }
//             if(nums[low]<=nums[mid]){
//                 if(nums[low]<=target && nums[mid]>=target){
//                     high = mid-1;
//                 }
//                 else{
//                     low = mid+1;
//                 }
//             }
//             else{
//                 if(nums[mid] <= target && nums[high]>=target){
//                     low = mid+1;
//                 }
//                 else{
//                     high = mid-1;
//                 }
//             }

//         }
//         return ans;
//     }
// }



// leetcode question 704

// class Solution {
//     public int search(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }
//         return -1;



// int ans = -1;
// int low = 0;
// int high = nums.length-1;

// while(low<=high){
//     int mid = (low+high)/2;
//     if(nums[mid] == target){
//         ans = mid;
//         break;

//     }

//     else if(nums[mid] < target ){
//         low = mid+1;
//     }

//     else{
//         high = mid-1;
//     }
// }
// return ans ; 
//     }
// }

    }
}
