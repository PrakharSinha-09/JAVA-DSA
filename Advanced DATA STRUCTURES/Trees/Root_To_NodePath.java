import java.util.ArrayList;
import java.util.Scanner;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
    }
}
class Root_To_NodePath {
    static boolean getPath(Node root,ArrayList<Integer> lis,int x)
    {
        if(root==null)
        {
            return false;
        }

        lis.add(root.data);
        if(root.data==x)
        {
            return true;
        }

        if(getPath(root.left, lis, x) || getPath(root.right, lis, x))
        {
            return true;
        }

        lis.remove(lis.size()-1);
        return false;
    }

    static ArrayList<Integer> path(Node root,int x)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        if(root==null)
        {
            return list1;
        }
        getPath(root, list1, x);
        return list1;
    }

    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        ArrayList<Integer> ans=path(root, 15);
        System.out.println(ans);

    
    }
}
