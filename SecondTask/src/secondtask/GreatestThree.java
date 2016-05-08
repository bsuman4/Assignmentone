/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondtask;

/**
 *
 * @author suman
 */
import java.util.Scanner;

public class GreatestThree {

    public static void main(String[] args) {
        System.out.println("Enter three number to find the greatest one");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("greatest is:" + num1);

            } else {
                System.out.println("Greatest is:" + num3);
            }
        } else if (num2 > num3) {
            System.out.println("Greatest number is:" + num2);
        } else {
            System.out.println("Greatest number is:" + num3);
        }

    }

}
