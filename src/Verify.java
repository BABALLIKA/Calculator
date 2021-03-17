import java.util.Arrays;
import java.util.List;

public class Verify {

    public static void verify(String a, String operator, String b) {
        String rimNum[] = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        List<String> list = Arrays.asList(rimNum);
        try {
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                if (!list.contains(a) && !list.contains(b)) {
                    if (Integer.parseInt(a) >= 0 && Integer.parseInt(a) <= 10 && Integer.parseInt(b) >= 0 && Integer.parseInt(b) <= 10) {
                        int numA = Integer.parseInt(a);
                        int numB = Integer.parseInt(b);
                        int c;
                        if (operator.equals("+")) {
                            c = Calculator.plus(numA, numB);
                            System.out.println("Ответ: " + c);
                        } else if (operator.equals("-")) {
                            c = Calculator.minus(numA, numB);
                            System.out.println("Ответ: " + c);
                        } else if (operator.equals("*")) {
                            c = Calculator.um(numA, numB);
                            System.out.println("Ответ: " + c);
                        } else if (operator.equals("/")) {
                            c = Calculator.del(numA, numB);
                            try {
                                System.out.println("Ответ: " + c);
                            } catch (ArithmeticException var10) {
                                System.out.println("На ноль делить нельзя");
                            }
                        }
                    } else {
                        System.out.println("Числа не должны быть больше 10, операторы только +, -, *, /. Введите данные корректно. Например, 2 + 4 или II + IX");
                    }
                } else {
                    Convert.rimToArab(a, operator, b);
                }
            }
        } catch (Exception var11) {
            System.out.println("Данные введены не корректно");
        }
    }
}