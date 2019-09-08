package task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выберите средство передвижения Car/Ship/Plane : ");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        if (c.equals("Car")){
            System.out.println("В наличии есть 2 автомобиля");
            Car car = new Car();
            car.BMW();
            car.Ford();
        }else if (c.equals("Plane")){
            System.out.println("В наличии есть 2 самолета");
            Plane plane = new Plane();
            plane.Airbus();
            plane.Boeing();
        }else if (c.equals("Ship")){
            System.out.println("В наличии есть 2 кораблика");
            Ship ship = new Ship();
            ship.HryhoriyKuropyatnykov();
            ship.Skadovsk();
        }else {
            System.out.println("Ошибка!!!");
        }

    }
}