// Program 4: Implementation of ATOI (String to Int)
//  https://leetcode.com/problems/string-to-integer-atoi/

class Solution {
    public int myAtoi(String s) {

        if( s == "")
            return 0;
        int sign=1, i=0, n = s.length();
        while(i<n && s.charAt(i) == ' ')
            i++;
        if(i >= n)
            return 0;
        if( s.charAt(i) == '+' ||  s.charAt(i) == '-')
            sign = s.charAt(i++) == '+' ? 1 : -1;
        long result = 0;
        
        while( i<n && Character.isDigit(s.charAt(i))){
            result = result * 10 + (s.charAt(i++)-'0');
            if( result * sign > Integer.MAX_VALUE ||  result * sign < Integer.MIN_VALUE){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; }               
        }
        return (int)(result * sign);        
    }
}