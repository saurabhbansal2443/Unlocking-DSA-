public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {9,4,2,1,3,5};

        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<arr.length;i++){

            if(min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
