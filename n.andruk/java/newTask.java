import  java.util.Arrays;
import java.util.Scanner;

public class newTask {
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
       int [] result = addVectors(arr,arr2);


        System.out.println(Arrays.toString(result));
    }
    public static int[] addVectors (int [] arr, int[] arr2){
        int [] c = new int[arr.length];
        for (int i=arr.length; i<arr.length; i++){
            c[i]=arr[i]+arr2[i];
        }return c;
    }
}







//        String str2=s.next();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            char[] array = str.toCharArray();
//            int y = Integer.parseInt(String.valueOf(array[i]));
//            for (int j = 0; j < str2.length(); j++) {
//                char v = str2.charAt(j);
//                char[] array2 = str2.toCharArray();
//                int x = Integer.parseInt(String.valueOf(array2[j]));
//
//            }System.out.print(y + "\n");
//        }
//    }
//    public static int conv(String str){
//        int number1;
//
//    }



//    public static int [] addVectors (int y,int x){
//        ;
//
//        return c;
//    }
//}






//      char[] array = str.toCharArray();
//      int y = 0;
//      for (int i = 0; i < array.length; i++) {
//                y = Integer.parseInt(String.valueOf(array[i]));
//                System.out.print(y);
//











