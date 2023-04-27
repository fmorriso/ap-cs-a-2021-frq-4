public class ArrayResizer {
    
    /**
     * Inspects every column in row "r" of array2D to determne if every
     * value is non-zero.
     * @param array2D - a two dimensional array of integers.
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
}
