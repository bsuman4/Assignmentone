/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagement;

/**
 *
 * @author suman
 */
public class CalculateSalary {

    double salaryCalculate(double salary, int attendance, boolean staffcategory, int absentday) {
        if (absentday == 0) {
            if (staffcategory == true) {
                salary = salary + salary * 0.25;
            } else {
                salary = salary + salary * 0.10;
            }
        }
        if (absentday == 1) {
            salary = salary;
        }
        if (absentday >= 2 && absentday <= 5) {
            if (staffcategory == false) {
                salary = salary - absentday * 100;

            } else {
                salary = salary - absentday * 200;
            }

        }
        if (absentday > 5 && absentday <= 10) {
            if (staffcategory == false) {
                salary = salary - 500 - (absentday - 5) * 150;

            } else {
                salary = salary - 1000 - (absentday - 5) * 250;
            }
        }
        if (absentday > 10 && absentday <= 15) {
            if (staffcategory == false) {
                salary = attendance * 200;

            } else {
                salary = attendance* 100;
            }
        }
        if (attendance<15) {
            if(staffcategory==false){
            salary = attendance * 150;
            }
            else{
            salary=attendance*50;
            }
        }
        return salary;
    }
}
 
