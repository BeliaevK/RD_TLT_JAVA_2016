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
        System.out.println("Выберите тип калькулятора: s - обычный, i - инженерный");
        String type = reader.readLine();
        if (type.equals("s")) {
            //  while (run) {
            //    try {
            System.out.println("Введите ваше выражение в формате 'x + y'");
            String op = reader.readLine();
            // System.out.println(op);
            Std.std(op);
            // run = false;
          /*      } catch (NumberFormatException e) {
                    System.out.println("Неверный формат введенных данных.");
                }*/
        }
        // }
        else
        if (type.equals("i")){
            while (run) {
                try {
                    System.out.println("Инженерный тип калькулятора. Вычисляющий: sin,cos,tan,log,log10." +
                            " \nВведите математическую функцию для вычесления:");
                    String op = reader.readLine();
                    if (op.equals("sin") | op.equals("cos") | op.equals("tan") | op.equals("log") | op.equals("log10")) {
                        System.out.println("Введите число");
                        int j1 = Integer.parseInt(reader.readLine());
                        Inj.inj(op, j1);
                        run = false;
                    } else {
                        System.out.println("Неверно введена функция");}
                }
                catch (NumberFormatException e) {
                    System.out.println("Неверный формат введенных данных");
                }
            }
        }
        else {
            System.out.println("Выбран неверный тип калькулятора");
            System.exit(0);
        }
    }
    public static class Std {
        public static void std(String op) throws IOException {
            int res = 0;
            String[] str = op.split(" ");
            int i1 = Integer.parseInt(str[0]);
            String s1 = str[1];
            int i2 = Integer.parseInt(str[2]);
            if (s1.equals("+")) {
                res = i1 + i2;
            }
            else
            if (s1.equals("-")) {
                res = i1 - i2;
            }
            else
            if (s1.equals("*")) {
                res = i1 * i2;
            }
            try {
                if (s1.equals("/")) {
                    res = i1 / i2;
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
            if (op.equals("sin")) {
                res = Math.sin(j1);
            }
            if (op.equals("cos")) {
                res = Math.cos(j1);
            }
            if (op.equals("tan")) {
                res = Math.tan(j1);
            }
            if (op.equals("log")) {
                res = Math.log(j1);
            }
            if (op.equals("log10")) {
                res = Math.log10(j1);
            }
            System.out.println("Результат: " + res);
        }
    }
}
