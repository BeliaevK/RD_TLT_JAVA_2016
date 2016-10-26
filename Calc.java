/**
 * Created by Scala on 25.10.2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число или 'i' для перехода в инженерный режим калькулятора");
        int i = Integer.parseInt(reader.readLine());
//        while ()
        System.out.println("Введите знак операции");
        String op = reader.readLine();
        System.out.println("Введите второе число");
        int i1 = Integer.parseInt(reader.readLine());

      //  System.out.println(i);
      //  System.out.println(i1);
         std(i,op,i1);

    }

    public static void std(int j1, String op, int j2) {
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
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        System.out.println("Инженерный тип калькулятора. Вычисляющий: sin,cos,tan,log,log10." +
                " \n Введите математическую функцию для вычесления:");
        op = reader.readLine();
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
