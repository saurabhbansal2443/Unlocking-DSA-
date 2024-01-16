public class TwoDPractiseSet3 {
    public static void main(String[] args) {
        int[][] arr = { { 10, 2, 3, 44 }, 
                        { 5, 16, 7, 8  }, 
                        { 19, 10, 11, 12 } };

                        // printColumnWise(arr);

                        // System.out.println(findTheRowWithLargestSum(arr));

                        System.out.println(findTheColumnWithSmallestSum(arr)-);
    }

    public static void printColumnWise(int[][] arr){
        for(int j = 0 ; j<arr[0].length;j++){ // this is loop for column 
            for(int i=0;i<arr.length;i++){  // this is the loop for rows 

                System.out.println(arr[i][j]);
            }
        }
    }

    public static int findTheRowWithLargestSum(int[][] arr){
            int max = Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){
                int rsum = 0 ;
                for(int j=0;j<arr[0].length;j++){
                    rsum += arr[i][j];
                }
                max = Math.max(rsum,max);
            }

            return max ;
    }
   
    public static int findTheColumnWithSmallestSum(int[][] arr){
        int min = Integer.MAX_VALUE;

        for(int j = 0 ; j<arr[0].length;j++){ // this is loop for column 
            int colSum = 0 ;
            for(int i=0;i<arr.length;i++){  // this is the loop for rows 
                colSum += arr[i][j];
                
            }

            min = Math.min(min,colSum);
        }

        return min;
    }

}
