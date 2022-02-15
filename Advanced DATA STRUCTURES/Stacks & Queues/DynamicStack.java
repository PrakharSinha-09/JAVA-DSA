public class DynamicStack extends CustomStack{
    public DynamicStack()
    {
        super();
    }

    public DynamicStack(int size)
    {
        super(size);
    }

    @Override
    public boolean push(int item) {
        //this will take care of the data being full!...if it got full this will get implemented else super class mein hi push krdenge
        if(this.isFull())
        {
            int temp[]=new int[data.length*2];

            //Copy all previous items in new data 
            for(int i=0;i<data.length;i++)
            {
                temp[i]=data[i];
            }

            data=temp;
        }

        return super.push(item);
    }
}
