import java.util.Scanner;

public class Premium {

    public static void main(String[] args) {

        System.out.println("Введите заработную плату сотрудника : ");
        Scanner sc = new Scanner(System.in);
        double salaly = sc.nextDouble();
        System.out.println("Соколько лет сотрудник проработал : ");
        Scanner ag = new Scanner(System.in);
        int year = ag.nextInt();
        int premium;


        if ( year > 0 && year < 5){
            premium = (int) (salaly * 10/100);
            System.out.println("Премия сотрудника составляет : " + premium);
        }else if (year >= 5 && year < 10){
            premium = (int) (salaly * 15/100);
            System.out.println("Премия сотрудника составляет : " + premium);
        }else  if (year >=10 && year < 15){
            premium = (int) (salaly * 25/100);
            System.out.println("Премия сотрудника составляет : " + premium);
        }else if (year >=15 && year < 20){
            premium = (int) (salaly * 35/100);
            System.out.println("Премия сотрудника составляет : " + premium);
        }else if (year >=20 && year < 25){
            premium = (int) (salaly * 45/100);
            System.out.println("Премия сотрудника составляет : " + premium);
        }else if(year >=25){
            premium = (int) (salaly * 50/100);
            System.out.println("Премия сотрудника составляет : " + premium);
        }else {
            System.out.println("Введите корректный год");
        }





    }
}
