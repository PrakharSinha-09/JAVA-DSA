class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        
//         ListNode rev1=Reverse(l1);
//         ListNode rev2=Reverse(l2);
        
//         ListNode temp1=rev1;
//         ListNode temp2=rev2;
        
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp3=dummy;
        
        int sum;
        int count;
        int x=0;
        int y=0;
        int n;
        while(temp1!=null && temp2!=null)
        {
            sum=temp1.val+temp2.val;
            count=countDigit(sum);
            
            if(count==2)
            {
                x=sum%10;
                n=sum/10;
                ListNode newNode=new ListNode(x);
                newNode.next=null;
                System.out.println(x);
                y=n%10;
                System.out.println(y);
                temp3.next=newNode;
                temp3=temp3.next;
                
                temp1=temp1.next;
                temp1.val=temp1.val+y;
                System.out.println(temp1.val);
                temp2=temp2.next;
            }
            
            else
            {
                ListNode newNode=new ListNode(sum);
                newNode.next=null;
                temp3.next=newNode;
                temp3=temp3.next;
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }
        
        ListNode ans=dummy.next;
        ListNode rev3=Reverse(ans);
        
        return rev3;
        
        
    }
    
    static int countDigit(int n)
    {
        return (int)Math.floor(Math.log10(n) + 1);
    }
    
    static ListNode Reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode current=head;
        ListNode second=head.next;

        while(current!=null)
        {
            current.next=prev;
            prev=current;
            current=second;
            if(second!=null){
                second=second.next;
            }
            
        }
        head=prev;
        return head;
    }

    static void display(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode hNode=new ListNode(2);
        hNode.next=new ListNode(4);
        hNode.next.next=new ListNode(3);
        hNode.next.next.next=null;

        ListNode lNode=new ListNode(5);
        lNode.next=new ListNode(6);
        lNode.next.next=new ListNode(4);
        lNode.next.next.next=null;

        ListNode ans=addTwoNumbers(hNode, lNode);
        display(ans);

    }
}