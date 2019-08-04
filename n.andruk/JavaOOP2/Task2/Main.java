package Task2;

public class Main {
    public static void main(String[] args) {
        Car2 car2Default = new Car2();
        Car2 car2WithOneParameters = new Car2 (2015);
        Car2 car2WithTwoParameters = new Car2(2017, 200);
        Car2 car2WithTreeParameters = new Car2(2018, 220, 3000);
        Car2 car2WithFourParameters = new Car2 (2019,300,6000, "yellow" );

//        System.out.println("Year: " + car2Default.year+ " Speed: "+car2Default.speed + " Weight: "+ car2Default.weight + " Color: "+ car2Default.color);
//        System.out.println("Year: " + car2WithOneParameters.year+ " Speed: "+car2WithOneParameters.speed + " Weight: "+ car2WithOneParameters.weight + " Color: "+ car2WithOneParameters.color);
//        System.out.println("Year: " + car2WithTwoParameters.year+ " Speed: "+car2WithTwoParameters.speed + " Weight: "+ car2WithTwoParameters.weight + " Color: "+ car2WithTwoParameters.color);
//        System.out.println("Year: " + car2WithTreeParameters.year+ " Speed: "+car2WithTreeParameters.speed + " Weight: "+ car2WithTreeParameters.weight + " Color: "+ car2WithTreeParameters.color);
//        System.out.println("Year: " + car2WithFourParameters.year+ " Speed: "+car2WithFourParameters.speed + " Weight: "+ car2WithFourParameters.weight + " Color: "+ car2WithFourParameters.color);
    System.out.println("Default: " + car2Default.toString());
    System.out.println("WithOneParameters"+car2WithOneParameters.toString());
    System.out.println("WithTwoParameters: " + car2WithTwoParameters.toString());
    System.out.println("WithTreeParameters: " + car2WithTreeParameters.toString());
    System.out.println("WithFourParameters: " + car2WithFourParameters.toString());


    }
}
