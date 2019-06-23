public class calculatorHW8 {
    public static void main(String[] args) {
        int a = 25;
        int b = 50;
        int c = 100;
        calculate(a, b, c);

    }
    public static void calculate ( int a, int b, int c) {
        System.out.println(a/=5);
        System.out.println(b/=5);
        System.out.println(c/=5);

    }
}
