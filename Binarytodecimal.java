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
public class Binarytodecimal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        String str =sc.nextLine();
        System.out.println("Output: "+Integer.parseInt(str,2));
    }
    
}
