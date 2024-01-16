public class StringBaics{     
    public static void main(String[] args) {
      String str = "HelloWorld";


      int length = str.length();

      char ch = str.charAt(5);

      String sub1 = str.substring(4);

      String sub2 = str.substring(4,10);

    //   System.out.println(sub2);

    //    String rev = reverseString(str);

    //    System.out.println(checkPalindrome("Radar"));

    System.out.println(countVowels("Game"));
    }

    public static String reverseString(String str){

        String ans = "";

        for(int i = str.length()-1 ; i>=0;i--){

            char ch = str.charAt(i);

            ans = ans + ch ;

        }

        return ans ;
    }

    public static boolean checkPalindrome(String str){

        int start = 0 ;
        int end = str.length() -1 ;

        while(start<=end){

            char startChar = str.charAt(start);
            char endChar = str.charAt(end);

            if(startChar != endChar){
                return false ;
            }

            start++ ;
            end-- ;
        }

        return true ;
    }

    public static int countVowels(String str){

        int count = 0 ;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            } 
        }

        return count ;
    }
}