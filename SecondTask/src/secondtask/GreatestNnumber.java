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

public class GreatestNnumber {

    public static void main(String[] args) {
        System.out.println("Among how many number you want to find the greatest one?");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int greatone[];
        greatone = new int[num1];
        System.out.println("Enter the numbers from which you want to find the greatest one");
        int greatest = greatone[0];
        for (int count = 0; count < num1; count++) {
            greatone[count] = sc.nextInt();
        }
        for (int count = 0; count < num1; count++) {
            if (greatone[count] > greatest) {
                greatest = greatone[count];
            } 
            if(greatone[count] <= greatest) {
                greatest = greatest;
            }
        }
        System.out.println("Greatest among N number is:" + greatest);
    }

}
