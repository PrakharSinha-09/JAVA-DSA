class Node{
    int data;
    Node prev;
    Node next;

    public Node(int key)
    {
        this.data=key;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.prev=new Node(2);
        root.next=new Node(3);
        root.next.prev=new Node(5);
    }
}