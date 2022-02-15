import java.sql.Time;
import java.util.List;

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

    public void insertLast(int value)
    {
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        Node new_node=new Node(value);                //ceated new node
        tail.next=new_node;
        tail=new_node;
        size++;
    }

    //Removing Duplicates
    void removeDuplicates()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.value==temp.next.value)
            {
                temp.next=temp.next.next;
            }
            else
            {
                temp=temp.next;
            }
        }
        // tail=temp;
        // tail.next=null;
    }

    //merging two "sorted" linkedLists
    //here we will return an entire LinkedList not just a head node
    //parameters will also be the linkedList within themselves
    public static linkedList merge(linkedList first,linkedList second)
    {
        Node f=first.head;              //first linkedList ka head store kr rhe f mein
        Node s=second.head;              //second linkedList ka head store kr rhe s mein

        linkedList ll=new linkedList();
        while(f!=null && s!=null)
        {
            if(f.value<s.value)
            {
                ll.insertLast(f.value);
                f=f.next;
            }
            else{
                ll.insertLast(s.value);
                s=s.next;
            }
        }

        while(f!=null)
        {
            ll.insertLast(f.value);
            f=f.next;
        }

        while(s!=null)
        {
            ll.insertLast(s.value);
            s=s.next;
        }

        return ll;
    }

    //Reversing LinkedList(Recursive)
    private void reverseLL(Node node)
    {
        if(node==tail)
        {
            head=tail;
            return;
        }

        reverseLL(node.next);

        tail.next=node;
        tail=node;
        tail.next=null;
    }

    //in place reversal(Damn Important)
    public void reverse()
    {
        if(size<2)
        {
            return;
        }

        Node prev=null;
        Node present=head;
        Node second=head.next;

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
    }
    public void display()
    {
        Node temp;
        temp=head;                  //this means now temp will also point to the same object which head is pointing
        while(temp!=null)
        {
            System.out.print(temp.value);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        linkedList first=new linkedList();
        linkedList second=new linkedList();
        
        
        first.insertLast(23);
        first.insertLast(24);
        first.insertLast(26);
        first.insertLast(67);
        
        second.insertLast(9);
        second.insertLast(18);
        second.insertLast(39);
        second.insertLast(69);
        
        linkedList ans=linkedList.merge(first, second);
        // ans.merge(first, second);
        ans.display();   

    }
}