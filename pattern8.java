import java.util.*;
class Pattern8 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int i,j,r=1;
        for(i=1;i<=n;i++)
        {
            int sp=(i==(n+1)/2)?0:(n/2);
            for(j=1;j<=sp;j++)
            System.out.print("\t"); 


           int lst=(i==(n+1)/2)?n/2:0;
           for(j=1;j<=lst;j++)
           System.out.print("\t*");


            
            for(j=1;j<=r;j++)
            System.out.print("\t*");
            if(i<=n/2)
            r++;
            else
            r--;

            
            System.out.println();
        }

    }
}