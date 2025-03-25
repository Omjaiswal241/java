import java.util.*;
class Prime4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no. of element");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int k,c;
        c=0;
        for(k=1;k<=n;k++)
        {
            if(n%k==0)
            c++;

        }
       if(c==2)
       System.out.println("Prime");
       else
       System.out.println("not prime");
    }
}}