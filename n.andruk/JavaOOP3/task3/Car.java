package task3;


public class Car extends Vehicle {
    String name;
    double price;
    double speed;
    int year;

    void BMW () {
        name = "M5";
        price = 15.000;
        speed = 300;
        year = 2011;
        System.out.println((char) 27 + "[32m"+"BMW" + "\nName: "+ name+"\nPrice: "+price+"\nSpeed: "+speed+"\nYear: "+year+ "\nSiteName: "+siteName+"\nCompany: "+company);

    }
    void Ford () {
        name = "Focus";
        price = 11.000;
        speed = 250;
        year = 2015;
        System.out.println( "Ford" + "\nName: "+ name+"\nPrice: "+price+"\nSpeed: "+speed+"\nYear: "+year+ "\nSiteName: "+siteName+"\nCompany: "+company);
    }

}
