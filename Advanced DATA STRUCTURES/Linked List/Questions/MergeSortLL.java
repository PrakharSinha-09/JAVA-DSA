
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

public class MergeSortLL {

    public ListNode mergeSort(ListNode head)
    {
        if(head==null || head.next==null)                 //if only one node is there we dont need to sort it so directly return
        {
            return head;
        }

        ListNode mid=getMid(head);
        ListNode left=mergeSort(head);
        ListNode right=mergeSort(mid);

        return merge(left, right);
    }
    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode dummyHead=new ListNode();
        ListNode temp=dummyHead;

        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                temp.next=l1;
                l1=l1.next;
                temp=temp.next;
            }

            else
            {
                temp.next=l2;
                l2=l2.next;
                temp=temp.next;
            }
        }
        temp.next=(l1!=null)?l1:l2;
        return dummyHead.next;
    }

    public ListNode getMid(ListNode head)
    {
        ListNode midPrev=null;
        while(head!=null && head.next!=null)            
        {
            midPrev=(midPrev==null)?head:midPrev.next;
            head=head.next.next;
        }

        ListNode mid=midPrev.next;
        midPrev.next=null;

        return mid;
    }
}
