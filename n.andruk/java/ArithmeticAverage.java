public class ArithmeticAverage {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 8;
//        int average = (a + b + c)/ 3;
//        float average = (a + b + c)/3f;
        double average = (a + b + c)/3d;
//   Лучше использовать float/double для точности, так как int откидает правую часть и выводит просто 6
        System.out.println(average);
    }
}
