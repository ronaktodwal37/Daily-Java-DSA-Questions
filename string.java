import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class string {
    public static void main(String[] args) {
        // leetcode question 8
        class Solution {
    public int myAtoi(String s) {

        // my approach which is wrong 
//         StringBuilder sb = new StringBuilder(s.trim()) ;
//         if (sb.equals("")){
//             return 0;
//         }
//         int sign = 1;
//         if(sb.charAt(0) == '-'){
//             sign = -1;
//         }

//         int num = 0;


//     if(sign == -1){
//         for(int i=1;i<sb.length();i++){
//            if(sb.charAt(i) == '0' && num==0){
//             continue;
//             }

//             else if(sb.charAt(i) >=48 && sb.charAt(i)<= 57){
//                 num = num*10 + (int)(sb.charAt(i)) - 48;
//             }
//             else{
//                 break;
//             }
//         }
//     }
//     else{
//         for(int i=0;i<sb.length();i++){
//             // if(sb.charAt(0) == '-'){
//             //     continue;
//             // }
//            if(sb.charAt(i) == '0' && num==0){
//             continue;
//             }

//             else if(sb.charAt(i) >=48 && sb.charAt(i)<= 57){
//                 num = num*10 + (int)(sb.charAt(i)) - 48;
//             }
//             else{
//                 break;
//             }
//         }
//     }

    
// return num*sign;

// second and correct approach 

 if(s==null) return 0;

        s=s.trim();
        
        if(s.length()==0) return 0;
        
        int sign = +1;
        long ans = 0;
        if(s.charAt(0) == '-') sign = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
		
		// initiate the starting pointer
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;
		
        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            ans = ans * 10 + s.charAt(i)-'0';
            // check the conditions
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;
            
            i++;
        }
        
        return (int)(sign*ans);
    }
}


leetcode question 69
class Solution {
    public int mySqrt(int x) {
        // int ans = 0;
        // for(long i=0;i<=x;i++){
        //     if(i*i == x){
        //         ans = (int)i;
        //     }
        //     else if(x < (i*i) && x > ((i-1)*(i-1))){
        //         ans = (int)i-1;
        //     }
        // }
        // return ans ;


        long low = 1 , high = x;
        while(low<=high){
            long mid = (low+high)/2;
            long val = (mid*mid);

            if(val<=x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return (int)high;
    }
}


leetcode question 5 
class Solution {

    int max = 0;
    int start = 0;
    int end = 0;

    public boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){

                if(isPalindrome(s, i, j)){
                    if(j - i + 1 > max){
                        max = j - i + 1;
                        start = i;
                        end = j;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
    }
}



// leetcode question 3 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        int maxlength = 0;

        for(int i=0;i<s.length();i++){
                    StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++){
                if(sb.toString().indexOf(s.charAt(j)) == -1){
                    sb.append(s.charAt(j));
                    length  = sb.length();  
                 if(length>maxlength){
                    maxlength = length;
                 }
                }
                else{
                break;
                }
            }
        }
    return maxlength;
    }
}

// leetcode question 9
class Solution {
    public boolean isPalindrome(int x) {
        int duplicate = x;
        int reverse = 0;
        while(x>0){
            int rem = x%10;
            reverse = reverse*10 + rem;
            x = x/10;
        }

        if(reverse == duplicate){
            return true;
        }
        else{
            return false;
        }
    }
}

// leetcode question 49 -> group ansgrams 
// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {

        // wrong code 
    //     int ascii = new int[strs.length];
    //     for(int i=0;i<strs.length;i++){
    //         int sum = 0;
    //          for(int j=0;j<strs[i].length;i++){
    //         sum = sum+ (int)strs[i].charAt(j) ;
    //     }
    //     ascii[i] = sum;
    //     }

    // List<List<String>> data = new ArrayList<>();
    
    // Map<String, List<String >>
    // for(int i=0;i<ascii.length;i++){
    // }


    // correct code 
//     Map<String,List>map = new HashMap<>();
// for(String s:strs){
//     int[] count = new int[26];
//     for(char c:s.toCharArray()){
//         count[c - 'a']++;
//     }

//     StringBuilder sb = new StringBuilder();
//     for(int i:count){
//         sb.append("#");
//         sb.append(i);
//     }
//     String key = sb.toString();
//     if(!map.containsKey(key)){
//         map.put(key,new ArrayList<String>());
//     }
//     map.get(key).add(s);
// }
//     return new ArrayList(map.values());
//     }
// }



    }
}
