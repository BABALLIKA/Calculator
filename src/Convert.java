public class Convert {

    public static void rimToArab(String rimNumA, String operator, String rimNumB) {
        String rimNum[] = new String[]{"NULL", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int a = 0;
        int b = 0;
        for(int i = 0; i < rimNum.length; ++i) {
            if (rimNumA.equals(rimNum[i])) {
                a = i;
            }
            if (rimNumB.equals(rimNum[i])) {
                b = i;
            }
        }
        CalculateRim.calculateRim(a, operator, b);
    }
    public static void arabToRim(int c) {
        String rimNum[]= new String[]{"NULL", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String rimNum2[] = new String[]{"NULL", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        if (c < 0 || c == 0) {
            System.out.println("Не верная операция");
        } else if (c < 10 && c > 0) {
            System.out.println("Ответ:" + rimNum[c]);
        } else if (c == 10) {
            System.out.println(rimNum[c]);
        } else if (c > 10 && c % 10 == 0) {
            System.out.println("Ответ:" + rimNum2[c / 10]);
        } else {
            System.out.println("Ответ:" + rimNum2[c / 10] + rimNum[c % 10]);
        }
    }
}