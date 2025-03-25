import java.util.*;
class f_sumofanybase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your nos.");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Enter base");
        int b=sc.nextInt();
        
        int sum=sum(x,y,b);
        System.out.println(sum);
    }
    public static int sum(int n1,int n2,int b)
    {
        int carry=0,sum=0,digit,power=0,d1,d2,finalsum=0;
        while(n1>0 || n2>0 )
        {
            d1=n1%10;
            d2=n2%10;
            sum=d1+d2+carry;
            digit=sum%b;
            carry=sum/b;
            finalsum+=digit*(int)Math.pow(10,power);
            power++;
            n1=n1/10;
            n2=n2/10;
        }   
        return finalsum;
    }
}
