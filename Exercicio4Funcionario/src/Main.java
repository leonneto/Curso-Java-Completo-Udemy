import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("Name: ");
        String name = sc.next();
        emp.setName(name);

        System.out.println("Gross salary: ");
        double grossSalary  = sc.nextDouble();
        emp.setGrossSalary(grossSalary);

        System.out.println("Tax: ");
        double tax = sc.nextDouble();
        emp.setTax(tax);

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
    }
}