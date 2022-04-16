class Node
{
    int data;
    Node next;

    Node(int key)
    {
        this.data=key;
    }

}
public class PrintAlternateNodes_New_LinkedList {
    static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static Node deleteAlter(Node head)
    {
        // Node dummy=new Node(0);
        // Node temp=dummy;

        Node first=head;
        while(first!=null && first.next!=null)
        {
            first.next=first.next.next;
            first=first.next;
        }

        return head;
    }

    static Node newLLreturn(Node head)
    {
        Node ptr1=deleteAlter(head);
        Node dummy=new Node(0);
        Node temp=dummy;

        while(ptr1!=null && ptr1.next!=null)
        {
            temp.next=ptr1;
            ptr1=ptr1.next;
            temp=temp.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Node head=new Node(3);
        head.next=new Node(4);
        head.next.next=new Node(5);
        head.next.next.next=new Node(9);
        head.next.next.next.next=new Node(6);
        head.next.next.next.next.next=new Node(7);
        head.next.next.next.next.next.next=new Node(10);


        head.next.next.next.next.next.next.next=null;
        display(head);
        Node ptr=newLLreturn(head);
        System.out.println();
        display(ptr);

    }

}
