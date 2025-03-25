import java.util.*;
class f_differenceofanybase
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter your no.");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("Enter base");
        int base=sc.nextInt();

        int difference=diff(b,a,base);                 // b>a
        System.out.println(difference);
    }
    public static int diff(int n2,int n1,int b)       //  n2>n1
    {
        int d1,d2,diff,borrow=0,pow=0,finalno=0;
        while(n2>0)
        {
        d1=n1%10;
        d2=n2%10;
        diff=d2-d1-borrow;
        if(diff>=0)
        {
            borrow=0;
        }
        else
        {
            diff+=b;
            borrow=1;
        }
        finalno+=diff*(int)Math.pow(10,pow);
        pow++;
        n1=n1/10;
        n2=n2/10;
    }
    return finalno;

    }
}