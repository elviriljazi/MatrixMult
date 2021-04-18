public class Matrix{
    public static void main(String[] args) {

        int[][] matrix1 = MatrixMult.randMatrix(4,4,10);
        int [][] matrix2 = MatrixMult.randMatrix(4,4,10);
        MatrixMult.printMatrix(matrix1);
        System.out.println("$\\times");
        MatrixMult.printMatrix(matrix2);
        System.out.println("=");
        MatrixMult.printMatrix(MatrixMult.matrixMultiplication(matrix1, matrix2));
        MatrixMult.printMatrix(MatrixMult.addMatrix(matrix1,matrix2));

    }

}
