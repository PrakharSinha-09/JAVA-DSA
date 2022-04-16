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

class maxSumPath
{
    public static int maxPath(Node root)
    {
        int maxValue[]=new int[1];
        maxValue[0]=Integer.MIN_VALUE;
        maxPath(root, maxValue);
        return maxValue[0];
    }

    public static int maxPath(Node root,int maxValue[])
    {
        if(root==null)
        {
            return 0;
        }

        int leftPath=Math.max(0, maxPath(root.left, maxValue));
        int rightPath=Math.max(0, maxPath(root.right, maxValue));

        maxValue[0]=Math.max(maxValue[0], (leftPath+rightPath+root.data));

        return root.data + Math.max(leftPath, rightPath);

    }
}
public class Maximum_PathSum {
    public static void main(String[] args) {
        Node root=new Node(-10);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);

        //maxSumPath ms=new maxSumPath();
        System.out.println(maxSumPath.maxPath(root));
    }    
}
