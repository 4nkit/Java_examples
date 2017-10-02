/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package git;
import java.util.Scanner;

/**
 *
 * @author Ankit
 */
public class Factorial {
    public int fact(int f)
    {
    int ans=1;
    for(int i=1;i<=f;i++)
    {
        ans=ans*i;
    }
    return ans;
    }
    public static void main(String[] args)
    {
        Factorial x=new Factorial();
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=x.fact(num);
        System.out.println("Factorial of a number is "+res);
    }
}
