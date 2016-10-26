/**
 * Created by Scala on 25.10.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите тип калькулятора: s - обычный, i - инженерный");
        String type = reader.readLine();
        if (type.equals("s")){
            System.out.println("Введите первое число или 'i' для перехода в инженерный режим калькулятора");
            int i = Integer.parseInt(reader.readLine());
//        while ()
            System.out.println("Введите знак операции");
            String op = reader.readLine();
            System.out.println("Введите второе число");
            int i1 = Integer.parseInt(reader.readLine());
            std(i, op, i1);
        }
        if (type.equals("i")){
            System.out.println("Инженерный тип калькулятора. Вычисляющий: sin,cos,tan,log,log10." +
                    " \nВведите математическую функцию для вычесления:");
            String op = reader.readLine();
            System.out.println("Введите число");
            int j1 = Integer.parseInt(reader.readLine());
            inj(op, j1);
        }
    }

    public static void std(int j1, String op, int j2) throws IOException {
        int res = 0;
        if (op.equals("+")) {
            res = j1 + j2;
        }
        if (op.equals("-")) {
            res = j1 - j2;
        }
        if (op.equals("*")) {
            res = j1 * j2;
        }
        try {
            if (op.equals("/")) {
                res = j1 / j2;
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
            System.exit(0);
        }
        System.out.println("Результат: " + res);
        //return res;
    }

    public static void inj(String op, int j1) throws IOException {
        int res = 0;
        if (op.equals("sin")) {
            res = (int) Math.sin(j1);
        }
        if (op.equals("cos")) {
            res = (int) Math.cos(j1);
        }
        if (op.equals("tan")) {
            res = (int) Math.tan(j1);
        }
        if (op.equals("log")) {
            res = (int) Math.log(j1);
        }
        if (op.equals("log10")) {
            res = (int) Math.log10(j1);
        }
        System.out.println("Результат: " + res);
    }


}
