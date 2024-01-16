public class ArraysFindTheIndex {
    public static void main(String[] args) {
        // linear search in array 
        int[] arr = {10,20,30,40,50,40,40,60,40,70};

        // Question 1) find the index of 30 
            // int tar = 30 ;
            // int ans = -1 ;

            // for(int i=0;i<arr.length;i++){
            //     if(arr[i] == tar ){
            //         ans = i ;
            //         break;
            //     }
            // }

            // System.out.println(ans);

        // Question 2) find the first and last occurence of 40 
        // int tar = 40 ;
        // int fo = -1 ;
        // int lo = -1 ;

        // for(int i=0;i<arr.length;i++){ // from this i will get the first occurence 
        //     if(arr[i]==tar){
        //         fo = i ;
        //         break;
        //     }
        // }

        // for(int i=arr.length-1;i>=0;i--){ // from this we will get the last occurence 
        //     if(arr[i]==tar){
        //         lo = i ;
        //         break;
        //     }
        // }

        // System.out.println( "first occurence is " + fo + "   " + "Last occurence is " + lo);

        // Question 3) find the frequency of 40 

        int count = 0 ;
        int tar = 40 ;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                count++;
            }
        }
        System.out.println(count);
    }
}


