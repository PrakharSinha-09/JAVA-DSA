
class ListNode {
    int val;
    ListNode next;

    ListNode()
    {
         
    }

    ListNode(int x) 
    {
        val = x;
        next = null;
    }
}

public class ReverseProblems {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)
        {
            return head;
        }

        //Skip the first left-1 node.
        ListNode current=head;
        ListNode prev=null;

        for(int i=0;current!=null && i<left-1;i++)
        {
            prev=current;
            current=current.next;
        }

        ListNode last=prev;
        ListNode newEnd=current;
        ListNode second=current.next;
        //now reverse b/w left and right
        for(int i=0;current!=null && i<right-left+1;i++)           //going till right-left+1 as there are these many no. of nodes present b/w them.
        {
            current.next=prev;
            prev=current;
            current=second;
            if(second!=null)
            {
                second=second.next;
            } 
        }

        //there could be possibility that last could be null
        if(last!=null)
        {
            last.next=prev;
        }
        else
        {
            head=prev;
        }

        newEnd.next=current;
        return head;
    }

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

    public ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head;
        }

        ListNode prev=null;
        ListNode present=head;
        ListNode second=head.next;

        while(present!=null)
        {
            present.next=prev;
            prev=present;
            present=second;
            if(second!=null)
            {
                second=second.next;
            } 
        }

        head=prev;
        return head;
    }

    //Pallindrome Linkedlist
    public boolean isPalindrome(ListNode head) {
        ListNode mid= middleNode(head);
        ListNode headSecond=reverse(mid);
        ListNode rereverseHead=headSecond;      //storing head of second half in this variable as we have to rereverse the second half
        
        while(head!=null && headSecond!=null)
        {
            if(head.val!=headSecond.val)
            {
                break;     //didnt returned from here because we need to re-reverse the list.
            }
            else
            {
                head=head.next;
                headSecond=headSecond.next;
            }        
        }

        reverse(rereverseHead);                 //reversing the second half back!

        if(head==null || headSecond==null)
        {
            return true;
        }

        return false;
    }

    // https://leetcode.com/problems/reverse-nodes-in-k-group/
    //some sort of modifications is needed here!
    public ListNode reverseKGroup(ListNode head, int k) {
    if(k<=1 || head==null)
    {
        return head;
    }
    
    ListNode current=head;
    ListNode prev=null;
    while(true)
    {
        ListNode last=prev;
        ListNode newEnd=current;
        ListNode second=current.next;
        //now reverse b/w left and right
        for(int i=0;current!=null && i<k;i++)           //going till right-left+1 as there are these many no. of nodes present b/w them.
        {
            current.next=prev;
            prev=current;
            current=second;
            if(second!=null)
            {
                second=second.next;
            } 
        }

        //there could be possibility that last could be null
        if(last!=null)
        {
            last.next=prev;
        }
        else
        {
            head=prev;
        }

        newEnd.next=current;
        if(current==null)
        {
            break;
        }

        prev=newEnd;
    }
    return head;


    //ReverseAlternate K Groups(Nodes)
    // https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    public ListNode reverseAlternateKGroup(ListNode head, int k) {
        if(k<=1 || head==null)
        {
            return head;
        }
        
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
            ListNode last=prev;
            ListNode newEnd=current;
            ListNode second=current.next;
            //now reverse b/w left and right
            for(int i=0;current!=null && i<k;i++)           //going till right-left+1 as there are these many no. of nodes present b/w them.
            {
                current.next=prev;
                prev=current;
                current=second;
                if(second!=null)
                {
                    second=second.next;
                } 
            }
    
            //there could be possibility that last could be null
            if(last!=null)
            {
                last.next=prev;
            }
            else
            {
                head=prev;
            }
    
            newEnd.next=current;

            //Skip the k nodes
            for(int i=0;current!=null && i<k;i++)
            {
                prev=current;
                current=current.next;
            }
        }
        return head;

        public ListNode rotateRight(ListNode head, int k) {
            if(k<=0 || head==null || head.next==null)
            {
                return head;
            }

            ListNode last=head;
            int length=1;
            while(last.next!=null)
            {
                last=last.next;
                length++;
            }

            last.next=head;
            int rotations=k%length;
            int skip=length-rotations;

            ListNode newLast=head;
            for(int i=0;i<skip-1;i++)
            {
                newLast=newLast.next;
            }

            head=newLast.next;
            newLast.next=null;

            return head;
        }
}
