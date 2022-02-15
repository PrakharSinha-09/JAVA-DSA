public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=4;
    int end=-1;

    public CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    
    public CustomQueue(int size) {
        this.data=new int[size];
    }

    public boolean isFull()
    {
        if(end==data.length-1)
        {
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if(end==-1)
        {
            return true;
        }
        return false;
    }

    public boolean enqueue(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return false;
        }
        end++;
        data[end]=item;

        return true;
    }

    public int dequeue() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Queue is Empty!");
        }

        int removed=data[0];                     //Since in queue we follow FIRST IN FIRST OUT...So, first element has to remob=ved everytime while dequeue
        //shift the elements to the left.
        for(int i=1;i<=end;i++)                     //Obviously Shiftinf will starts from the first index itself.
        {
            data[i-1]=data[i];
        }
        end--;

        return removed;
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty!...Nothing to peek");
        }
        return data[0];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Nothing TO Display");
            return;
        }
        for(int i=0;i<=end;i++)
        {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        CustomQueue que=new CustomQueue();
        que.enqueue(4);
        que.enqueue(5);
        que.enqueue(6);
        que.enqueue(46);
        //que.enqueue(46);
        que.dequeue();
        que.display();
    }
}
