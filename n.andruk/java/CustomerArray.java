import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задайте размер массива : ");
        int a = sc.nextInt();
        array(a);

    }
    public static void array (int a){
        int arr [] = new int[a];

        for (int i = 0; i<arr.length; i++){
            arr[i]=(int) ((Math.random()*20) -2);
    }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        int arf =0;
        for (int i = 0; i<arr.length; i++){
            arf= sum/a;
        }
        System.out.println("Сумма элементов массива = " +sum);
        System.out.println("Среднее арифметическое число = "+ arf);

        int tempMax = arr[0];
        int tempMin = arr[0];
        for ( int i=0; i< arr.length; i++){
            if (arr[i]< tempMin){
                tempMin=arr[i];
            }
            if (arr[i]>tempMax){
                tempMax=arr[i];
            }
        }
        System.out.println("MAX = " + tempMax);
        System.out.println("MIN = "+ tempMin);
        System.out.print("Нечетные элементы = ");
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0)
                System.out.print(arr[i] + " ");
        }

    }


}



