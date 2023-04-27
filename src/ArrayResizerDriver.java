/**
 * AP CS A - 2021 - FRQ #4
 * Created By: Frederick Morrison
 * Creation Date: 2023-04-27
 */

import java.util.Arrays;

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

        PartA(arr);

        PartB(arr);

    }

    private static void PartA(int[][] arr)
    {
        System.out.println("Part A");
        System.out.format("There are %d non-zero rows in the array%n", ArrayResizer.numNonZeroRows(arr));
        for (int r = 0; r < arr.length; r++) {
            System.out.format("isNonZeroRow for row %d continaing %s is %b%n", r, Arrays.toString(arr[r]) ,ArrayResizer.isNonZeroRow(arr, r));
        }
    }

    private static void PartB(int[][] arr)
    {
        System.out.println("\nPart B");

        System.out.println("The original 2d array:");
        for(int r = 0; r < arr.length; r++)
        {
            System.out.println(Arrays.toString(arr[r]));
        }

        System.out.println("After call to resize, the returned 2D array contains:");
        int[][] resizedArray = ArrayResizer.resize(arr);

        for(int r = 0; r < resizedArray.length; r++)
        {
            System.out.println(Arrays.toString(resizedArray[r]));
        }
    }
}