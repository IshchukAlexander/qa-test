public class ReversedArray {
    public static void main(String[] args) {
        int [] array1;
        int [] array2;
        array1 = ReversedArray.myReverse(new int []{1,3,4,6,7,8,9,22});

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
//        array2 = ReversedArray.subArray(new int[]{1,3,4,6,7,8,9,22},4,7);

//        for (int i = 0; i < array2.length; i++) {
//            System.out.print(array2[i] + " ");
//        }
    }
    public static int [] myReverse (int [] array ){
        int [] array1 = new int[array.length];
        for (int i = array.length-1, j=0 ; i >= 0 ; i--,j++){
            array1[j] = array[i];
        }
        return  array1;
    }
//    public static int [] subArray(int[] array, int index, int count){
//
//    }

}
