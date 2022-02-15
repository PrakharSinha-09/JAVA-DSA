/*
AGENDA: To learn about methods/functions
*/

class Lec7{

    public static void printName(String name)
    {
        System.out.println(name);
        return;                             //wherever you are, just come out of that block.
    }

    static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    static void change(int[] arr)
    {
        arr[0]=99;
    }
    public static void main(String[] args)
    {
        printName("Prakhar Sinha");          //function calling
        int factor;
        factor=factorial(5);
        System.out.println(factor);

        int[] nums={3,5,2,7,8};
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        change(nums);                                 //copy of this refernce variable(num) is passed into function. So, now both arr and num are pointing to the same object
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        
    }
}