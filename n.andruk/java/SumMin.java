public class SumMin {
    public static void main(String[] args) {
        int A = 10;
        int B = 25;
        int sum =0;

        for (int i = A; i < B; i++){   //10+11+12+13+14+15+16+17+18+19+20+21+22+23+24
            sum+=i;
        }
        System.out.println("Сумма чисет в интервале " + "[" + A + ","+ B + "] =" + sum  );
        System.out.println(" Нечетные числа в данном интервале :");
        for (int i = A; i < B; i++){
            if ( !((i % 2 ) == 0)){
            System.out.println( i );
            }
        }



    }
}

