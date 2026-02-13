package matrixSumming2;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*;

public class MatrixSumming2
{
    private int[][] m = {
            {1,2,3,4,5},
            {6,7,8,9,0},
            {6,7,1,2,5},
            {6,7,8,9,0},
            {5,4,3,2,1}
    };   //load in the matrix values


    public int sum(int r, int c) // r = 2 , c = 2
    {
        // to calculate total after addition
        int total = 0;

        // check rows around r
        for (int row = r - 1; row <= r + 1; row++) // row = r - 1 = 2 - 1 = 1 ; row <= r+1 = 3

        {
            // check columns around c
            for (int col = c - 1; col <= c + 1; col++) // col = c - 1 = 2 - 1 = 1 ; 1 <= 3
            {
                // only add if inside the matrix
                if (row >= 0 && row < m.length &&
                        col >= 0 && col < m[row].length)
                {
                    total += m[row][col]; // 1 1 2 3
                                          // 2 1 2 3
                                          // 3 1 2 3
                }
            }
        }

        return total;
    }

    public String toString()
    {
//    	String out = "";
//
//
//        for(int[] row : m){
//
//            for(int col : row){
//                out += col + " ";
//            }
//        }
        return "";
    }
}
