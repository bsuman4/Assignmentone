/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagement;

import java.util.Scanner;

/**
 *
 * @author suman
 */
public class CollegeManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int absentday;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = sc.nextLine();
        System.out.println("Enter Basic salary :");
        double salary = sc.nextDouble();
        System.out.println("Enter true for teaching staff and false for non-teaching staff :");
        Boolean staffcategory = sc.nextBoolean();
        System.out.println("Enter attendence Days:");
        int attendance = sc.nextInt();

        System.out.println("Name=" + name);
        System.out.println("attendance day=" + attendance);

        if (staffcategory == true) {
            System.out.println("staff category=teaching");
        } else {
            System.out.println("staff category=non-teaching");
        }
        absentday = 30 - attendance;
        CalculateSalary calSal = new CalculateSalary();
        double netSalary = calSal.salaryCalculate(salary, attendance, staffcategory, absentday);
        System.out.println("salary=" + netSalary);
    }
}
