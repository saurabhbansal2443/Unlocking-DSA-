public class TwoDArraySumMaxSearch {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 65, 7, 8 },
                { 9, 10, 11, 12 } };

        // int ans = sumArray(arr);
        // System.out.println(ans);

        System.out.println(max(arr));

    }

    public static int sumArray(int[][] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ans = ans + arr[i][j];
            }
        }
        return ans;
    }

    public static boolean find(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    return true;
                }
            }
        }

        return false;
    }

    public static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }
}
