public class Pattern15 {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) { // rows

            int diff = n - 1;
            int p = i;

            for (int j = 1; j <= i; j++) { // rowprint
                System.out.print(p + "\t");

                p = p + diff;

                diff--;
            }

            System.out.println();
        }
    }
}
