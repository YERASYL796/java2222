import java.util.Scanner;
import java.util.InputMismatchException;

public class tap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Сан енгіз: ");
            int num = sc.nextInt();
            System.out.println("Сен енгіздің: " + num);
        } catch (InputMismatchException e) {
            System.out.println("Қате! Сан енгізу керек.");
        }
    }
}