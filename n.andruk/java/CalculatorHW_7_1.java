import java.util.Scanner;

public class CalculatorHW_7_1 {

    public static int calculator (int operand1, int operand2, int operand3 ){
        int result = (operand1+operand2+operand3)/3;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Введите первое целочисленное число :");
        Scanner fist = new Scanner(System.in);
        int operand1 = fist.nextInt();
        System.out.println("Введите второе целочисленное число :");
        Scanner second = new Scanner(System.in);
        int operand2 = second.nextInt();
        System.out.println("Введите третье целочисленное число :");
        Scanner third = new Scanner(System.in);
        int operand3 = fist.nextInt();
        int result = calculator(operand1,operand2,operand3);
        System.out.println("Среднее арифметическое значение аргументов = "+ result);
    }

}

