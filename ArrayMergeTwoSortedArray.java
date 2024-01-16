import java.util.Arrays;

public class ArrayMergeTwoSortedArray {
    public static void main(String[] args) {
        
        int[] arr1 = {10,30,50,70,75,80};
        int[] arr2 = {20,40,60};

        int[] res = merge(arr1, arr2);

        System.out.println(Arrays.toString(res));
    }

    public static int[] merge(int[] arr1 , int[] arr2){

        int[] res = new int[arr1.length + arr2.length];

        int p1 = 0 ;
        int p2 = 0 ;
        int p3 = 0 ;

        while(p1<arr1.length && p2<arr2.length){

            if(arr1[p1]<arr2[p2]){
                res[p3] = arr1[p1];
                p1++;
                p3++;
            }else{
               res[p3] = arr2[p2];
               p2++;
               p3++; 
            }
        }

        if(p1 == arr1.length){
            for(int i=p2 ; i<arr2.length ; i++){
                res[p3] = arr2[i];
                p3++;
            }
        }else{
             for(int i=p1 ; i<arr1.length ; i++){
                res[p3] = arr1[i];
                p3++;
             }     
        }
        return res ;
    }
    
}
