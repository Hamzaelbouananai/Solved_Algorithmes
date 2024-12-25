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
