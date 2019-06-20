import java.util.Scanner;

public class ArithmeticsHW7 {

    static void add(int operand1, int operand2) {
        int result = operand1 + operand2;
        System.out.println(operand1 + "+" + operand2 + "=" + result);
    }

    static void sub(int operand1, int operand2) {
        int result = operand1 - operand2;
        System.out.println(operand1 + "-" + operand2 + " = " + result);
    }

    static void mul(int operand1, int operand2) {
        int result = operand1 * operand2;
        System.out.println(operand1 + "*" + operand2 + "=" + result);
    }

    static void div(int operand1, int operand2) {
        if (operand2 == 0) {
            System.out.println("На ноль делить нельзя!!!");
            return ; }
        double result = operand1 / operand2;
        System.out.println(operand1 + "/" + operand2 + "=" + result);
    }


    public static void main(String[] args) {
        System.out.println( "Введите первое число :");
        Scanner fist = new Scanner(System.in);
        int operand1 = fist.nextInt();

        System.out.println( "Введите второе число :");
        Scanner second = new Scanner(System.in);
        int operand2 = second.nextInt();
        System.out.println( "Введите знак :");
        Scanner s = new Scanner(System.in);
        String sumbol  = s.next();

        switch (sumbol){
            case "+":
                add(operand1,operand2);
                break;
            case "-":
                sub(operand1,operand2);
                break;
            case "*":
                mul(operand1,operand2);
                break;
            case "/":
                div(operand1,operand2);
                break;
                default:
                    System.out.println("Такого знака нету");


        }


    }
}
