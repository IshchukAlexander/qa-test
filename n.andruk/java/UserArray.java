public class UserArray {
    public static void main(String[] args) {
        int [] arr = newArray(new int[]{ 2, 3,4, 5,7}, 22);
        for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i]+ " ");
    }
    public static int [] newArray (int [] array, int value ){
        int [] newarr = new int[array.length+1];
        for (int i = 0; i < newarr.length; i++) {
            if (i == 0) {
                newarr[i] = value;
                continue;
            }
            newarr[i] = array[i - 1];
        }
        return newarr;
    }


}
