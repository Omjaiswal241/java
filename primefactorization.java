import java.util.*;
class Primefactorization
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int i;
        for(i=2;i<=n;i++)
        {
            while(n%i==0){
            System.out.print(i+" ");
          n=n/i;
        }
    }
    }
        
    }
