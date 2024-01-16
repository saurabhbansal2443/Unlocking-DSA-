public class LS_factorial {
    public static void main(String[] args) {
        int n = 6;

        int ans = 1;

        for (int i = 1; i <= n; i++) {

            ans = ans * i;
        }

        System.out.println(ans);

    }
}
