import java.util.*;
class Pattern9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
          if(i==j||i+j==n+1||i==1){
          System.out.print("*\t");}
          else if(i>j&&(i+j)>(n+1)&&i>(n+1)/2)
          {
            System.out.print("*\t");
          } 
          else{
          System.out.print("\t");}}
          System.out.println();

        }
    }
}