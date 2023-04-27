/**
 * AP CS A - 2021 - FRQ #4
 * Created By: Frederick Morrison
 * Creation Date: 2023-04-27
 */

public class ArrayResizer {
    
    /**
     * Inspects every column in row "r" of array2D to determne if every
     * value is non-zero.
     * @param array2D - a two-dimensional array of integers.
     * @param r - a row index within array2D
     * @precondition - r is a valid row index in array2D
     * @postcondition - array2D is unchanged
     * @return - true if and only if every column in row r of array2D
     *           is non-zero.
     */
    public static boolean isNonZeroRow(int[][] array2D, int r)
    {
        for(int c = 0; c < array2D[0].length; c++)
        {
            if(array2D[r][c] == 0) return false;
        }
        return true;
    }

    public static int numNonZeroRows(int[] [] array2D)
    {
        int n = 0;
        for(int r = 0; r < array2D.length; r++)
        {
            if(isNonZeroRow(array2D, r)) n++;
        }
        return n;
    }

    /**
     * Removes rows from a two-dimensional array that have any column values of zero.
     * @param array2D
     * @return - a two-dimensional array containing only rows from array2D with all non-zero rows
     * @precondition - array2D contains AT LEAST ONE column and AT LEAST ONE ROW with no zeros.
     * @postcondition - array2D is unchanged.
     */
    public static int[][] resize(int[][] array2D)
    {
        int size = numNonZeroRows(array2D);
        int[][] arr = new int[size][array2D[0].length];
        int row = 0;
        for(int r = 0; r < array2D.length; r++)
        {
            if(isNonZeroRow(array2D, r)) {
                for(int c = 0; c < array2D[0].length; c++ )
                {
                    arr[row][c] = array2D[r][c];
                }
                row++;
            }
        }
        return arr;
    }
}
