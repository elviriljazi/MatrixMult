import java.util.Random;

public class MatrixMult {

    public static int[][] randMatrix(int mRow, int mColumn, int length) {
        int[][] randMAtrix = new int[mRow][mColumn];
        Random rand = new Random();
        for (int i = 0; i < mRow; i++)
            for (int j = 0; j < mColumn; j++)
                randMAtrix[i][j] = rand.nextInt(length) - 3;
        return randMAtrix;
    }

    public static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int mRow = matrix1.length;
        int mColumn = matrix2[0].length;
        int[][] mMult = new int[mRow][mColumn];

        if (mColumn == mRow)
            for (int i = 0; i < mRow; i++)
                for (int j = 0; j < mColumn; j++)
                    for (int k = 0; k < mRow; k++)
                        mMult[i][j] += matrix1[i][k] * matrix2[k][j];
        else
            System.out.println("Matricat nuk mund te shumzohen");
        return mMult;
    }

    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] addMatrix = new int[matrix1.length][matrix1[0].length];
        if (matrix1.length == matrix2.length)
            for (int i = 0; i < matrix1.length; i++)
                for (int j = 0; j < matrix1[0].length; j++)
                    addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];

        else
            System.out.println("Matricat nuk jane te tipit te njejt");
        return addMatrix;
    }


    public static void printMatrix(int[][] matrix) {
        System.out.println("\\begin{pmatrix}");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + "&");
            }
            System.out.println("\b\\\\");
        }
        System.out.println("\\end{pmatrix}$");
    }
}