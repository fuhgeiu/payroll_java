

public class main {

    public static void main(String[] args) {

        System.out.println("welcome to payroll lab");

        /*

         program flow

            get and set hours worked    , prompt input -> read input -> set user data to input, call interface method to set and get hours

            get and set dependents      , prompt input -> read input -> set user data to input, call interface method to set and get dependents

            print out user pay data     , call func to print data, call interface method to set and get user data

         */


        payroll_data User = new payroll_data(16.78,1.5);                 // creates new user

        Interface interface1 = new Interface();                 // create new interface


        interface1.get_and_set_hours_worked(User);              // get and set hours worked to user

        interface1.get_and_set_dependents(User);                // gets and sets number of dependents

        interface1.print_out_user_data(User);                   // prints out user info

    }

}