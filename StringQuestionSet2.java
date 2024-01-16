import java.util.Arrays;

public class StringQuestionSet2 {
    public static void main(String[] args) {
        String str = "Hello I love edSlash DSA video"; 
        int ans = findLongestWord(str);

        String ans2 = removeWhiteSpaces(str);

        int ans3 = countTheFrequency(str, 'o');

        System.out.println(ans3);

    }

    public static  int findLongestWord(String str){
        String[] arr = str.split(" ");

        int max = 0 ;

        for(int i=0;i<arr.length ; i++){
            String curr = arr[i];
            int currLength = curr.length();

            max = Math.max(max,currLength);
        }

        return max ;
    }

    public static String removeWhiteSpaces(String str){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch !=' '){
              sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static int countTheFrequency(String str , char target){
        int count = 0 ;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if( ch == target){
                count++;
            }
        }

        return count ;
    }
}
