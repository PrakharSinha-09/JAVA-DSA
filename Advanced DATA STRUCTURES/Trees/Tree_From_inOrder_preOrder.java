import java.util.ArrayList;
import java.util.Arrays; 
import java.util.HashMap;
import java.util.Map;

class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
    }
}

public class Tree_From_inOrder_preOrder {
    static Node contructTree(int[] inorder,int[] preorder)
    {
        Map<Integer,Integer> inOrdermap=new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inOrdermap.put(inorder[i], i);
        }

        Node root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inOrdermap);
        return root;
    }

    static Node buildTree(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd,Map<Integer,Integer> inMap)
    {
        if(preStart>preEnd || inStart>inEnd)
        {
            return null;
        }

        Node root=new Node(preorder[preStart]);
        int indexRoot=inMap.get(root.data);
        int numsLeft=indexRoot-inStart;

        root.left=buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,indexRoot-1,inMap);
        root.right=buildTree(preorder, preStart+numsLeft+1, preEnd, inorder, indexRoot+1, inEnd, inMap);

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
        int[] preOrder={3,9,20,15,7};
        int[] inOrder={9,3,15,20,7};

        Node ans=contructTree(inOrder, preOrder);
        ArrayList<Integer> res=traversing(ans);
        System.out.println(res);
        
    }
}
