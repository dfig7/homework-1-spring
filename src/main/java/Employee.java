public class Employee {
    private String name="";
    private String id="";
    private double hoursWorked=0;
    private double hourRate=0;
    private double netPay=0;
    private double grossPay = 0;
    private double tax = 0;



   /* public Employee() {
        this.name = name;
        this.id = id;
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }

    */

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public double getRate() {
        return hourRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getNetPay() {
        return netPay;
    }

    public double getGrossPay(){
        return grossPay;
    }

    public double getTax(){
        return tax;
    }

////////

    public void setName(String newName) {
        this.name = newName;
    }

    public void setID(String newID) {
        this.id = newID;
    }

    public void setRate(double newRate) {
        this.hourRate = newRate;
    }

    public void setHoursWorked(double newHours) {
        this.hoursWorked = newHours;
    }

    /////////

    public void calcNetPay() {
        this.netPay = (hoursWorked * hourRate) - (hoursWorked * hourRate * .06);
    }

    public void calcGrossPay() {
        this.grossPay = hoursWorked*hourRate;
    }

    public void calcTax(){
        this.tax = hoursWorked * hourRate * .06;
    }



}
