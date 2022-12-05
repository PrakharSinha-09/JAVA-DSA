import java.util.ArrayList;
import java.util.Collections;

class Node{
    int data;
    Node left;
    Node right;

    Node(int val)
    {
        this.data=val;
    }
}
public class Bounndary {

    static boolean isLeaf(Node root)
    {
        if(root.left==null && root.right==null)
        {
            return true;
        }
        return false;
    }
    static void  leftBound(Node root,ArrayList<Integer> lis)
    {
        Node curr=root.left;
        while(curr!=null)
        {
            if(!(isLeaf(curr)))
            {
                lis.add(curr.data);
            }

            if(curr.left!=null)
            {
                curr=curr.left;
            }
            else if(curr.right!=null)
            {
                curr=curr.right;
            }
        }
    }

    static void addLeaf(Node root,ArrayList<Integer> lis){
        if(isLeaf(root))
        {
            lis.add(root.data);
            return;
        }
        if(root.left!=null)
        {
            addLeaf(root.left, lis);
        }
        if(root.right!=null)
        {
            addLeaf(root.right, lis);
        } 
    }

    static void  rightBound(Node root,ArrayList<Integer> lis)
    {
        Node curr=root.right;
        ArrayList<Integer> list=new ArrayList<>();
        while(curr!=null)
        {
            if(!(isLeaf(curr)))
            {
                list.add(curr.data);
            }

            if(curr.right!=null)
            {
                curr=curr.right;
            }
            else if(curr.left!=null)
            {
                curr=curr.left;
            }
        }

        for(int i=list.size()-1;i>=0;i--)
        {
            lis.add(list.get(i));
        }
    }

    static ArrayList<Integer> print(Node root)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(isLeaf(root)==false)
        {
            ans.add(root.data);
        }
        leftBound(root, ans);
        addLeaf(root, ans);
        rightBound(root, ans);

        return ans;
    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.right.left=new Node(8);
        root.left.right.right=new Node(9);

        ArrayList<Integer> lis=print(root);
        System.out.println(lis);

    }
}
