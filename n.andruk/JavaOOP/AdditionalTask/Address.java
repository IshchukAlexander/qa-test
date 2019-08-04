package AdditionalTask;

public class Address {
    int index;
    String country;
    String city;
    String street;
    String house;
    String apartment;

// Создание геттеров и сеттеров


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Index: " + getIndex() + "\nCountry: " + getCountry() + "\nCity: " + getCity() + "\nStreet: " + getStreet() + "\nHouse: "+getHouse() + "\nApartment: "+getApartment();
    }
}


