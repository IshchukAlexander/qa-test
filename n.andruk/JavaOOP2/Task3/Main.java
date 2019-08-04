package Task3;

public class Main {
    public static void main(String[] args) {
        Car3 car3Default = new Car3();
        Car3 car3WithOneParameters = new Car3 (2015);
        Car3 car3WithTwoParameters = new Car3(2017, 200);
        Car3 car3WithTreeParameters = new Car3(2018, 220, 3000);
        Car3 car3WithFourParameters = new Car3 (2019,300,6000, "yellow" );

        System.out.println("Year: " + car3Default.year+ " Speed: "+car3Default.speed + " Weight: "+ car3Default.weight + " Color: "+ car3Default.color);
        System.out.println("Year: " + car3WithOneParameters.year+ " Speed: "+car3WithOneParameters.speed + " Weight: "+ car3WithOneParameters.weight + " Color: "+ car3WithOneParameters.color);
        System.out.println("Year: " + car3WithTwoParameters.year+ " Speed: "+car3WithTwoParameters.speed + " Weight: "+ car3WithTwoParameters.weight + " Color: "+ car3WithTwoParameters.color);
        System.out.println("Year: " + car3WithTreeParameters.year+ " Speed: "+car3WithTreeParameters.speed + " Weight: "+ car3WithTreeParameters.weight + " Color: "+ car3WithTreeParameters.color);
        System.out.println("Year: " + car3WithFourParameters.year+ " Speed: "+car3WithFourParameters.speed + " Weight: "+ car3WithFourParameters.weight + " Color: "+ car3WithFourParameters.color);
    }
}
