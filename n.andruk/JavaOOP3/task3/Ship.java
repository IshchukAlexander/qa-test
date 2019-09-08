package task3;

public class Ship extends Vehicle {
    String name;
    double price;
    double speed;
    int year;
    String port;
    int count;

    void HryhoriyKuropyatnykov (){
        name = "Hryhoriy Kuropyatnykov";
        price = 200000;
        speed = 400;
        year = 1999;
        port = "Ukraine";
        count = 100;
        System.out.println( (char) 27 + "[34m"+"Hryhoriy Kuropyatnykov" + "\nName: "+ name+"\nPrice: "+price+"\nSpeed: "+speed+"\nYear: "+year+"\nPort: "+port+"\nCount: "+count+ "\nSiteName: "+siteName+"\nCompany: "+company);
    }
    void Skadovsk(){
        name = "Skadovsk";
        price = 230000;
        speed = 400;
        year = 1998;
        port = "Ukraine";
        count = 100;
        System.out.println( "Skadovsk" + "\nName: "+ name+"\nPrice: "+price+"\nSpeed: "+speed+"\nYear: "+year+"\nPort: "+port+"\nCount: "+count+ "\nSiteName: "+siteName+"\nCompany: "+company);

    }

}
