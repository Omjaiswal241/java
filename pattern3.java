import java.util.*;
class Pattern3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        // int i,k;
        // for(i=1;i<=(n/2)+1;i++)
        // {
        //     for(k=i;k<(n/2)+1;k++)
        //     System.out.print("\t");
        //     for(k=1;k<=(2*i)-1;k++)
        //     System.out.print("*\t");
        //     System.out.println();
        // }
        // for(i=n/2;i>0;i--)
        // {
        //     for(k=i;k<(n/2)+1;k++)
        //     System.out.print("\t");
        //     for(k=2*i-1;k>0;k--)
        //     System.out.print("*\t");
        //     System.out.println();

        // }
        // int i,k,sp,st;
        // sp=n/2;
        // st=1;
        // for(i=1;i<=n;i++)
        // {
        //     for(k=1;k<=sp;k++)
        //     System.out.print("\t");
        //     for(k=1;k<=st;k++)
        //     System.out.print("*\t");
        //     System.out.println();
        //     if(i<=(n/2)){
        //     sp--;
        //     st=st+2;}
        //     else if(i>n/2){
        //     sp++;
        //     st=st-2;
        //     }

        // }
        int r,c;
        for(r=1;r<=n;r++)
        {
            for(c=1;c<=n;c++)
            if((r+c)<(n+3)/2||(r+c)>(3*n+1)/2||(r-c)>(n-1)/2||(c-r)>(n-1)/2)
            System.out.print("\t");
            else
            System.out.print("\t*");
            System.out.println();

        }
        }
}