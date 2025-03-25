import java.util.*;
class Inverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int i,d,r=0,c=0;
        for(i=n;i>0;i=i/10)
        {
            d=i%10;
            c++;
            r+=c*(int)Math.pow(10,d-1);
        }
        System.out.println("Inverse no."+r);
    }
}