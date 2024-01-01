package com.mycompany.mavenproject1;
class matrixMultiplication
{
public static void main(String args[])
	{
            int row = 3, column = 3, i, j, k;
            int [][] matrixA = {{1,2,3},{2,3,4},{3,4,5}};
            int [][] matrixB = {{9,8,7},{6,5,4},{3,2,1}};
            int [][] matrixC = new int[row][column];
            for(i=0; i<row; ++i)
            {
                for(j=0; j<column; ++j)
                {
                    matrixC[i][j]=0;
                    for(k=0; k<column; ++k)
                    {
                        matrixC[i][j]+= matrixA[i][k]*matrixB[k][j];
                    }
                    System.out.print(matrixC[i][j] + "  ");
                }
                System.out.println();
            }
	}
}