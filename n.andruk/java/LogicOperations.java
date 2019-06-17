public class LogicOperations {
    public static void main(String[] args) {
        int x = 5, y =10, z = 15;

        x += y >> x++ * z;    // 5+10>>5*15 =  15>>75 (75/15)=5 ;
        System.out.println("x = " + x);
        z = ++x & y * 5;        // 6 & 50 = 0000 0110 & 0011 0010 = 0000 0010 = 2;
        System.out.println("z + " + z);
        y /= x + 5 | z;          // 10 / ( 6 + 5 | 2 )  (5 | 2 =  0000 0101 | 0000 0010 = 0000 0111 = 7 ) 10/13 = 0.76;
        System.out.println("y = " + y);
        z = x++ & y * 5;          //  6 & 0 = 0;
        System.out.println("z = " + z);
        x = y << x++ ^ z;         //  0<<7^0 ( 7^0 = 7 ) 0<<7 = 0;
        System.out.println("x = " + x);
    }
}
