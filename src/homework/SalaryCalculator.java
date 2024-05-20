package homework;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        double salary = calculateSalary(hourlyRate, hoursWorked);
        System.out.println("Total salary: $" + salary);

        scanner.close();
    }

    public static double calculateSalary(double hourlyRate, double hoursWorked) {
        double baseSalary = hourlyRate * hoursWorked;
        double overtimeRate = 1.5 * hourlyRate;
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double overtimePay = overtimeHours * overtimeRate;

        return baseSalary + overtimePay;
    }
}


