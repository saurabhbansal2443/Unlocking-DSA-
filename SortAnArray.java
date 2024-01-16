import java.util.*;
public class SortAnArray {
public static void main(String[] args) {
    int[] arr = {9,4,2,1,0,5,6,8};  // 0,1,2,4,5,6,8,9;

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + "   ");
    }
     System.out.println();
    System.out.println("After sorting ");

    Arrays.sort(arr);

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + "   ");
    }

}
}
