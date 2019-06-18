import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("Сколько клиентов : ");
        Scanner N = new Scanner(System.in);
        int customers = N.nextInt();
        int car = 1;

        do {
            car *= customers--;
        } while ( customers > 0);
        System.out.println("Количество возможных вариантов доставить товар = " + car);

    }
}