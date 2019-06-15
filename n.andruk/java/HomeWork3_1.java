public class HomeWork3_1 {
    public static void main(String[] args) {
        int x = 10, y = 12, z = 3;
        x += y - x++ * z;     // 10+12-10(c11)*3= -8
        System.out.println(x);
        z = --x - y * 5;      //  результат x -8 так как --х, то -1 -9-12*5 = -69
        System.out.println(z);
        y /= x + 5 % z;            // -12 / ( -9+5) = -3
        System.out.println(y);
        z = x++ + y * 5;            // -9 + (-3)*5 = -24
        System.out.println(z);
        x = y -x++ * z;              // -3 -8 * - 24 = -195
        System.out.println(x);

    }
}
