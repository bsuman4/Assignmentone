package secondtask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author suman
 */
import java.util.Scanner;

public class GreatestTwo {

    public static void main(String[] args) {
        System.out.println("Enter any Two Numbers");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("Greatest number is:" + num1);
        } else {
            System.out.println("Greatest number is:" + num2);
        }

    }

}
