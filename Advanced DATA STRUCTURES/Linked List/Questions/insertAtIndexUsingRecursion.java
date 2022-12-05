class Node{
    int data;
    Node next;

    Node(int key)
    {
        this.data=key;
    }

    Node(int key,Node next)
    {
        this.data=key;
        this.next=next;
    }
}
public class insertAtIndexUsingRecursion {
    static Node insRecur(int val,int index,Node head)
    {
        head=insertRecursive(val, index, head);
        return head;
    }

    static Node insertRecursive(int val,int index,Node node)
    {
        if(index==0)
        {
            Node temp=new Node(val,node);
            return temp;
        }
        if(node.next!=null)
        {
            node.next=insertRecursive(val, index--, node.next);
        }

        return node;
    }

    static void traverse(Node head)
    {
        Node node=head;
        while(node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
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

        Node ans=insRecur(15, 2, head);
        System.out.println(ans.data);
        System.out.println(ans.next.data);
        System.out.println(ans.next.next.data);
        System.out.println(ans.next.next.next.data);
        // System.out.println(ans.next.next.next.next.data);

        
        traverse(ans);


    }
}
