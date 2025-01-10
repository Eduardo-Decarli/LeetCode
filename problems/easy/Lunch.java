import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Lunch {
 
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int quantity = sc.nextInt();
        double value = 0.0;

        switch (id) {
            case 1:
                value = quantity * 4.0;
                break;

            case 2:
                value = quantity * 4.5;
                break;

            case 3:
                value = quantity * 5.0;
                break;

            case 4:
                value = quantity * 2.0;
                break;

            case 5:
                value = quantity * 1.5;
                break;

            default:
                value = 0;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", value);

        sc.close();
    }
 
}