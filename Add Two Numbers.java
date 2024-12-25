
/**
 * Problématique:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * 
 * Details:
 * - Each linked list represents an integer.
 * - The numbers do not contain any leading zeros, except for the number 0 itself.
 * - Your solution should handle cases where the lists are of different lengths.
 *
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */

import java.util.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l4 = null; 
        int i = 0, j = 0;
        
        // ArrayLists to store the nodes' values
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        
        // Traverse the first linked list (l1)
        while (l1 != null) {
            a.add(l1.val);  
            l1 = l1.next;  
        }
        
        
        while (l2 != null) {
            b.add(l2.val);  
            l2 = l2.next;   
        }

      
        int maxLength = Math.max(a.size(), b.size());
        int carry = 0; 
        
        for (i = 0; i < maxLength || carry != 0; i++) {
            int sum = carry;
            if (i < a.size()) {
                sum += a.get(i);  
            }
            if (i < b.size()) {
                sum += b.get(i); 
            }
            
            carry = sum / 10; 
            c.add(sum % 10);  
        }

       
        ListNode result = new ListNode(0); 
        ListNode current = result;
        
        for (int value : c) {
            current.next = new ListNode(value); 
            current = current.next; 
        }
        
        return result.next;  
    }
}
