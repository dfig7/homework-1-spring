import java.util.Scanner;

public class homework1 {
    static Employee emp1 = new Employee();
    public static final Scanner input = new Scanner(System.in);

    public static void askQuestions() {

        System.out.println("Enter the Employee's full name: ");
        emp1.setName(input.nextLine());
        System.out.println("Enter the Employee's number: ");
        emp1.setID(input.nextLine());
        System.out.println("Enter the pay rate per hour: ");
        emp1.setRate(input.nextDouble());
        System.out.println("Enter the regular hours worked: ");
        emp1.setHoursWorked(input.nextDouble());
        System.out.println("Thank you!\n\nHere is your paycheck!\n");
    }

    public static void printPaycheck(){
        emp1.calcNetPay();
        emp1.calcGrossPay();
        emp1.calcTax();

        String q1 = "Employee's name:";
        String q2 = "Employee's number:";
        String q3 = "Hourly rate of pay:";
        String q4 = "Hours worked:";
        String q5 = "Total Gross Pay:$";
        String q6 = "Deductions Tax (6%%):$";
        String q7 = "Net Pay:$";

        System.out.printf("%n------------------------------------------%n%n");

        System.out.printf("%-30s %10s %n", q1, emp1.getName());
        System.out.printf("%-30s %10s %n", q2, emp1.getID());
        System.out.printf("%-30s %10.2f %n", q3, emp1.getRate());
        System.out.printf("%-30s %10.2f %n%n", q4, emp1.getHoursWorked());
        System.out.printf("%-30s %10.2f %n%n", q5, emp1.getGrossPay());
        System.out.printf("%-30s %10.2f %n%n", q6, emp1.getTax());
        System.out.printf("%-30s %10.2f %n%n", q7, emp1.getNetPay());

        System.out.printf("------------------------------------------%n%nBye!");
    }

    public static void main(String[] args) {
        askQuestions();
        printPaycheck();
    }

}
