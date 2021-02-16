public class Matrix {
    public static void main(String[] args) {

        int frow = 3;
        int fcolumn = 3;
        String[] fMatrix = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int srow = 3;
        int scolumn = 3;
        String[] sMatrix = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int[][] matrix1 = new int[frow][fcolumn];
        for (int i = 0; i < frow; i++)
            for (int j = 0; j < fcolumn; j++)
                matrix1[i][j] = Integer.parseInt(fMatrix[i * fcolumn + j]);

        int[][] matrix2 = new int[srow][scolumn];
        for (int i = 0; i < srow; i++)
            for (int j = 0; j < scolumn; j++)
                matrix2[i][j] = Integer.parseInt(sMatrix[i * scolumn + j]);

        System.out.println("Matrica 1");
        printMatrix(matrix1);
        System.out.println("Matrica 2");
        printMatrix(matrix2);
        System.out.println("Shumzimi Matricave");
        printMatrix(matrixMultiplication(matrix1, matrix2));
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int mRow = matrix1.length;
        int mColumn = matrix2[0].length;
        int[][] mMult = new int[mRow][mColumn];

        for (int i = 0; i < mRow; i++)
            for (int j = 0; j < mColumn; j++)
                for (int k = 0; k < mRow; k++)
                    mMult[i][j] += matrix1[i][k] * matrix2[k][j];

        return mMult;
    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}