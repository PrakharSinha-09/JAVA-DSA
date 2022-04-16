class ListNode{
    int data;
    ListNode next;
    ListNode(int key)
    {
        this.data=key;
    }
}
public class CommonElementsOfTwo_LinkedList {
    static ListNode commonElements(ListNode head1,ListNode head2)
    {
        ListNode dummyHead=new ListNode(0);
        ListNode temp1=head1;
        ListNode temp2=head2;
        ListNode temp=dummyHead;

        while(temp1!=null && temp2!=null)
        {
            if(temp1.data==temp2.data)
            {
                temp.next=temp1;
                temp=temp.next;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return dummyHead.next;
    }

    public static void display(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(3);
        head1.next=new ListNode(4);
        head1.next.next=new ListNode(5);
        head1.next.next.next=new ListNode(9);
        head1.next.next.next.next=new ListNode(6);
        head1.next.next.next.next.next=null;

        ListNode head2=new ListNode(3);
        head2.next=new ListNode(4);
        head2.next.next=new ListNode(8);
        head2.next.next.next=new ListNode(10);
        head2.next.next.next.next=new ListNode(6);
        head2.next.next.next.next.next=null;

        ListNode ans=commonElements(head1, head2);
        display(ans);
        

    }
}
