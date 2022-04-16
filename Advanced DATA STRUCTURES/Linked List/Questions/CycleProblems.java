//Cycle based problems are damn important in LinkedList.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) 
    {
        val = x;
        next = null;
    }
}

public class CycleProblems {

    // https://leetcode.com/problems/linked-list-cycle/  
    public boolean hasCycle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null)
        {
            if(fast==slow)
            {
                return true;
            }
        }
        return false;
    }

    //finding length of the cycle
    public int lengthCycle(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;             //move fast pointer by 2 steps
            slow=slow.next.next;             //move slow pointer by 1 step
            if(fast==slow)
            { 
                ListNode temp=slow;
                int length=0;
                do{
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }  
        return 0;     
    }

    //Cycle Detection iN Linked List...means you have to return the node from where the cycle begins!
    public ListNode detectCycle(ListNode head)
    {
        int length=0;
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                length=lengthCycle(slow);
                break;
            }
        }

        if(length==0)                  //means if no cycle is present return null.
        {
            return null;
        }
        
        //after you got the cycle, now find the start node.
        ListNode f=head;
        ListNode s=head;

        //Now we have to move the second(s) by the length of the cycle times
        while(length>0)
        {
            s=s.next;
            length--;
        }

        //keep moving both forward...they will move at cycles start
        while(f!=s)
        {
            f=f.next;
            s=s.next;
        }
        return s;
    }

     // https://leetcode.com/problems/middle-of-the-linked-list/
     public ListNode middleNode(ListNode head) {
        
        if(head==null)
        {
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        ListNode temp=slow;
        while(slow!=null)
        {
            System.out.print(slow.val+" ");
            slow=slow.next;
        }
        
        return temp;
    }

        /*
        //returning middle nodes value of linked list.
        public int middleNode(ListNode head) {
        
            if(head==null)
            {
                return 0;
            }
            ListNode fast=head;
            ListNode slow=head;
            
            while(fast!=null && fast.next!=null)
            {
                fast=fast.next.next;
                slow=slow.next;
            }
            
            ListNode temp=slow;
            // while(slow!=null)
            // {
            //     System.out.print(slow.val+" ");
            //     slow=slow.next;
            // }
            
            return temp.val;
        }
        */

        
    public static void main(String[] args) {
        ListNode head1=new ListNode(4);
        head1.next=new ListNode(5);
        head1.next.next=new ListNode(6);
        head1.next.next.next=new ListNode(7);
        head1.next.next.next.next=new ListNode(8);

        CycleProblems cy =new CycleProblems();
        //int ans=cy.middleNode(head1);              if you want to get middle node's value as answer
        ListNode ans=cy.middleNode(head1);
        System.out.println(ans);

    }
}
