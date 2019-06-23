import java.util.Scanner;

public class Rectangle {                                     // Добавил сканер
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();

        for ( int i = 0; i < n; i++){

            for (int y = 0; y < num; y++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

