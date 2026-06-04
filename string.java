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
    }
}
