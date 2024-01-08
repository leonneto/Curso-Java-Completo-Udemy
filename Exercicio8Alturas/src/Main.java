import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas: ");
        int n = scanner.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa");
            System.out.print("Nome da pessoa: ");
            nomes[i] = scanner.next();
            System.out.print("Digite a idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Digite a altura: ");
            alturas[i] = scanner.nextDouble();
        }
        double somaAlturas = 0;
        for (double altura : alturas) {
            somaAlturas += altura;
        }
        double media = somaAlturas / n;

        System.out.println("Média das alturas: " + media);

        scanner.close();

    }
}