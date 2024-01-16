public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {-4,-7,-3,-2,-1 , 3 };

        int max = arr[0] ;

        for(int i=0 ; i<arr.length ; i++){

            if(max<arr[i]){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
