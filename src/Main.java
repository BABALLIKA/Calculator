import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные: ");
        String a = scanner.next(), operator = scanner.next(), b = scanner.next();
        Verify.verify(a, operator, b);
    }
}
