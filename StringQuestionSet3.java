public class StringQuestionSet3 {
    public static void main(String[] args) {
        String str = "hey I love dsa";

        String ans = convertFirstCharacterUpperCase("Edslash is awesome");

        System.out.println(ans);
    }

    public static String convertFirstCharacterUpperCase(String str){

        if(str.length() == 0 ) return str;

        StringBuilder sb = new StringBuilder("");

        char fc = str.charAt(0);

        if(fc>='A' && fc<='Z'){
            sb.append(fc);
        }else if ( fc>='a' && fc<='z'){
            fc = (char)(fc - 'a' + 'A');
            sb.append(fc);
        }

        for(int i=1 ;i<str.length();i++){
            char pre = str.charAt(i-1);
            char curr = str.charAt(i);

            if(pre == ' '){
                if(curr>='a' && curr<='z'){
                    curr = (char)(curr -'a' + 'A');
                }
            }

            sb.append(curr);
        }

        return sb.toString();


    }
}
