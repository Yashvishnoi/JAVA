import java.util.Scanner;
 
public class MatrixTranspose
{
    public static void main(String args[])
    {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        n = input.nextInt();
        int A[][]=new int[n][n];
    
  
        System.out.println("Enter the elements of martix \n");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                A[i][j] = input.nextInt();
            }
        }
       
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(A[j][i]);
            }
            System.out.println();
        }
        input.close();
    }
}