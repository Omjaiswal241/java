import java.util.*;
class f_functionbasics
{
    public static void happy()
        {
            System.out.println("its a good day");
        }
        public static int sum(int a,int b)
        {
            return a+b;
        }
        public static boolean iseven(int num)
        {
            return (num%2)==0;
        }
        public static int fact(int n){
        if(n==0||n==1)
        return 1;
        else
        return n*fact(n-1);
    }
        public static void main(String args[])
        {
            happy();
            System.out.println(sum(190,310));
            System.out.println(iseven(125));
            System.out.println(fact(5));
        }

    
}