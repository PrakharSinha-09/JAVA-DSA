/*
AGENDA: To Print The Desired Pattern.
*/

class PatternQues{
    public static void main(String[] args){
        /*
        Desired 1: Solid Rectangle
            * * * * *
            * * * * * 
            * * * * *
            * * * * * 

        int i,j,n=4;
        for(i=0;i<n;i++)
        {
            for(j=0;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /*
        Desired 2: Hollow Rectangle
            * * * * *
            *       * 
            *       *
            * * * * * 
        
        int i,j,n=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n+1;j++)
            {
                if(i==1 || j==1 || i==n || j==(n+1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        */

        /*
        Desired 3: Half Pyramid
            * 
            * *  
            * * *
            * * * * 
        
        int i,j,n=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /*
        Desired 4:Inverted Half Pyramid
            * * * *
            * * * 
            * * 
            *
        
        int i,j,n=4;
        for(i=1;i<=n;i++)                    //or i=n;i>=1;i--
        {
            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /*
        Desired 5:Inverted Half Pyramid(Rotated By 180)
                  *
                * *
              * * *
            * * * *
        
        int i,j,n=4;
        for(i=1;i<=n;i++)                      
        {
            for(j=i;j<=n-1;j++)
            {
                System.out.print("  ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /*
        Desired 6: Half Pyramid with Numbers
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5 
       
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        } 
         */

        /*
        Desired 7:Inverted Half Pyramid with Numbers
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
             
        int i,j,n=5;
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        */

        /*
        Desired 8: Floyd's Triangle
            1
            2  3
            4  5  6
            7  8  9  10
            11 12 13 14 15 
        
        int i,j,n=5;
        int num=1;  
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        } 
        */

        /*
        Desired 8: 0-1 Triangle
           1
           0 1
           1 0 1
           0 1 0 1
           1 0 1 0 1 
        
        int i,j,n=5;
        int num=1;  
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
               if((i+j)%2==0)                          //because 1 is getting prined whenever sum of (i+j) is even.
               {
                   System.out.print("1 ");
               }
               else
               {
                    System.out.print("0 ");
               }
            }
            System.out.println();
        } 
        */

        /*
        Desired 9: Solid Rhombus
               * * * * *
             * * * * *
           * * * * *
         * * * * *
       * * * * * 

        
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print("  ");
            }

            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        /*
        Desired 10:Pyramid with Numbers
                 1
               2   2
             3   3   3
           4   4   4   4
         5   5   5   5   5 
       
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<n;j++)
            {
                System.out.print(" ");
            }

            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        } 
        */

         /*
        Desired 11: ButterflyPattern
            *             *
            * *         * *
            * * *     * * *
            * * * * * * * *
            * * * * * * * *
            * * *     * * *
            * *         * *
            *             *
        
        int i,j,n=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }

            for(j=i;j<n;j++)
            {
                System.out.print("  ");
            }

            for(j=i;j<n;j++)
            {
                System.out.print("  ");
            }

            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }

            for(j=1;j<i;j++)
            {     
                System.out.print("  ");    
            }

            for(j=1;j<i;j++)
            {   
                System.out.print("  ");
            }

            for(j=i;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        int k,l,m=5;
        for(k=1;k<=m;k++)
        {
            for(l=5;l>=k;l--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}