package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double Side1 = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double Side2 = sc.nextDouble();
        Rectangle rectangle = new Rectangle();
        System.out.println("Площадь прямоугольника: "+ rectangle.areaCalculator(Side1,Side2));
        System.out.println("Периметр прямоугольника: "+ rectangle.perimeterCalculator(Side1, Side2));

    }

}
