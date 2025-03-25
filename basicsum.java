import java.util.*;
class Basicsum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your nos.");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Enter base");
        int b=sc.nextInt();

        int borrow,sum=0,carry=0,p=0;
        while(x>0 || y>0)
        {
            int d1=x%10;
            int d2=y%10;
            borrow=d1+d2+carry;
            if(borrow>=b)
            {
                carry=1;
                borrow=borrow-b;
                sum+=borrow*(int)Math.pow(10,p);
                p++;
            }
            else{
                carry=0;
                sum+=borrow*(int)Math.pow(10,p);
                p++;
            }
            x=x/10;
            y=y/10;
        }
        System.out.println(sum);
    }
}