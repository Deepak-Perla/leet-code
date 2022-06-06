/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int headAlength=0;
        int headBlength=0;
          ListNode ans=null;
        ListNode a=headA;
        ListNode b= headB;
        while(a.next!=null)
        {
            a=a.next;
            headAlength++;
        }
        
           while(b.next!=null)
        {
            b=b.next;
            headBlength++;
        }
        
        while (headAlength >headBlength)
        {
            headA=headA.next;
            headAlength--;
        }
         while (headBlength >headAlength)
        {
            headB=headB.next;
            headBlength--;
        }
        
        while(headA!=headB)
        {
            headA=headA.next;
            headB=headB.next;
        }
        return headB;
        /*
        int len=0;
        
        if(headBlength==headAlength)
        {
            ans=helper(0, headA, headB);
        }
        if(headBlength >headAlength)
        {
             len= headBlength -  headAlength;
            ans= helper(len, headB,headA);
            
            
        }
        else
        {
            len= headAlength -  headBlength;
                        ans= helper(len, headA,headA);
            }

        return ans; 
        
    }
    
    public ListNode helper(int len, ListNode A, ListNode B)
    {
        int count=0;
        
        if(len==0)
        {
            while(A.next!=null)
            {
                if(A==B)
                    return A;
                A=A.next;
                B=B.next;
            }
        }
        while(count<len &&A.next!=null)
        {
            A=A.next;
            count++;
        }
        
        while(A.next!=null)
        {
            if(A==B)
            {
                return A;
            }
           A= A.next;
            B=B.next;
        }
        return A;*/
    }
}
