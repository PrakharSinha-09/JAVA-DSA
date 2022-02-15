import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList{
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;           //also working as index

    public CustomArrayList()
    {
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num)
    {
        if(isFull())    
        {
            resize();
        }
        data[size++]=num;
    }

    private void resize()
    {
        int []temp=new int[DEFAULT_SIZE*2];

        //copy the current items in the new array
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;                    //new temporary array ko revert krke purane array ka reference dediya
    }

    private boolean isFull()
    {
        return size==data.length;
    }

    public int remove()
    {       
         size--;
         int removed=data[size];             //the size which was pointing to the last element initially,now pointing to the second last element
         return removed;
    }

    public int get(int index)
    {
        return data[index];
    }

    public int size()
    {
        return size;    
    }

    public void set(int index,int value)
    {
        data[index]=value; 
    }

    @Override
    public String toString()
    {
        return "CustomArrayList{ "+"data= "+ Arrays.toString(data)+" ,size="+ size +"}";
    }
    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(3);
        
        ArrayList lis=new ArrayList();
        lis.add("uh");
        lis.add("67");
        System.out.println(lis);
        System.out.println(list.get(2));
        System.out.println(list.remove());
        System.out.println(list);
    }
}