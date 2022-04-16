class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
    }
}

public class Check_ForBalanced_BT {
    public static boolean boolCheck(Node root)
    {
        if(height(root)!=-1)
        {
            return true;
        }
        return false;
    }

    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
    
        int leftHeight=height(root.left);
        if(leftHeight==-1)
        {
            return -1;
        }
    
        int rightHeight=height(root.right);
        if(rightHeight==-1)
        {
            return -1;
        }
    
        if(Math.abs(leftHeight-rightHeight)>1)
        {
            return -1;
        }
    
        return 1+Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        

        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        boolean balanced=boolCheck(root);
        System.out.println(balanced);
    }
}
