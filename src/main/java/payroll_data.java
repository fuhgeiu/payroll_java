

public class payroll_data {

    private String name;
    private double hours_worked;
    private int dependents;
    private double base_pay;
    private double overtime_multipler;

/*

private void set_hours_worked (double hours) { this.hours_worked = hours; }

private void set_dependents (int dependents) { this.dependents = dependents; }

private void setBase_pay (double base_pay) { this.base_pay = base_pay; }

private void setOvertime_multipler (double multipler) { this.overtime_multipler = multipler; }

 */

public payroll_data() {}

public payroll_data (String Name) { this.name = Name; }

public payroll_data (String Name, double hours_worked) { this.name = Name; this.hours_worked = hours_worked; }


public payroll_data (String Name, double hours_worked, int dependents) {

    this.name = Name; this.hours_worked = hours_worked;
}


public payroll_data (double base_pay, double overtime_multiplier) {

    this.base_pay = base_pay; this.overtime_multipler = overtime_multiplier;
}


public void set_hours_work (double hours) { this.hours_worked = hours; }

public void set_dependent (int dependents) { this.dependents = dependents; }

public void set_base_pay(double base_pay) { this.base_pay = base_pay; }

public void set_overtime_multipler (double multipler) { this.overtime_multipler = multipler;}

public double get_hours () {return hours_worked;}

public int  get_dependents() {return dependents;}

public double get_base_pay() {return base_pay;}
public double get_overtime_multipler() {return overtime_multipler;}


}