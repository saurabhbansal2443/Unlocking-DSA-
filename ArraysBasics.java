public class ArraysBasics {
    public static void main(String[] args) {
        // dataType[] arrayName = new dataType[size];

        int[] arr = new int[5];

        int[] arr2 = {1,2,3,4,9,6,7};

        String[] arr3 = new String[7];

        // 1) answer

        int[] ans ; // array decleration 

        // 2) answer 

         ans = new int[5]; // array intilaisation (memory allot )

         //3) answer

         ans[2] = 9 ;

         //4) answer 

         ans[2] = 100 ;

         //5) length of array 

         int length = ans.length;

         //6) interate or print the array 

         for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
         }

         //System.out.println(length);

         




    }
}
