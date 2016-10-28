/**
 * Created by Scala on 25.10.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
    read();
    }
    public static void read () throws IOException {
        boolean run = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (run) {
            System.out.println("Введите математическую функцию для вычесления sin,cos,tan,log,log10 в формате 'Sin 1' или ваше выражение в формате 'x + y'");
            String op = reader.readLine();
            if (op.contains("sin") | op.contains("cos") | op.contains("tan") | op.contains("log") | op.contains("log10"))
                try {
                String[] str = op.split(" ");
                String s1 = str[0];
                int i1 = Integer.parseInt(str[1]);
                Inj.inj(s1, i1);
                run = false;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат введенных данных");
            }
                else{
                    try {
                        String[] str = op.split(" ");
                        int i1 = Integer.parseInt(str[0]);
                        String s1 = str[1];
                        int i2 = Integer.parseInt(str[2]);
                        Std.std(i1, s1, i2);
                        run = false;
                    }
                      catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("Неверный формат введенных данных");
                    }
            }
            }
        }
    public static class Std {
        public static void std(int i1, String op, int i2) throws IOException {
            int res = 0;
            try {
            switch (op) {
                case "+":
                    res = i1 + i2;
                    break;
                case "-":
                    res = i1 - i2;
                    break;
                case "*":
                    res = i1 * i2;
                    break;
                case "/":
                    res = i1 / i2;
                    break;
            }
            } catch (ArithmeticException e) {
                System.out.println("Деление на ноль невозможно");
                System.exit(0);
            }
            System.out.println("Результат: " + res);
        }
    }
    public static class Inj {
        public static void inj(String op, int j1) throws IOException {
            double res = 0;
            switch (op) {
                case "sin":
                    res = Math.sin(j1);
                    break;
                case "cos":
                    res = Math.cos(j1);
                    break;
                case "tan":
                    res = Math.tan(j1);
                    break;
                case "log":
                    res = Math.log(j1);
                    break;
                case "log10":
                    res = Math.log10(j1);
                    break;
            }
            System.out.println("Результат: " + res);
        }
    }
}
