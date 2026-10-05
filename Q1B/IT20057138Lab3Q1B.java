import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double monthlySalary = input.nextDouble();

        System.out.print("Enter number of OT hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        double otHourlyRate = input.nextDouble();

        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.printf("OT Amount = %.2f%n", otAmount);
        System.out.printf("Total Salary = %.2f%n", totalSalary);
    }
}
