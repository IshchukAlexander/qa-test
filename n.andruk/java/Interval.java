import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите число от 0 до 100: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number >= 0 && number <=14){
            System.out.println("Вы попали в диапазон [0-14]");
        }  else if (number >= 15 && number <= 35){
            System.out.println("Вы попали в диапазон [15-35]");
        } else if (number >= 36 && number <= 50){
            System.out.println("Вы попали в диапазон [36-50]");
        }else  if (number >= 50 && number <= 100){
            System.out.println("Вы попали в диапазон [50-100]");
        }else
            System.out.println("Введите число от 0 до 100");
        }

    }

