import java.util.*;
class Linearsearch
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. to be search");
        int val=sc.nextInt();
        System.out.println("Enter your nos. of element");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int i,f=0;
        System.out.println("Enter array");
        for(i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(ar[i]==val)
            f=1;
        }
        if(f==1)
        System.out.println(val+"Element found at"+i);
        else
        System.out.println("Not Found");
    }
}