import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
    }
}
class BFS_Tree {
    static ArrayList<Integer> BFS(Node root)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        Queue<Node> qu=new LinkedList<>();

        if(root==null)
        {
            return list1;
        }
        qu.add(root);
        while(!qu.isEmpty())
        {
            Node current=qu.poll();
            list1.add(current.data);

            if(current.left!=null)
            {
                qu.add(current.left);
            }

            if(current.right!=null)
            {
                qu.add(current.right);
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);

        ArrayList<Integer> lis=BFS(root);
        System.out.println(lis);
    }
}
