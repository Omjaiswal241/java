import java.util.*;
class pattern5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=sc.nextInt();
        int i,k;
        int str=(n+1)/2;
        int sp=1;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=str;k++){
            System.out.print("*\t");}
            for(k=1;k<=sp;k++){
            System.out.print("\t");}
            for(k=1;k<=str;k++){
            System.out.print("*\t");}
            System.out.println();
           if(i<=n/2)
           { sp=sp+2;
            str--;
        }
            else if(i>n/2)
            {
            sp=sp-2;
            str=str+1;
        }
            
        }
        
    }
}