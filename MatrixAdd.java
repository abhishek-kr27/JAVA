public class MatrixAdd {
    public static void main(String[] args) {
        int[][] matrix1 = {{10, 20, 30}, {15 ,25, 35}};
        int[][] matrix2 = {{40, 50 ,60}, {45, 55 ,65}};
        
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        
        int[][] sum = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        
        System.out.println("Matrix 2:");
        printMatrix(matrix2);
        
        System.out.println("Sum of Matrices:");
        printMatrix(sum);
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}