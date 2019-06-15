public class Volume {
    public static void main(String[] args) {
        final double PI = 3.1415;
        double R = 10;
        double h = 5;

        double V = PI * Math.pow(R,2) * h;
        System.out.println("Объем цилиндра:" + V);

//        double S = 2 * PI * Math.pow(R, 2) + 2 * PI * Math.pow(R, 2);

        double S = 2 * PI * R * (R + h);            // 2 * PI * Math.pow(R, 2) + 2 * PI * R * h = 2 * PI * R * (R + h)

//        double S = 2 * PI * Math.pow(R, 2) + 2 * PI * R * h;

        System.out.println("Полощадь цилиндра :" + S);
    }
}
