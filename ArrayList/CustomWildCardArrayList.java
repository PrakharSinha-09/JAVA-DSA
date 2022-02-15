import java.util.ArrayList;
import java.util.Arrays;

public class CustomWildCardArrayList<T extends Number> {       //<? extends class> you want to extend this will ensure that your list cntains there subclasses numbers or numbers itself
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;           //also working as index

    public CustomWildCardArrayList()
    {
        this.data=new Object[DEFAULT_SIZE];
    }

    public void add(T num)
    {
        if(isFull())    
        {
            resize();
        }
        data[size++]=num;                       //data being of Object class is like god...so while you are adding/inserting in big class type you dont need to cast into...if you are doing converse then you have to cast so that you get your desired answer in lower class type
    }

    private void resize()
    {
        Object []temp=new Object[DEFAULT_SIZE*2];

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

    public T remove()
    {       
         size--;
         //here we are putting bigger class value in lower class hence casting is done
         T removed=(T)data[size];             //the size which was pointing to the last element initially,now pointing to the second last element
         return removed;
    }

    public T get(int index)
    {
        return (T)data[index];
    }

    public int size()
    {
        return size;    
    }

    public void set(int index,T value)
    {
        data[index]=value; 
    }

    @Override
    public String toString()
    {
        return "CustomArrayList{ "+"data= "+ Arrays.toString(data)+" ,size="+ size +"}";
    }
    public static void main(String[] args) {
        CustomWildCardArrayList<Integer> list=new CustomWildCardArrayList<>();
        list.add(2);
        list.add(3);
        for(int i=0;i<15;i++)
        {
            list.add(2*i);
        }
        System.out.println(list);
        

        //this will throw error now obviously because we have restricted our custom arrayList usage for only those classes which extends Number class
        // CustomWildCardArrayList<String> list=new CustomWildCardArrayList<>();
        // list.add("uhu");
    }
}
