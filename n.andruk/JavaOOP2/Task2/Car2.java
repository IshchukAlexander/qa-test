package Task2;

public class Car2 {
    int year;
    double speed;
    int weight;
    String color;

    public Car2(){
        this.year = 2001;
        this.speed= 100;
        this.weight = 1000;
        this.color = "red";
    }
    public Car2(int year){
        this.year=year;
        this.speed = 150;
        this.weight =2000;
        this.color = "blue";
    }
    public  Car2(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight =3000;
        this.color = "grey";
    }
    public Car2(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight=weight;
        this.color = "black";
    }
    public Car2(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight=weight;
        this.color = color;
    }
// Перегрузка метода toString()
    @Override
    public String toString() {
        return "year = " + year + " speed = " + speed + " weight = " + weight + " color = " + color;
    }
}
