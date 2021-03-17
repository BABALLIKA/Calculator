public class CalculateRim extends Calculator {

    public static void calculateRim(int a, String operator, int b) {
        int c;
        if (operator.equals("+")) {
            c = plus(a, b);
            Convert.arabToRim(c);
        } else if (operator.equals("-")) {
            c = a - b;
            Convert.arabToRim(c);
        } else if (operator.equals("*")) {
            c = a * b;
            Convert.arabToRim(c);
        } else if (operator.equals("/")) {
            try {
                c = a / b;
                Convert.arabToRim(c);
            } catch (ArithmeticException var5) {
                System.out.println("На ноль делить нельзя");
            }
        }
    }
}