public class ArrayAscendingOrde {
    public static void main(String[] args) {
        // example 1) sorted array
        int[] arr1 = { 10, 20, 30, 40, 50, 60 }; 

        // example 2) unsorted array
        int[] arr2 = { 10, 20, 30, 15, 40, 45 }; 

        System.out.println(check(arr2));


    }

    public static boolean check(int[] arr ){
        if(arr.length == 0 || arr.length == 1 ){
            return true ;
        }

        for(int i=1 ;i<arr.length ;i++){
            if(arr[i-1]>=arr[i]){
                return false;
            }
        }

        return true ;
    }
}
