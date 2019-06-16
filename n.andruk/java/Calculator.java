import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите знак между цыфрами: ");
        Scanner sm = new Scanner(System.in);
        String sign = sm.nextLine();

        int operand1 = 345;
        int operand2 = 39;
        int result = 0;

        switch (sign){
            case "+":{
               result = (operand1 + operand2);
                break;

            }
            case "-":{
               result = (operand1 - operand2);
                break;
            }
            case "*":{
                result = operand1 * operand2;
                break;

            }
            case "/":{
                if (operand2==0){
                    System.out.println("Error");
                    break;
                }
                result = operand1 / operand2;
                break;
            }
            default:{
                System.out.println("Нету такого знака");
                return;
            }
        }
        System.out.println(operand1 + " " +sign + " " + operand2 + " = " + result);
    }
}
