import java.util.Scanner;


/*
    interface

        public

            create user for storing and calculating pay data, call constructor for payroll data

                base () , calls default
                hours and dependents (double,int) , calls hours and dependents base
                pay (double, int) , calls pay base


            set user data

                pay (double,int)

     get and set hours worked

     get and set dependents

     print out user data


 */

public class Interface {

    public void get_and_set_hours_worked (payroll_data user_data) {

        double hours_worked;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of hours worked \n");

        hours_worked = scanner.nextDouble();

        user_data.set_hours_work(hours_worked);
    }

    public void get_and_set_dependents (payroll_data user_data) {

        int dependents;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number of dependents \n");

        dependents = scanner.nextInt();

        user_data.set_dependent(dependents);

    }

    public void print_out_user_data (payroll_data user_data) {

        double hours_worked = user_data.get_hours();
        double base_pay = user_data.get_base_pay();
        double gross_pay;

        System.out.println("     Pay Stub  \n\n");
        System.out.println(" Hours: " + hours_worked);
        System.out.println(" Hourly pay: " + base_pay + "/hour");

        if (hours_worked > 40) {

            gross_pay = ((hours_worked-40)*(user_data.get_overtime_multipler()*base_pay))+(40*base_pay);
            System.out.println(" Gross pay: " + gross_pay);
        }

        else  {gross_pay = hours_worked*base_pay; System.out.println(" Gross pay: " + gross_pay + "\n\n");}

        double socSec = gross_pay * 0.06;
        double fedTax = gross_pay * 0.14;
        double stTax = gross_pay * 0.05;
        double union = 10;
        double insurance = (user_data.get_dependents() >= 3) ? 35 : 15;

        double Net = gross_pay - socSec - fedTax - stTax - union - insurance;

        System.out.println("  SocSec: " +socSec);
        System.out.println("  FedTax: " + fedTax);
        System.out.println("   StTax: " + stTax);
        System.out.println("   Union: " + union);
        System.out.println("     Ins: " + insurance);

        System.out.println("     Net: " + Net);

        System.out.println("Thank you for using the Payroll Program!");

        /*
            expenses

            14% federal income
            6% social security
            5% state income tax
            10$ union dues
            3 or more dependents is 35$ and everyone else 15$

            net = gross - expenses
         */





    }

}