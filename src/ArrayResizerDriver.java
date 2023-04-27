// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ArrayResizerDriver
{
    public static void main(String[] args)
    {
        int[][] arr = {
                {2, 1, 0},
                {1, 3, 2},
                {0, 0, 0},
                {4, 5, 6}
        };
        for (int r = 0; r < arr.length; r++) {
            System.out.format("arr for row %d %b%n", r, ArrayResizer.isNonZeroRow(arr, r));
        }


    }
}