import java.util.*;

public class CS_grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks of 5 subjects ");

        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int bio = sc.nextInt();
        int maths = sc.nextInt();
        int cs = sc.nextInt();

        int p = (phy + chem + bio + maths + cs )/5;

        if(p>=90){
            System.out.println("Grade A");
        }else if ( p >=80){
            System.out.println("Grade B ");
        }else if ( p>=70){
            System.out.println("Grade C");
        }else if ( p >=60){
            System.out.println("Gradev D");
        }


    }
}
