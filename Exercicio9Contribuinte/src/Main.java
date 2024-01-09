import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TaxPlayer> list = new ArrayList<>();

        System.out.println("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for(int i = 0; i <= i; i++){
            System.out.println("Tax payer #" + (i + 1) + ":");
            System.out.println("Individual or company (i/c) ?");
            char option = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            double income = scanner.nextDouble();

            if (option == 'i'){
                System.out.println("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                list.add(new Individual(name, income, healthExpenditures));
            }
            else if (option == 'c'){
                System.out.println("Number of employees: ");
                int numEmployee = scanner.nextInt();
                list.add(new Individual(name, income, numEmployee) );
            }
        }
        double sum = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPlayer tp : list) {
            double tax = tp.tax();
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        scanner.close();
    }

}