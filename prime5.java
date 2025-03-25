import java.util.*;
class Prime5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int i,c,k,f=0;
        // if(n==1){
        // System.out.println("not prime");}
        // else if(n>1){
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0){
            f=1;
            break;}
        }
        if(f==0)
        System.out.println("Prime");
        else
        System.out.println("not prime");}
        // else
        // System.out.println("not prime");

    }