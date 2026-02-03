package SumRunner;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go( List<Integer> ray)
	{
		int firstElement = ray.get(0);
		int sum = 0;
		// if element is greater or not
		boolean notGreater = true;
		for(int i = 1; i < ray.size(); i++){

			if(firstElement < ray.get(i)){
				sum += ray.get(i);
				notGreater = false;
			}
		}
		if(notGreater) {
			return -1;
		}

		return sum;
	}
}