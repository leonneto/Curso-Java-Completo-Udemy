import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        int soma = val1 + val2;

        System.out.println("Soma = " + soma );
        scanner.close();
    }
}