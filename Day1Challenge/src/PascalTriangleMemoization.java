public class PascalTriangleMemoization {

    private static int result[][] = new int[100][100];

    public static void main(String[] args) {

        int row = 8;

        /**
         * i=0 => 1
         * i=1 => 1 1
         * i=2 => 1 2 1
         * i=3 => 1 3 3 1
         * i=4 => 1 4 6 4 1
         */

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {

            return 1;
        } else if (result[i][j] != 0) {
            return result[i][j];
        } else {
            int number = pascal(i - 1, j) + pascal(i - 1, j - 1);
            result[i][j] = number;
            return result[i][j];
        }
    }
}