public class CLL {
    private Node head;          //initialized with null by default(as these are objects), since we haven't assigned anything to them 
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    //Structure OF NODE
    private class Node
    {
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }

    void insert(int value)
    {
        Node new_node=new Node(value);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
            return;
        }
        tail.next=new_node;
        new_node.next=head;
        tail=new_node;
    }

    void delete(int val)                   //deleting node of particular value.
    {
        Node node = head;
        if (node == null) {
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        if (node.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n = node.next;
            if (n.val == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);

    }
    }
    void display()
    {
        Node temp=head;
        if(head!=null)
        {
            do{
                System.out.print(temp.value+" ");
                temp=temp.next;
            }while(temp!=head);
        }
    }
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(5);
        list.insert(4);
        list.display();
    }
}
