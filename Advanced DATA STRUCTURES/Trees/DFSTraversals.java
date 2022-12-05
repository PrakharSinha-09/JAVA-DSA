import java.util.ArrayList;

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

    static void preOrder(Node node,ArrayList<Integer> lis)
    {
        if(node==null)
        {
            return;
        }
        lis.add(node.data);
        preOrder(node.prev,lis);
        preOrder(node.next,lis);
    }

    static ArrayList<Integer> preOrderr(Node node)
    {
        ArrayList<Integer> lis=new ArrayList<>();   
        if(node==null)
        {
            return lis;
        }
        preOrder(node, lis);
        return lis;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.prev=new Node(2);
        root.next=new Node(3);
        root.next.prev=new Node(5);
        root.next.next=new Node(8);

        ArrayList<Integer> ans=preOrderr(root);
        System.out.println(ans);


    }
}
