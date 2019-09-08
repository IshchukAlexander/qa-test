package task3;

public class Plane extends Vehicle {
    String name;
    double price;
    double speed;
    int year;
    double height;
    int count;

    void Airbus (){
        name = "Nikolas";
        price =1000000;
        speed = 858;
        year = 2006;
        height = 11000;
        count = 183;
        System.out.println( (char) 27 + "[33m"+"Airbus" + "\nName: "+ name+"\nPrice: "+price+"\nSpeed: "+speed+"\nYear: "+year+"\nHeight: "+height+"\nCount: "+count+ "\nSiteName: "+siteName+"\nCompany: "+company);
    }
    void Boeing (){
        name = "Boeing-777";
        price =1500000;
        speed = 891;
        year = 2010;
        height = 13000;
        count = 160;
        System.out.println( "Boeing-777" + "\nName: "+ name+"\nPrice: "+price+"\nSpeed: "+speed+"\nYear: "+year+"\nHeight: "+height+"\nCount: "+count+ "\nSiteName: "+siteName+"\nCompany: "+company);
    }

}
