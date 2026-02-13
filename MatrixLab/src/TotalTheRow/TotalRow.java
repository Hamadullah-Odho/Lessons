package TotalTheRow;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {

        // arraylist
        // this will store total calculation of each row
        List<Integer> totalRows = new ArrayList<>(20);

        for(int row = 0 ; row < m.length; row++){

            // this will add all numbers in row
            int sum = 0;

            for(int col = 0; col < m[row].length; col++){

                sum +=  m[row][col];
            }

            // add sum
            totalRows.add(sum);
        }

		return totalRows;
    }
}
