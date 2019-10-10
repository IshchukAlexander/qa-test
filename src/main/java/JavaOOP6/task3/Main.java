package JavaOOP6.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Исходная единица измерения (mm, cm, m, km): ");
        Scanner sc = new Scanner(System.in);
        String before = sc.nextLine();
        System.out.println("Конечная единица измерения (mm, cm, m, km): ");
        String after = sc.nextLine();
        System.out.println("Введите число: ");
        double distance = sc.nextDouble();

        if (before.equals("mm") && after.equals("cm") ){
           System.out.println("Вы переводите единицы длина из миллиметр в сантиметр : "
                   + distance+ "mm" + " = "+ Distance.Converter.methodMMvSM(distance)+ "cm");
        }else if (before.equals("mm") && after.equals("m")){
            System.out.println("Вы переводите единицы длина из миллиметр в метр : "
                    + distance+ "mm" + " = "+ Distance.Converter.methodMMvM(distance) + "m");
        }else if (before.equals("mm") && after.equals("km")){
            System.out.println("Вы переводите единицы длина из миллиметр в километр : "
                    + distance+ "mm" + " = "+ Distance.Converter.methodMMvKM(distance) + "km");
        }else if (before.equals("cm") && after.equals("mm")){
            System.out.println("Вы переводите единицы длина из сантиметр в миллиметр : "
                    + distance+ "cm" + " = "+ Distance.Converter.methodSMvMM(distance) + "mm");
        }else if (before.equals("cm") && after.equals("m")){
            System.out.println("Вы переводите единицы длина из сантиметр в метр : "
                    + distance+ "cm" + " = "+ Distance.Converter.methodSMvM(distance) + "m");
        }else if (before.equals("cm") && after.equals("km")){
            System.out.println("Вы переводите единицы длина из сантиметр в километр : "
                    + distance+ "cm" + " = "+ Distance.Converter.methodSMvKM(distance) + "km");
        }else if (before.equals("m") && after.equals("mm")){
            System.out.println("Вы переводите единицы длина из метр в миллимерт : "
                    + distance+ "m" + " = "+ Distance.Converter.methodMvMM(distance) + "mm");
        }else if (before.equals("m") && after.equals("cm")){
            System.out.println("Вы переводите единицы длина из метр в сантиметр : "
                    + distance+ "m" + " = "+ Distance.Converter.methodMvSM(distance) + "mm");
        }else if (before.equals("m") && after.equals("km")){
            System.out.println("Вы переводите единицы длина из метр в километр : "
                    + distance+ "m" + " = "+ Distance.Converter.methodMvKM(distance) + "km");
        }else if (before.equals("km") && after.equals("mm")){
            System.out.println("Вы переводите единицы длина из километр в миллиметр : "
                    + distance+ "km" + " = "+ Distance.Converter.methodKMvMM(distance) + "mm");
        }else if (before.equals("km") && after.equals("cm")){
            System.out.println("Вы переводите единицы длина из километр в сантиметр : "
                    + distance+ "km" + " = "+ Distance.Converter.methodKMvSM(distance) + "cm");
        }else if (before.equals("km") && after.equals("m")){
            System.out.println("Вы переводите единицы длина из километр в метр : "
                    + distance+ "km" + " = "+ Distance.Converter.methodKMvM(distance) + "m");
        } else if (before.equals("km") && after.equals("km")){
            System.out.println(distance);
        }else if (before.equals("m") && after.equals("m")){
            System.out.println(distance);
        }else if (before.equals("mm") && after.equals("mm")){
            System.out.println(distance);
        }else if (before.equals("cm") && after.equals("cm")){
            System.out.println(distance);
        }else {
            System.out.println("Ошибка!!!");
        }
    }
}
