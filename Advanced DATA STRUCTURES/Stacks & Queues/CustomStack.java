public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE=4;
    int top=-1;

    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    
    public CustomStack(int size) {
        this.data=new int[size];
    }

    public boolean isFull()
    {
        if(top==data.length-1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        return false;
    }

    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is Full...No Further Push Possible!");
            return false;
        }
        top++;
        data[top]=item;
        return true;
    }

    public int pop() throws Exception               
    {
        if(isEmpty())
        {
            throw new Exception("Cannot Pop from an empty Stack");
        }

        int removed=data[top];              
        top--;
        return removed;
    
    }

    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Cannot Peek from an empty Stack");
        }
        return data[top];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.print(data[i]+" ");
            }
        }   
    }
    public static void main(String[] args) throws Exception {
        DynamicStack stack=new DynamicStack();
        stack.push(4);
        stack.push(5);
        stack.push(56);
        stack.push(6);
    

        //Since we are again trying to push it won't get pushed ass array is full...so we created the dynamic Stack class...lets create instance of that calss and then do the following task 
        stack.push(26);
        stack.push(16);

    
        //stack.pop();
        stack.display();
    }
}
