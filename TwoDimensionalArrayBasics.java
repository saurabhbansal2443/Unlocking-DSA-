public class TwoDimensionalArrayBasics {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];// 3 is our rows // 4 is our column

        int[][] arr2 = { { 1, 2, 3, 4 }, 
                         { 5, 6, 7, 8 }, 
                         { 9, 10, 11, 12 } }; // 3 arrays these are rows // 4 column


        //access the elements of 2D array 
        // int ele = arr2[1][1]; //6 
        // int ele2 =arr2[1][3]; //8 
        // int ele3 = arr2[2][2] ; //11
        // System.out.println(ele3);

        // length of 2D array ;

        int row = arr2.length ;
        int col = arr2[0].length;

        // System.out.println(row + "  " + col );

        for(int i=0;i<arr2.length ;i++){
            for(int j=0;j<arr2[0].length;j++){
                System.out.print(arr2[i][j] + "   ");
            }
            System.out.println();
        }
    }   
}
