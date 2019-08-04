package AdditionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();  //Создание экземпляра
        address.setIndex(12);
        address.setCountry("Украина");
        address.setCountry("Киев");
        address.setStreet("Киевская");
        address.setHouse("12B");
        address.setApartment("2");
        System.out.println(address.toString());
    }
}
