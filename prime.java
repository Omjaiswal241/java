import java.util.*;
// import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your limit");
    int l=sc.nextInt();
    int h=sc.nextInt();
    int p=0,np=0,absdiff,c,i,k;
    for(i=l;i<=h;i++)
    {
        c=0;
        for(k=1;k<=i;k++)
        
            if(i%k==0)
            c++;
        
        if(c==2)
        p+=i;
        else
        np+=i;
    }
    absdiff=Math.abs(p-np);
    System.out.println("Absolute diff="+absdiff);
}
}