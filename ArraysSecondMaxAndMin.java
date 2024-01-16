public class ArraysSecondMaxAndMin {
    public static void main(String[] args) {
        int[] arr = { 10, 90, 30, 40, 50, 120  , 20 };

        // int max = Integer.MIN_VALUE;
        // int smax = Integer.MIN_VALUE;

        // for(int i=0;i<arr.length;i++){

        //     if(arr[i]>max){
        //         smax = max ;
        //         max = arr[i];
        //     }else if ( arr[i]>smax){
        //         smax = arr[i];
        //     }
        // }

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){
                smin = min ;
                min = arr[i];
            }else if ( arr[i]<smin){
                smin = arr[i];
            }
        }

        System.out.println("min is " + min + "   " + " second min is  " + smin);
    }
}
