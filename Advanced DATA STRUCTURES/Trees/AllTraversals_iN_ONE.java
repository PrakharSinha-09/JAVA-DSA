import java.util.ArrayList;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int key)
    {
        this.data=key;
    }
}

class Pair {
    Node node; 
    int num; 
    Pair(Node node, int num) {
        this.num = num; 
        this.node = node; 
    }
}

public class AllTraversals_iN_ONE {
    public static ArrayList<Integer> traverse(Node root)
    {
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));                //passing instance of pair class so, using new along with Pair
        ArrayList<Integer> preOrder=new ArrayList<>();
        ArrayList<Integer> inOrder=new ArrayList<>();
        ArrayList<Integer> postOrder=new ArrayList<>();

        if(root==null)
        {
            return preOrder;
        }

        while(!st.isEmpty())
        {   
            Pair curr=st.pop();
            if(curr.num==1)
            {
                preOrder.add(curr.node.data);
                curr.num++;
                st.push(curr);

                if(curr.node.left!=null)
                {
                    st.push(new Pair(curr.node.left,1));
                }
            }

            else if(curr.num==2)
            {
                inOrder.add(curr.node.data);
                curr.num++;
                st.push(curr);

                if(curr.node.right!=null)
                {
                    st.push(new Pair(curr.node.right,1));
                }
            }

            else
            {
                postOrder.add(curr.node.data);
            }
        }

        return inOrder;

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left=new Node(5);
        root.right.right=new Node(8);

        System.out.println(traverse(root));

    }
}
