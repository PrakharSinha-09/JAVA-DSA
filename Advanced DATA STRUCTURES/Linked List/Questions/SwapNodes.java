/*
1721. Swapping Nodes in a Linked List
// https://leetcode.com/problems/swapping-nodes-in-a-linked-list/ 
*/
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) 
    {
        val = x;
        next = null;
    }
}

class SwapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        int arr[]=new int[5];
        int i=0;
        ListNode temp=head;
        while(temp!=null)
        {
            arr[i]=temp.val;
            i++;
            temp=temp.next;
        }
        
        for(i=0;i<arr.length;i++)
        {
            int tempo=arr[k-1];
            arr[k-1]=arr[arr.length-1-(k-1)];
            arr[arr.length-1-(k-1)]=tempo;
            break;
        }
        
        ListNode dummy=new ListNode(0);
        ListNode tempor=dummy;
        int j=0;
        while(j!=arr.length)
        {
            tempor.next=new ListNode(arr[j]);
            tempor=tempor.next;
            j++;
        }
        
        return dummy.next;
    }
}