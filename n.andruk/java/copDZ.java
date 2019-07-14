import java.util.Scanner;

    public class copDZ {
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
            int excess = 0;
            int n1 = arr.length;
            int n2 = arr2.length;
            int temp1;
            for (int i = 0; i < n1/2; i++) {
                temp1 = arr[n1-i-1];
                arr[n1-i-1] = arr[i];
                arr[i] = temp1;
            }
            for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]);
            }
            System.out.println("\n");
            int temp2;
            for (int i = 0; i < n2/2; i++) {
                temp2 = arr2[n1-i-1];
                arr2[n2-i-1] = arr2[i];
                arr2[i] = temp2;
            }
            for (int i=0; i<arr2.length; i++){
//            System.out.print(arr2[i]);
            }
            int [] res = new  int [Math.max(arr.length, arr2.length)+ 1];
            for (int i = 0; i < res.length; i++) {
                int f1 = (i < arr.length) ? arr[i] : 0;
                int f2 = (i < arr2.length) ? arr2[i] : 0;
                int sum = f1 + f2 + excess;
                if (sum > 9) {
                    excess = 1;
                    sum %= 10;
//                    int [] array = newArray(new int[]{ sum}, 1);
//                    System.out.print(array);
                } else {
                    excess = 0;

//
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
//            public static int[] newArray(int[] sum, int excess) {
//        int [] res = new int[sum.length+1];
//        for (int i = 0; i <sum.length ; i++) {
//            if (i==0){
//                res[i]=excess;
//                continue;
//            }
//            res[i]=sum[i-1];
//        }return res;

    }

