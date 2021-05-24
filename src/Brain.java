import java.util.Objects;

public class Brain {
    static int keepScore(int a, int b, String oper) {
          int res = 0;
        try {
            if (a > 10 || b > 10 || a < 0 || b < 0) {
                throw new Exception("Калькулятор принимает на вход числа от 1 до 10 включительно, не более");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        try {
            if (!oper.equals("-") && !oper.equals("+") && !oper.equals("*") && !oper.equals("/")) {
                throw new Exception("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }


        switch (oper) {
            case "+":
                res = a + b;
                return res;
            case "-":
                res = a - b;
                return res;
            case "*":
                res = a * b;
                return res;
            case "/":
                res = a / b;
                return res;
        }
        return res;
    }
}







