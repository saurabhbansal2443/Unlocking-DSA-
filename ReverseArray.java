public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {9,5,4,3,2,1,6}; // 6 ,1 , 2, 3 , 4, 5, 9

        //Method1(arr);
        Method2(arr);
    }

    public static void Method1(int[] arr){
        int[] res = new int[arr.length];

        int itr = 0 ;

        for(int i=arr.length-1;i>=0;i--){
            res[itr] = arr[i];
            itr++;
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+ "  ");
        }
    }

    public static void Method2(int[] arr){

        int start = 0 ;
        int end = arr.length-1;

        while(start<end){

            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k ;

            start++ ;
            end-- ;
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
