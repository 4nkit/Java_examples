package git;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        int num1=0,num2=1;
        int i,temp=0;
        System.out.println("Fabonacci Series of "+count+" elements");
        for(i=1 ; i<count ; i++)
        {
            System.out.println(num1+" ");
            temp=num1+num2;
            num1=num2;
            num2=temp;
        }
    }
}
