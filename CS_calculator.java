import java.util.*;

public class CS_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");

        int n = sc.nextInt();

        System.out.println("Enter the operation  ");

        char op = sc.next().charAt(0); // + , - , * , /

        System.out.println("Enter the Second number ");

        int m = sc.nextInt();

        switch (op) {
            case '+':
                int ans = n + m;
                System.out.println(ans);
                break;

            case '-':
                int ans2 = n - m;
                System.out.println(ans2);
                break;

            case '*':
                int ans3 = n * m;
                System.out.println(ans3);
                break;

            case '/':
                int ans4 = n / m;
                System.out.println(ans4);
                break;

        }

    }
}
