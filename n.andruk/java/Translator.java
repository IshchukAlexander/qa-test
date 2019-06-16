import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Month: ");

        String Month = sc.next();

//        if (Month == "Январь") {                          // Через If не получилось (
//            System.out.println("January");
//        } else if (Month == "Февраль") {
//            System.out.println("February");


        switch (Month) {

            case "Январь": {
                System.out.println("January");
                break;
            }
            case "Февраль": {
                System.out.println("February");
                break;
            }
            case "Март": {
                System.out.println("March");
                break;
            }
            case "Апрель": {
                System.out.println("April");
                break;
            }
            case "Май": {
                System.out.println("May");
                break;
            }
            case "Июль": {
                System.out.println("June");
                break;
            }
            case "Июнь": {
                System.out.println("July");
                break;
            }
            case "Август": {
                System.out.println("August");
                break;
            }
            case "Сентябрь": {
                System.out.println("September");
                break;
            }
            case "Октябрь": {
                System.out.println("October");
                break;
            }
            case "Ноябрь": {
                System.out.println("November");
                break;
            }
            case "Декабрь": {
                System.out.println("December");
                break;
            }
            default: {
                System.out.println("Перевод не найден, Пожалуйста напишите в службу поддержки");
                break;
            }

        }


    }
}