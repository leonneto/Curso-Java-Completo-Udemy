import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos numeros você vai digitar");

        int n = scanner.nextInt();
        int[] v = new int[n];

        for (int i =0; i < n; i++){
            System.out.println("Digite um número");
            v[i] = scanner.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for (int i = 0;  i < n ; i++)
        {
            if (v[i] < 0){
                System.out.println(v[i]);
            }

        }

        scanner.close();
    }
}