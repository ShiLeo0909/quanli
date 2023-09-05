package oop1;

import java.util.Scanner;

public class vensionContributionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the monthly salary");
        int wage = sc.nextInt();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        pensionContributionCalculator(wage , age);
    }
    public static void pensionContributionCalculator(int wage , int age){
        double EMPLOYEERATE_55_AND_BELOW = 0.2 ;
        double EMPLOYERRATE_55_AND_BELOW = 0.17 ;
        double EMPLOYEERATE_55_TO_60 = 0.13 ;
        double EMPLOYERRATE_55_TO_60 = 0.13 ;
        double EMPLOYEERATE_60_TO_65 = 0.075 ;
        double EMPLOYERRATE_60_TO_65 = 0.09 ;
        double EMPLOYEERATE_65_ABOVE = 0.05 ;
        double EMPLOYERRATE_65_ABOVE = 0.075 ;
        double wageEmployee = 0.00;
        double wageEmployer = 0.00;
        double sumWage = 0.00;
        double wageRemaining = 0.0;
        if (wage <= 6000) {
            if (age < 55) {
                wageEmployee = wage * EMPLOYEERATE_55_AND_BELOW;
                wageEmployer = wage * EMPLOYERRATE_55_AND_BELOW;
            } else if (55 <= age && age < 60) {
                wageEmployee = wage * EMPLOYEERATE_55_TO_60;
                wageEmployer = wage * EMPLOYERRATE_55_TO_60;
            } else if (60 <= age && age < 65) {
                wageEmployee = wage * EMPLOYEERATE_60_TO_65;
                wageEmployer = wage * EMPLOYERRATE_60_TO_65;
            } else {
                wageEmployee = wage * EMPLOYERRATE_65_ABOVE;
                wageEmployer = wage * EMPLOYEERATE_65_ABOVE;
            }
        }else{
            wage = 6000;
            wageRemaining = wage - 6000;
                if (age < 55) {
                    wageEmployee = wage * EMPLOYEERATE_55_AND_BELOW;
                    wageEmployer = wage * EMPLOYEERATE_55_AND_BELOW;
                } else if (55 <= age && age < 60) {
                    wageEmployee = wage * EMPLOYEERATE_55_TO_60;
                    wageEmployer = wage * EMPLOYEERATE_55_TO_60;
                } else if (60 <= age && age < 65) {
                    wageEmployee = wage * EMPLOYEERATE_60_TO_65;
                    wageEmployer = wage * EMPLOYERRATE_60_TO_65;
                } else {
                    wageEmployee = wage * EMPLOYERRATE_65_ABOVE;
                    wageEmployer = wage * EMPLOYEERATE_65_ABOVE;
                }
        }
        sumWage = wageEmployee+wageEmployer;
        System.out.printf("The employee's contribution is : $" + wageEmployee + "%.2f" );
        System.out.printf("The employer's contribution is : $"  + wageEmployer);
        System.out.printf("THe tatal contribution is : $" + sumWage);
    }

}
