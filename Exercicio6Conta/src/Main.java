import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account;

        System.out.println("Enter number account");
        int number  = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Enter holder account\n");
        String holder = scanner.nextLine();
        System.out.println("Is there initial deposit (y or n) ");
        char option  = scanner.next().charAt(0);
        if(option == 'y')
        {
            System.out.print("Enter initial deposit: ");
            double initialDeposit = scanner.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else
        {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();

        System.out.println("Enter deposit value: ");
        double depositValue = scanner.nextDouble();
        account.deposit(depositValue);
        System.out.println(account);
        System.out.println();

        System.out.println("Enter withdraw value: ");
        double withdraw = scanner.nextDouble();
        account.withdraw(withdraw);
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);










        scanner.close();


    }
}