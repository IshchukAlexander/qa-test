import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        System.out.println("Введите число с клавтатуры ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        NumbersCheck.metod1(number);
        NumbersCheck.metod2(number);
        NumbersCheck.metod3(number);

    }

    public static void metod1(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    public static void metod2(int number) {
        for (int d = 2; d < Math.sqrt(number); d++) {
            if (number % d == 0) {
                System.out.println("Число не простое");
                return;
            }
        }
        System.out.println("Число простое");
    }
    public static void metod3(int number) {
        if((number % 2 ==0) && (number % 5 ==0) && (number % 3 ==0) && (number % 6 ==0) && (number % 9 ==0)){
            System.out.println("Число делится без остатка");
        } else {
            System.out.println("Число не делится без остатка");
        }
    }

}
