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
public class Diameter_BT {
    public static int diameter(Node root)
    {
        int[] diameter=new int[1];           //taking int array of size 1 because we have to pass this as a reference in height function since we cannot pass variable's reference in java, we are doing smartwork here by passing array(working as variable)
        diameter[0]=Integer.MIN_VALUE;
        height(root, diameter);
        return diameter[0];                  //on gfg, it worked on returing +1 as an addOn with diameter[0]

    }

    public static int height(Node root,int[] diameter)
    {
        if(root==null)
        {
            return 0;
        }

        int leftHeight=height(root.left, diameter);
        int rightHeight=height(root.right, diameter);
        diameter[0]=Math.max(diameter[0], (leftHeight+rightHeight));

        return 1+Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        System.out.println("Diameter of Binary Tree ="+" "+ diameter(root));
    }
}
