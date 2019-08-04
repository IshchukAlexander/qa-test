package Task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyArea myArea = new MyArea();
        System.out.print("Введите R = ");
        Scanner sc = new Scanner(System.in);
        double  R = sc.nextDouble();
        double result = myArea.areaOfCircle(R);
        System.out.println("Площа круга равна = " + result);
    }
}
