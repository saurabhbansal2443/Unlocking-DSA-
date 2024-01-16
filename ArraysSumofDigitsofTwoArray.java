import java.util.Arrays;

public class ArraysSumofDigitsofTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 9, 6, 7, 9, 1 };
        int[] arr2 = { 3, 7, 1, 2 };

        int[] ans = addArray(arr1,arr2);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] addArray(int[] arr1, int[] arr2) {
        int resSize = Math.max(arr1.length, arr2.length);
        int[] res = new int[resSize];

        int p1 = arr1.length - 1;
        int p2 = arr2.length - 1;
        int p3 = res.length - 1;

        int carry = 0 ;

        while (p1 >= 0 || p2 >= 0) {
            int val1 = p1 >= 0 ? arr1[p1] : 0; //getting the values of arr1 
            int val2 = p2 >= 0 ? arr2[p2] : 0; //getting the values of arr2

            int sum = val1 + val2 + carry ;   

            int d = sum%10 ;
            carry = sum/10 ;

            res[p3] = d ;  // putting the digit in result array 

            p3--; // moving the pointers 
            p2--;
            p1--;
        }

        if(carry>0){
            int[] nres = new int[resSize+1];
            nres[0] = carry ;
            for(int i=0;i<res.length;i++){
                nres[i+1]=res[i];
            }
            return nres;
        }

        return res ;

    }
}
