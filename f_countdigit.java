import java.util.*;
class f_countdigit {
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your no.,digit");
    int n=sc.nextInt();
    int d=sc.nextInt();
    System.out.println(freqdigit(n,d));
    }
    public static int freqdigit(int a,int b)
    {
        int c=0,d;
        for(int i=a;i>0;i=i/10)
        {
            d=i%10;
            if(d==b)
            c++;}
            return c;

        }
    }
