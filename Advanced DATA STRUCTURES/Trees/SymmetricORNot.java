class Node{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        this.data=key;
    }
}

public class SymmetricORNot{
    public static boolean isSymmetric(Node root)
    {
        return root==null || isSymmetricCheckforOthers(root.left,root.right);
    }

    public static boolean isSymmetricCheckforOthers(Node left,Node right)
    {
        if(left==null || right==null)
        {
            return left==right;
        }

        if(left.data!=right.data)
        {
            return false;
        }

        return isSymmetricCheckforOthers(left.left,right.right) && isSymmetricCheckforOthers(left.right,right.left);
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.println(isSymmetric(root));
    }
}