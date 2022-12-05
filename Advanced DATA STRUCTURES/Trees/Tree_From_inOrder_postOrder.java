import java.util.ArrayList;
import java.util.HashMap;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
    }
}
public class Tree_From_inOrder_postOrder {
    static Node buildTree(int[] inorder,int[] postorder)
    {
        if(inorder==null || postorder==null || postorder.length!=inorder.length)
        {
            return null;
        }

        HashMap<Integer,Integer> imap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            imap.put(inorder[i], i);
        }

        Node root=construct(inorder,0,inorder.length-1,postorder,0,postorder.length-1,imap);
        return root;
        
    }

    static Node construct(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd,HashMap<Integer,Integer> imap)
    {
        if(inStart>inEnd || postStart>postEnd)
        {
            return null;
        }

        Node root=new Node(postorder[postEnd]);
        int inRoot=imap.get(root.data);
        int numsleft=inRoot-inStart;

        root.left=construct(inorder, inStart, inRoot-1, postorder, postStart, postStart+numsleft-1, imap);
        root.right=construct(inorder, inRoot+1, inEnd, postorder, postStart+numsleft, postEnd-1, imap);

        return root;
    }


    static void traverse(Node node,ArrayList<Integer> lis)
    {
        if(node==null)
        {
            return;
        }
        lis.add(node.data);
        traverse(node.left, lis);
        traverse(node.right, lis);   
    }

    static ArrayList<Integer> traversing(Node node)
    {
        ArrayList<Integer> lis=new ArrayList<>();
        if(node==null)
        {
            return lis;
        }
        traverse(node, lis);
        return lis;
    }

    public static void main(String[] args) {
        int[] inOrder={9,3,15,20,7};
        int[] postOrder={3,9,20,15,7};

        Node ans=buildTree(inOrder, postOrder);
        ArrayList<Integer> res=traversing(ans);
        System.out.println(res);
        
    }
}
