
import java.util.Arrays;

public class ArraysCopyarray {
    public static void main(String[] args) {
        int[] og = {10,20,30,40,50};

        int[] copy = new int[og.length];

        for(int i=0;i<og.length;i++){
            copy[i] = og[i];
        }

        System.out.println(Arrays.toString(copy));
        

    }
}
