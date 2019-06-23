public class Delivery2 {                                            //Использовал пример с урока , вроде работает.
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int factorial = factorial(16);                                // при использовании факториала, на выходе число может не влезть поле int //
        System.out.println("Способов доставки : " + factorial);
    }

}
