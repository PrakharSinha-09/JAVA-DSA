
public class linkedList{
    private Node head;          //initialized with null by default(as these are objects), since we haven't assigned anything to them 
    private Node tail;
    private int size;

    public linkedList()
    {
        this.size=0;
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

    //Inserting First
    public void insertFirst(int value)
    {
        Node new_node=new Node(value);                     //creating new node here with the value provided
        new_node.next=head;
        head=new_node;                                     //as head must always point to the first node

        if(tail==null)
        {
            tail=head;
        }
        size++;
    }

    //Insering At Last
    public void insertLast(int value)
    {
        if(tail==null)                      //or head==null
        {
            insertFirst(value);
            return;
        }
        Node new_node=new Node(value);                //ceated new node
        tail.next=new_node;
        tail=new_node;
        size++;
    }

    //Inserting At Particular iNDEX
    public void insert(int value,int index)
    {
        
        if(index==0)
        {
            insertFirst(value);
            return;
        }

        if(index==size)
        {
            insertLast(value);
            return;
        }   

        Node temp=head;
        int i=1;
        while(i<index)
        {
            temp=temp.next;
            i++;
        }

        Node new_node=new Node(value);
        new_node.next=temp.next;
        temp.next=new_node;
        size++;
    }

    //inserting at particular index using recursion (89-103)
    void insertRec(int val,int index)
    {
        head=insertRec(val, index, head);                    //Structure changed!
    }

    private Node insertRec(int val,int index,Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val, node);
            return temp;
        }
        node.next=insertRec(val, index-1, node.next);
        return node;
    }

    //Deleting First Node
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Nothing To Delete");
            return;
        }

        Node temp=head;
        head=head.next;
        temp=null;
        size--;
        
    }

    //Deleting Last Node
    public void delLast()
    {
        if(size<=1)
        {
            deleteFirst();
            return;
        }
        Node secondLast=get(size-2);
        secondLast.next=null;
        tail=secondLast;
    }

    //Deleting Particular iNdex(Position)
    public void delete(int index)
    {
        if(index==0)
        {
            deleteFirst();
            return;
        }
        /*
        Node temp=head;
        Node delNode=head.next;
        int  i=1;
        while(i<index)
        {
            temp=temp.next;
            delNode=delNode.next;
            i++;
        }
        temp.next=delNode.next;
        */
        
        //OR We can do like this as well.
        Node prev=get(index-1);
        prev.next=prev.next.next;

    }

    public Node get(int index)
    {
        Node node=head;
        for(int i=0;i<index;i++)
        {
            node=node.next;
        }
        return node;
    }

    //Displaying Linked List
    public void display()
    {
        Node temp;
        temp=head;                  //this means now temp will also point to the same object which head is pointing
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        linkedList list=new linkedList();
        list.insertFirst(23);
        list.insertFirst(25);
        list.insertLast(45);
        //list.insert(12, 2);
        //list.insert(13, 1);
        //list.deleteFirst();
        // list.delLast();
        // list.delete(2);
        list.insertRec(89, 1);
        list.display();
       
    }
    //😁
}