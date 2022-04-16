class Node{
    int data;
    Node next;

    Node(int key)
    {
        this.data=key;
    }
}

public class DeleteAlternateNodes {

    static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    static Node deleteAlter(Node head)                //delete alternate nodes(odd positions)
    {
        if(head==null)
        {
            return head;
        }

        if(head.next==null)
        {
            head=null;
            return head;
        }

        
        Node first=head;
        int i=1;
        while(first!=null && first.next!=null)
        {
            // first.next=first.next.next;
            // first=first.next;
            if(i%2!=0)
            {
                first=first.next;
            }
            else
            {
                first.next=first.next.next;
                first=first.next;
                i++;
            }
            i++;
        }

        return head.next;

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
        Node del=deleteAlter(head);
        System.out.println();
        display(del);
    }    
}
