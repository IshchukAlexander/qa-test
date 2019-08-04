package Task1;

public class Main {
    public static void main(String[] args) {
        Car carDefault = new Car();
        Car carWithOneParameters = new Car (2015);
        Car carWithTwoParameters = new Car(2017, "blue");
        System.out.println("Year: " + carDefault.year+ " Color: "+ carDefault.color);
        System.out.println("Year: " + carWithOneParameters.year+ " Color: "+ carWithOneParameters.color);
        System.out.println("Year: " + carWithTwoParameters.year+ " Color: "+ carWithTwoParameters.color);

//         C  приватным ключем
//        System.out.println("Year: "+carDefault.getYear()+ " Color: "+ carDefault.getColor());
//        System.out.println("Year: "+carWithOneParameters.getYear()+ " Color: "+ carWithOneParameters.getColor());
//        System.out.println("Year: "+carWithTwoParameters.getYear()+ " Color: "+ carWithTwoParameters.getColor());
    }
}
