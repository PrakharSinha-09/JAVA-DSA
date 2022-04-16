import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

class Pair{
    int state;
    Node root;

    Pair(Node root,int state)
    {
        this.root=root;
        this.state=state;
    }
}

public class BottomView {
    static ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        Queue<Pair> qu=new LinkedList<>();
        if(root==null)
        {
            return list1;
        }

        Map<Integer,Integer> map=new TreeMap<>();
        qu.add(new Pair(root, 0));

        while(!qu.isEmpty())
        {
            Pair pair=qu.poll();
            int line=pair.state;
            Node temp=pair.root;

            map.put(line, temp.data);

            if(temp.left!=null)
            {
                qu.add(new Pair(temp.left, line-1));
            }

            if(temp.right!=null)
            {
                qu.add(new Pair(temp.right, line+1));
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            list1.add(entry.getValue()); 
        }
        return list1;
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        ArrayList<Integer> ans=bottomView(root);
        System.out.println(ans);
    }
}
