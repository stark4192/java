import java.util.Scanner;

class mon2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows & columns of matrix-1 : ");
        int m1 = s.nextInt();
        int n1 = s.nextInt();
        int[][] mat1 = new int[m1][n1];
        System.out.println("Enter the elements of (" + m1 + "*" + n1 + ") matrix-1 :");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat1[i][j] = s.nextInt();
            }
        }

        int[][] mat2 = new int[m1][n1];
        System.out.println("Enter the elements of (" + m1 + "*" + n1 + ") matrix-2 :");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                mat2[i][j] = s.nextInt();
            }
        }

        int add[][] = new int[m1][n1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                add[i][j] = (mat1[i][j] + mat2[i][j]);
            }
        }
        System.out.println("Addition of 2 matrices : ");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }
}
