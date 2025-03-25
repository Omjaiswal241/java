import java.util.*;
class Prime3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int i,c,k;
        boolean f=true;
        if(n==1){
        System.out.println("not prime");}
        else if(n>1){
        for(i=2;i<n;i++)
        {
            if(n%i==0){
            f=false;
            break;}
        }
        if(f==true)
        System.out.println("Prime");
        else
        System.out.println("not prime");}
        else
        System.out.println("not prime");

    }}