import java.util.Scanner;
 
public class MatrixMultiplication
{
    public static void main(String args[])
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size matrices");
        n = input.nextInt();
        int A[][]=new int[n][n];
        int B[][]=new int[n][n];
        int C[][]=new int[n][n];
        System.out.println("Enter the elements of 1st martrix \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd martix  \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                B[i][j] = input.nextInt();
            }
        }
        System.out.println("Multiplication the matrices...");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("The product is:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}