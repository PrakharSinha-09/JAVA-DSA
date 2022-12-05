import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
        left=right=null;
    }
}

public class BoundaryTraversal {

    static boolean isLeaf(Node root)
    {
        return root.left==null && root.right==null;
    }

    static void addleftBoundary(Node root,ArrayList<Integer> result)
    {
        Node curr=root.left;
        while(curr!=null)
        {
            if(isLeaf(curr)==false)
            {
                result.add(curr.data);
            }
            if(curr.left!=null)
            {
                curr=curr.left;
            }
            else
            {
                curr=curr.right;
            }
        }  
    }

    static void addLeaf(Node root,ArrayList<Integer> result)
    {
        if(isLeaf(root))
        {
            result.add(root.data);
            return;
        }

        if(root.left!=null)
        {
            addLeaf(root.left, result);
        }
        if(root.right!=null)
        {
            addLeaf(root.right, result);
        }   
    }

    static void addrightBoundary(Node root, ArrayList<Integer> result)
    {
        Node curr=root.right;
        ArrayList<Integer> list=new ArrayList<>();
        while(curr!=null)
        {

            if(isLeaf(curr)==false)
            {
                list.add(curr.data);
            }
            if(curr.right!=null)
            {
                curr=curr.right;
            }
            else
            {
                curr=curr.left;
            }
        }

        for(int i=list.size()-1;i>=0;i--)
        {
            result.add(list.get(i));
        }
        
    }

    static ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList<Integer> ans = new ArrayList<Integer>(); 
	    if(isLeaf(node) == false)
        {
            ans.add(node.data);                //root node must be inserted very first
        } 
	    addleftBoundary(node, ans); 
	    addLeaf(node, ans); 
	    addrightBoundary(node, ans); 
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
        
        ArrayList<Integer> ans1=printBoundary(root);
        System.out.println(ans1);

    }
}
