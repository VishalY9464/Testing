import java.util.Scanner;

class MatrixOperations {

    static void addMatrix(int[][] a, int[][] b, int r, int c) {
        System.out.println("Addition:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }
    }

    static void transpose(int[][] a, int r, int c) {
        System.out.println("Transpose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

    static boolean isSquareMatrix(int r, int c) {
        return r == c;
    }

    static boolean isDiagonal(int[][] a, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i != j && a[i][j] != 0)
                    return false;
        return true;
    }

    static boolean isIdentity(int[][] a, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j && a[i][j] != 1)
                    return false;
                if (i != j && a[i][j] != 0)
                    return false;
            }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = sc.nextInt();

        transpose(matrix, r, c);

        if (isSquareMatrix(r, c)) {
            System.out.println("Square Matrix");
            System.out.println("Diagonal: " + isDiagonal(matrix, r));
            System.out.println("Identity: " + isIdentity(matrix, r));
        } else {
            System.out.println("Not a square matrix");
        }
    }
}
