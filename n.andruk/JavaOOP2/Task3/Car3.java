package Task3;

public class Car3 {
    int year;
    double speed;
    int weight;
    String color;


    public Car3(){
        this (2001,100,1000,"red");
    }
    public Car3(int year){
        this (year, 150,2000,"blue");
    }
    public  Car3(int year, double speed){
        this(year,speed,3000,"grey");
    }
    public Car3(int year, double speed, int weight){
        this(year,speed,weight,"black");
    }
    public Car3(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight=weight;
        this.color = color;
    }
}
