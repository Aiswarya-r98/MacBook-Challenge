public class Main {

    private static int result[][] = new int[100][100];

    public static void main(String[] args) {

        int row = 5;

        /**
         * i=0 => 1
         * i=1 => 1 1
         * i=2 => 1 2 1
         * i=3 => 1 3 3 1
         * i=4 => 1 4 6 4 1
         */

        result[0][0] = 1;
        result[1][0] = 1;
        result[1][1] = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i + 1; j++) {
                if(j==0 || j==i) {
                    result[i][j]=1;
                } else {
                    result[i][j] = result[i-1][j] + result[i-1][j-1];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }


}