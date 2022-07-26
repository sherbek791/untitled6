import java.util.Arrays;

public class lesson4 {
    public static void main(String[] args) {
        int [] arr={
          1234,2345,3456,56,4567,5678,6789,7890,8901
        };

        String [] arr1={
          "java",
          "c++",
          "c#",
          "python",
           "javascript",
        };

        System.out.println("original numbers: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted numbers: "+Arrays.toString(arr));

        System.out.println("original texts: "+Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted texts: "+Arrays.toString(arr1));






    }
}
