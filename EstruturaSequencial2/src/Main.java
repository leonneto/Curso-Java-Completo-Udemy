import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raioCirculo = scanner.nextDouble();
        double pi = 3.14159;

        double area = pi * (raioCirculo * raioCirculo);

        System.out.println("Area = " + area);

        scanner.close();
    }
}