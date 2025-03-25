import java.util.*;
class Grading
{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks");
        int m=sc.nextInt();
        if(m>90)
        System.out.println("Excellent");
        else if(m>80&&m<=90)
        System.out.println("good");
        else if(m>70&&m<=80)
        System.out.println("fair");
        else if(m>60&&m<=70)
        System.out.println("Meets Expectations");
        else
        System.out.println("Below Par");
    }
}