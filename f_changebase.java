import java.util.*;
class f_changebase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter your no. other than decimal and its base");
        int n=sc.nextInt();
        int b=sc.nextInt();

        int e=anybasetodecimal(n,b);
        System.out.println(e);
        
      

        System.out.println("Enter decimal no. and base to change"); 
        int c=sc.nextInt();
        int d=sc.nextInt();
        
        int f=decimaltoanybase(c,d);
        System.out.println(f);

        System.out.println(decimaltoanybase(e,d));
    }
    public static int anybasetodecimal(int a,int b)
    {
        int d,i,sum=0,r=0;
        for(i=a;i>0;i=i/10) 
        {
            d=i%10;
            sum+=d*(int)Math.pow(b,r);
            r++;
        }
        return sum;
    }
    public static int decimaltoanybase(int a,int b)
    {
        int i,r=0,sum=0,d;
        while(a>0)
        {
            d=a%b;
            sum+=d*(int)Math.pow(10,r);
            a=a/b;
            r++;


        }
        return sum;


        
        }
    }

