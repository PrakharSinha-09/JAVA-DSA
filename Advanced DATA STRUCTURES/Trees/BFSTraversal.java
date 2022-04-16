import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key)
    {
        this.data=key;
    }
}

class BFSTraversal {

    static ArrayList<Integer> bfs(Node node)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Node> qu=new LinkedList<>();

        if(node==null)
        {
            return list;
        }
        qu.add(node);

        while(!qu.isEmpty())
        {
            Node current=qu.poll();
            list.add(current.data);

            if(current.left!=null)
            {
                qu.add(current.left);
            }

            if(current.right!=null)
            {
                qu.add(current.right);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(15);

        ArrayList<Integer> list=bfs(root);
        System.out.print(list);

    }
}
