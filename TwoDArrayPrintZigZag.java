public class TwoDArrayPrintZigZag {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2,  3, 4  },
                        { 5, 65, 7, 8 },
                        { 9, 10, 11, 12 } };
        
    
        for(int c = 0 ; c<arr[0].length ;c++){

            if(c%2==0){

                for(int r = 0 ; r<arr.length ; r++){  //this is the loop for
                    System.out.println(arr[r][c]);     // even column 
                }

            }else{
                  for(int r = arr.length-1 ; r>=0 ; r--){  //this is the loop for
                    System.out.println(arr[r][c]);     // odd column 
                }
            }
        }

    }
}
