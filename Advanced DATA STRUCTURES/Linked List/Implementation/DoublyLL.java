public class DoublyLL {
    private Node head;          //initialized with null by default(as these are objects), since we haven't assigned anything to them 
    private Node tail;
    private int size;

    public DoublyLL()
    {
        this.size=0;
    }

    //Structure OF NODE
    private class Node
    {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next,Node prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }

    //Inserting AT First
    public void insertFirst(int value)
    {

        Node new_node=new Node(value);
        new_node.next=head;
        new_node.prev=null;
        if(head!=null)
        {
            head.prev=new_node;
        }
        head=new_node;
    }

    //Inserting at last
    public void insertLast(int value)
    {
        Node new_node=new Node(value);
        if(head==null)
        {
            new_node.prev=null;
            head=new_node;
            return;
        }
       
        Node temp=head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new_node;
        new_node.prev=temp;
        new_node.next=null;

    }

    //Inserting after the node of given value
    public void insertAfter(int after,int value)
    {
        Node p=find(after);
        if(p==null)
        {
            System.out.println("Node with the given value dosent exist");
            return;
        }

        Node new_node=new Node(value);
        new_node.prev=p;
        p.next=new_node;
        new_node.next=p.next;
        if(new_node.next!=null)
        {
            new_node.next.prev=new_node;
        }
    }

    public Node find(int value)
    {
        Node node=head;
        while(node!=null)
        {
            if(node.value==value)
            {
                return node;
            }
            node=node.next;
        }
        return null;
    }
    //Displaying Linked List
    public void display()
    {
        Node temp=head;
        Node last=null;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            last=temp;
            temp=temp.next;
        }

        System.out.println();
        System.out.println("in Reverse Order: ");

        while(last!=null)
        {
            System.out.print(last.value+" ");
            last=last.prev;
        }
    }


  
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.insertFirst(27);
        list.insertFirst(24);
        list.insertFirst(21);
        list.insertLast(45);
        list.insertAfter(24,6);
        list.display();
    }
}
