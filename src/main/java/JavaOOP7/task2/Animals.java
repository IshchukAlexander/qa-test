package JavaOOP7.task2;

public enum Animals {
    Cat(5), Dog(3);
    int year;

    Animals(int year){
        this.year=year;
    }
    // Перегружаем метод toString()
    public String toString(){
        return  this.name()+ ": year = " + year;
    }

}
