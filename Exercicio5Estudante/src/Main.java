import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudante estudante = new Estudante();

        String name = scanner.next();
        estudante.setName(name);

        double grade1 = scanner.nextDouble();
        estudante.setGrade1(grade1);

        double grade2 = scanner.nextDouble();
        estudante.setGrade2(grade2);

        double grade3 = scanner.nextDouble();
        estudante.setGrade3(grade3);

        System.out.printf("Final grade: %.2f%n", estudante.finalGrade());

        if (estudante.finalGrade() < 60.0)
        {
            System.out.println("Failed");
            System.out.printf("Missing %.2f Points%n", estudante.missingPoints());
        }

        else {
            System.out.println("Pass");
        }

        scanner.close();

    }
}