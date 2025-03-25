import java.util.*;
class Digit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        // int i,d,c=0;
        // while(n>0)
        // {
        //     d=0;
        //     d=n%10;
            
        //     n=n/10;
        
        // System.out.println(d);}
        int i,r=0,d,j;
        for(i=n;i>0;i=i/10)
        {
            d=i%10;
            r=r*10+d;

        }
        for(int k=r;k>0;k=k/10)
        {
            j=0;
            j=k%10;
            System.out.println(j);
            
        }
    }
}