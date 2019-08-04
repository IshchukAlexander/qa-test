package Task1;

public class Car {
    int year;
    String color;
//    private int year;
//    private String color;

    // 1) по умолчанию
    public Car(){
        this.year = 2012;
        this.color = "red";
    }
    // 2) с одним параметром

    public  Car(int year){
        this.year=year;
        this.color = "grey";
    }

    // 3) с двумя параметрами
    public Car(int year, String color){
        this.year = year;
        this.color =color;
    }
//    При использовании приватных ключей
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
}
