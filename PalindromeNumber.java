/*Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */

import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(int x) {
    
        if (x < 0) {
            return false;
        }

    
        String xs = Integer.toString(x);
        int f = xs.length();

    
        ArrayList<Character> tab = new ArrayList<>();
        for (int i = f - 1; i >= 0; i--) {  
            tab.add(xs.charAt(i));
        }

     
        for (int i = 0; i < f; i++) {
            if (xs.charAt(i) != tab.get(i)) {
                return false; 
            }
        }

        return true;
    }
}