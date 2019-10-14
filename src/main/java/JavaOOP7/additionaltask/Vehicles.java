package JavaOOP7.additionaltask;

public enum Vehicles {
    // Создаем список именованных констант
    Car1(1, "green"), Car2(2, "blue");

    int price;
    String color;
    // Конструктор с параметрами
    Vehicles(int price, String color){
        this.price=price;
        this.color=color;
    }
    // Создаем метод для возврата цвета машины
    public String getColor(){
        return color;
    }
    // Перегружаем метод toString()
    public String toString(){
        return  this.name()+ ": price = " + price + "; color = " + this.getColor();
    }


}
