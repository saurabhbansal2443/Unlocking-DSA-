public class StringInternal {
    public static void main(String[] args) {
        // String is not primitive
        String str1 = "Hello";
        String str2 = "Hello";

        String str3 = new String("Hello");
        String str4 = new String("Hello");

        // System.out.println(str1 == str2 ); //true // these both string are made in string pool and they are sharing the same address 

        // System.out.println(str3 == str1); // false // one str1 is in string pool and str3 is in heap ;
                                        // both the address are not same 
                                        // == it only compares the address 
       
    //    System.out.println(str3 == str4 ); // false beacuse they are not on same address 

       // .equals it will compare both the address and data as well 
       
    //    System.out.println(str3.equals(str4)); // true beacuse it is checking the data as well 
        System.out.println(str1.equals(str2)); // true 
    }
}
