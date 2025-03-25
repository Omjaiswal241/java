import java.util.*;
class Pattern2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i,k,r,c;
        // for(i=1;i<=n;i++)
        // {
        //     for(k=1;k<i;k++)
        //     System.out.print(" ");
        //     for(k=n;k>=i;k--)
        //     System.out.print("*");
        //     System.out.println();
        // }
        for(r=1;r<=n;r++){
        for(c=1;c<=n;c++)
            if(r==c||r<c)
            System.out.print("*\t");
            else
            System.out.print("\t");
            System.out.println();
        }

    
    }
}