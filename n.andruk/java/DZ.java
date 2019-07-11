import java.lang.reflect.Array;
import java.util.Scanner;

public class DZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String [] strArr = str.split("");
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }
        System.out.println(str);
        String str2 = s.next();
        String [] strArr2 = str2.split("");
        int[] arr2 = new int[str2.length()];
        for (int i = 0; i < str2.length(); i++) {
            arr2[i] = Integer.parseInt(strArr2[i]);
        }
        System.out.println(str2);
        int [] res = new  int [Math.max(arr.length, arr2.length)+1];
        int excess =0;
        for (int i = 0; i < res.length; i++) {
            int f1 = (i < arr.length) ? arr[i] : 0;
            int f2 = (i < arr2.length) ? arr2[i] : 0;
            int sum = f1 + f2 + excess;
            if (sum > 9) {
                excess = 1;
                sum %= 10;
            } else {
                excess = 0;
            }
            res[i] = sum;
        }
        printNum(arr, " ");
        System.out.println("\n+");
        printNum(arr2, " ");
        System.out.println("\n=");
        printNum(res, "");
    }

    private static void printNum(int num[], String leading){
        System.out.print(leading);
        for(int i=num.length-1; i>=0; i--){
            System.out.print(num[i]);
        }
    }
}


//        int [] result = addVectors(arr,arr2);
//        System.out.println(result);



//    public static int[] addVectors (int [] arr, int[] arr2 ){
//        int [] res = new  int [Math.max(arr.length, arr2.length)+1];
//        int excess =0;
//
//       for (int i=capacity-1; i>=0; i--){
//           c[i]=arr[i]+arr2[i];
//           if (c[i]>9){
//               excess =1;
//               c[i] %=10;
//           }else {
//               excess =0;
//           }
//       }
//       for(int i = 0; i <c.length; i++){
//           System.out.print(c[i]);
//      }
//
//              return c;
//    }
//}
//
