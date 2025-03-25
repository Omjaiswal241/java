import java.util.*;
import java.lang.Math;
class Rotate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a no.");
        int n=sc.nextInt();
        System.out.println("Enter no. of time to rotate");
        int k=sc.nextInt();
        int d,r,l=0,f,a,b;
        f=n;
        while(f!=0)
        {
            l++;
            f=f/10;

        }
        d=k%l;
        if(d<0)
        {
            d=d+l; }
            a=n%(int)Math.pow(10,d);
            b=n/(int)Math.pow(10,d);
            r=a*(int)Math.pow(10,d-1)+b;

        
        System.out.println("rotate no."+r);
    }

}