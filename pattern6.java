import java.util.*;
class Pattern6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your limit");
        int n=sc.nextInt();
       int sp=n/2;
       int st=1;
       int rst=1;
       int i,j;
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=sp;j++)
        {
            System.out.print(" ");
        }
        int val=rst;
        for(j=1;j<=st;j++){        
        System.out.print(val);
        if(j<=st/2){
        val++;}
    else{
        val--;
    }}
        System.out.println();
        if(i<=(n)/2){
        sp--;
        st+=2;
    rst++;}
        else{
        sp++;
        st-=2;
        rst--;
       }
        }
     }
    }
    
