class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

public class ReverseLL {

    static Node Reverse(Node head)
    {
        Node prev=null;
        Node current=head;
        Node second=head.next;

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

    static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        Node head=new Node(12);
        Node head2=new Node(45);
        Node head3=new Node(56);
        Node head4=new Node(58);

        head.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=null;

        display(head);
        Node ptr=Reverse(head);
        System.out.println();
        display(ptr);
        // display(head);
    }
}
