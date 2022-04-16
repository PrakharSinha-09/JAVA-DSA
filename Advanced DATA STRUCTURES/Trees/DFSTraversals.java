class Node
{
    int data;
    Node prev;
    Node next;
    
    Node(int key)
    {
        this.data=key;
    }
}

public class DFSTraversals{

    static void preOrder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.println(node.data);
        preOrder(node.prev);
        preOrder(node.next);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.prev=new Node(2);
        root.next=new Node(3);
        root.next.prev=new Node(5);
        root.next.next=new Node(8);

        preOrder(root);

    }
}
