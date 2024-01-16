public class CS_traingle {
    public static void main(String[] args) {
        int a = 6 ;
        int b = 6 ;
        int c = 6 ;

        if(a==b && a==c ){
            System.out.println("Equilateral ");
        }else if ( a==b || a==c || b==c ){
             System.out.println("Iso  ");
        }else{
            System.out.println("Scalene ");
        }
    }
}
