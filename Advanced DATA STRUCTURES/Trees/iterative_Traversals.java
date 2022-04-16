import java.util.ArrayList;
import java.util.LinkedList;
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

public class iterative_Traversals {

    static ArrayList<Integer> preorder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Node> stk=new Stack<>();

        if(root==null)
        {
            return list;
        }
        stk.push(root);

        while(!stk.isEmpty())
        {
            Node curr=stk.pop();
            list.add(curr.data);            //after each traversal, add root's value inside the stack.

            if(curr.right!=null)
            {
                stk.push(curr.right);
            }

            if(curr.left!=null)
            {
                stk.push(curr.left);
            }
        }
        return list;
    }

    
    static ArrayList<Integer> inOrder(Node root)
    {
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Node> stk=new Stack<>();

        Node node=root;

        while(true)
        {
            if(node!=null)
            {
                stk.push(node);
                node=node.left;
            }

            else
            {
                if(stk.isEmpty())
                {
                    break;
                }
                node=stk.pop();
                list.add(node.data);
                node=node.right;
            }
        }
        return list;
    }

    static ArrayList<Integer> postOrder(Node root)
    {
        Stack<Node> stk1=new Stack<>();
        Stack<Node> stk2=new Stack<>();
        ArrayList<Integer> list=new ArrayList<>();
        
        if(root==null)
        {
            return list;
        }

        stk1.push(root);
        while(!stk1.isEmpty())
        {
            root=stk1.pop();
            stk2.add(root);

            if(root.left!=null)
            {
                stk1.push(root.left);
            }

            if(root.right!=null)
            {
                stk1.push(root.right);
            }
        }

        while(!stk2.isEmpty())
        {
            list.add(stk2.pop().data);
        }

        return list;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(7);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.left.right.left=new Node(5);
        root.left.right.right=new Node(6);

        // root.right.left=new Node(5);
        // root.right.right=new Node(15);

        ArrayList<Integer> list=preorder(root);
        System.out.println(list);

        ArrayList<Integer> list1=inOrder(root);
        System.out.println(list1);

        ArrayList<Integer> list2=postOrder(root);
        System.out.println(list2);

    }
}
