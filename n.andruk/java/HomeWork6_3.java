import java.util.Scanner;

public class HomeWork6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Прямоугольник");
        System.out.println("Введите размер");
        int n = sc.nextInt();
        int p = sc.nextInt();

        for ( int i = 0; i < n; i++){

            for (int x = 0; x < p; x++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Прямоугольний треугольник");
        System.out.println("Введите размер");
        int a = sc.nextInt();

        for ( int q = 0; q < a; q++){

            for (int w = 0; w < q+1; w++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Равносторонний треугольник ");
        System.out.println("Введите размер");
        int b = sc.nextInt();
        for (int r=1; r <= b; ++r){
            for (int j = b; j > r; --j)
                System.out.print(" ");
            for (int j= 1; j< 2*r; ++j )
                System.out.print("*");
            System.out.println();
        }
        System.out.println("Ромб");
        System.out.println("Введите размер");
        int c = sc.nextInt();
        int z = 1;
        for (int i = 0; i < c / 2 + 1; i++) {
            int prob = (c - z) / 2;
            for (int j = 0; j < prob; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();

            z = z + 2;
        }
        z = c - 2;
        // Низ
        for (int i = c / 2; i > 0; i--) {
            int prob = (c - z) / 2;
            for (int j = 0; j < prob; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();
            z = z - 2;
        }

    }
}
