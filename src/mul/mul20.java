package mul;

public class mul20 {
    public static void main(String[] args) {
        int rows = 6, k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }
}
