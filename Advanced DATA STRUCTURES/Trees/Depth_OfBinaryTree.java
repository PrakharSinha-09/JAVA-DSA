class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
    }
}

public class Depth_OfBinaryTree{
    public static int depth(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=depth(root.left);
        int right=depth(root.right);

        return 1+Math.max(left, right);
    } 
  
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);

        System.out.println("Depth OF Binary Tree is"+" " +depth(root));
    }
}