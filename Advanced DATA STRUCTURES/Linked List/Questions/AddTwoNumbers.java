class ListNode{
    int val;
    ListNode next;

    ListNode(int key)
    {
        this.val=key;
    }

    ListNode(int key,ListNode next)
    {
        this.val=key;
        this.next=next;
    }
}

class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode temp3=dummy;
        
        int sum=0;
        int count;
        int x=0;
        int y=0;
        int n;
        while(temp1!=null || temp2!=null)
        {
            if(temp1==null)
            {
                sum=temp2.val;
            }
            
            else if(temp2==null)
            {
                sum=temp1.val;
            }
            
            else if(temp1!=null && temp2!=null)
            {
                sum=temp1.val+temp2.val;

            }
            count=countDigit(sum);
            
            if(count==2)
            {
                x=sum%10;
                n=sum/10;
                ListNode newNode=new ListNode(x);
                newNode.next=null;
                y=n%10;
                temp3.next=newNode;
                temp3=temp3.next;
                
                if(temp1!=null)
                {
                    temp1=temp1.next;
                    if(temp1!=null)
                    {
                        temp1.val=temp1.val+y;
                    }
                    else
                    {
                        int count2=countDigit(sum);
                        if(count2==2)
                        {
                            
                            ListNode newNode1=new ListNode(y);
                            newNode1.next=null;
                            temp3.next=newNode;
                        }
                    }
                }
                if(temp2!=null)
                {
                    temp2=temp2.next;

                }
                // if(temp2.next!=null)
                // {
                //     temp2=temp2.next;
                // }
            }
            
            else
            {
                ListNode newNode=new ListNode(sum);
                newNode.next=null;
                temp3.next=newNode;
                temp3=temp3.next;
                if(temp1!=null)
                {
                    temp1=temp1.next;

                }
                
                if(temp2!=null)
                {
                    temp2=temp2.next;

                }
            }
        }
        
        ListNode ans=dummy.next;
        
        return ans;
        
    }
    
    static int countDigit(int n)
    {
        return (int)Math.floor(Math.log10(n) + 1);
    }

    static void display(ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(9);
        head1.next=new ListNode(9);
        head1.next.next=new ListNode(9);
        head1.next.next.next=new ListNode(9);
        head1.next.next.next.next=null;

        // head1.next.next.next.next=new ListNode(9);
        // head1.next.next.next.next.next=new ListNode(9);
        // head1.next.next.next.next.next.next=new ListNode(9);
        // head1.next.next.next.next.next.next.next=null;



        ListNode head2=new ListNode(9);
        head2.next=null;
        // head2.next=new ListNode(9);
        // head2.next.next=new ListNode(9);
        // head2.next.next.next=new ListNode(9);
        // head2.next.next.next.next=null;

        ListNode ans=addTwoNumbers(head1, head2);
        display(ans);
    }
}
