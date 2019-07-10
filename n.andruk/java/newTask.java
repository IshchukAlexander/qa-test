import java.util.ArrayList;
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


        int capacity = Math.max(arr.length, arr2.length);
        int[] arraySum = new int[capacity + 1];

        int len2 = arr2.length;
        int len1 = arr.length;

        if (len1 >= len2) {
            int lengthDiff = len1 - len2;

            boolean needCarry = false;                  //Флаг для проверки преноса

            for (int i = len1 - 1; i >= 0; i--) {
                int sumPerPosition =0;

                if (needCarry) {
                    sumPerPosition = arr[i] + arr2[i + lengthDiff] +1;
                    needCarry = false;
                }else
                {
                    sumPerPosition = arr[i] + arr2[i + lengthDiff];
                }

                if (sumPerPosition > 9) {
                    arraySum[i + lengthDiff + 1] = sumPerPosition % 10;
                    needCarry = true;
                }else
                {
                    arraySum[i + lengthDiff + 1] = sumPerPosition % 10;
                }
            }
            for (int i = lengthDiff - 1; i >= 0; i--) {

                if(needCarry){
                    arraySum[i + 1] = arr2[i]+1;
                }else
                {
                    arraySum[i + 1] = arr[i] ;
                }

                if (arraySum[i + 1] > 9) {
                    arraySum[i + 1] = arraySum[i + 1] % 10;
                    needCarry = true;
                } else {
                    needCarry = false;
                }
                if (needCarry) {
                    arraySum[0] = 1;
                } else {
                    arraySum[0] = 0;
                }
            }
            if(arraySum[0] == 1)
            {
                System.out.print(1);
            }
            for (int i = 1; i < arraySum.length; i++) {

                System.out.print(arraySum[i]);
            }
        }
    }
}















//       int [] result = addVectors(arr,arr2);
//
//        System.out.println(Arrays.toString(result));
//    }


//    public static int[] addVectors (int [] arr, int[] arr2){
//        int[] biggerArray = arr.length > arr2.length ? arr : arr2;
//        int[] smallerArray = arr.length <= arr2.length ? arr : arr2;
//
//        int[] summedArray = new int[biggerArray.length];
//        System.arraycopy(biggerArray, 0, summedArray, 0, biggerArray.length);
//
//        for (int i = 0; i < smallerArray.length; i++) {
//            summedArray[i] += smallerArray[i];
//        }
//
//        for (int i = 0; i < summedArray.length; i++) {
//            System.out.print(summedArray[i]);
//        }return summedArray;
//    }





















//    public static int[] addVectors (int [] arr, int[] arr2){
//        int capacity = Math.max(arr.length, arr2.length);
//        int [] c = new int[capacity];
//        for (int i=capacity-1; i>=0; i--){
//            c[i]=arr[i]+arr2[i];
//            if (c[i] > 9)
//            {
//                c[i] = c[i] % 10;
//
//            }
//        }
//        for(int i = 0; i <c.length; i++){
//            System.out.println(c[i]);
//        }
//
//        return c;
//    }
//}



//    public static ArrayList<Integer> sum(int[] arr, int[] arr2) {
//        ArrayList<Integer> al = new ArrayList<>();
//        int i = arr.length - 1;
//        int j = arr2.length - 1;
//        int c = 0;
//        while (i >= 0 && j >= 0) {
//            int temp = arr[i] + arr2[j] + c;
//            if (temp >= 10) {
//                int r = temp % 10;
//                al.add(0, r);
//                c = temp / 10;
//            } else {
//                al.add(0, temp);
//                c = 0;
//            }
//            i--;
//            j--;
//        }
//        if (i < 0 && j >= 0) {
//            while (j >= 0) {
//                al.add(0, arr2[j] + c);
//                c = 0;
//                j--;
//            }
//        } else if (j < 0 && i >= 0) {
//            while (i >= 0) {
//                al.add(0, arr[i] + c);
//                c = 0;
//                i--;
//            }
//
//        } else
//            al.add(0, c);
//        return al;









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











