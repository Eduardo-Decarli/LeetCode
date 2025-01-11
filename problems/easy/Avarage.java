import java.util.Locale;
import java.util.Scanner;

public class Avarage {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble() * 2;
        double n2 = sc.nextDouble() * 3;
        double n3 = sc.nextDouble() * 4;
        double n4 = sc.nextDouble() * 1;

        double avarage = (n1 + n2 + n3 + n4) / 10;

        System.out.printf("\nMedia: %.1f\n", avarage);


        if(avarage >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if(avarage < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            double n5 = sc.nextDouble();
            System.out.println("Aluno em exame.");

            System.out.printf("Nota do exame: %.1f\n", n5);

            avarage = (avarage + n5) / 2;

            if(avarage >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", avarage);
            } else {
                System.out.println("Aluno reprovado");
                System.out.printf("Media final: %.1f", avarage);
            }
        }
    }
}
