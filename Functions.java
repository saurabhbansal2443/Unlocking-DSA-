public class Functions {
    public static void main(String[] args) {
        // String name = "EdSlash";

        // printName(name);

    //     int a = 5 ;
    //     int b = 6 ;

    //    int ans =  addTwoNumber(a, b);

    //    System.out.println(ans );

       System.out.println(factorial(5));
    }

    public static void printName(String name){

        System.out.println(name);
        return ;
    }

    public static int addTwoNumber(int a , int b ){
        int sum = a + b ;
        return sum ;
    }

    public static int factorial(int n ){
        if(n==0){
            return 1 ;
        }

        System.out.println("Calculating the factorial ");

        int factorial = 1 ;

        for(int i=1 ; i<=n ; i++){
            factorial *= i ;
        }

        return factorial;
    }
}
