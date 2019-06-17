import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.println(" Проверка чисел на четность : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(" Вариант №1 ");
        if ( (number % 2 ) == 0) {
            System.out.println(true);
            } else {
            System.out.println(false);

        }

        System.out.println(" Вариант №2 ");
        if ((number & 1) == 0) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
