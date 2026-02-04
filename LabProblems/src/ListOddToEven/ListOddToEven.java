package ListOddToEven;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class ListOddToEven
{
	public static int go( ArrayList<Integer> ray )
	{
		// store odd index
		int oddIndex = -1;

		// odd number
		for(int i = 0; i < ray.size(); i++){

			if(ray.get(i) % 2 != 0){
				oddIndex = i; // 0
				break;
			}
		}

		// if odd number is not found
		if(oddIndex == - 1){
			return -1;
		}

		// even number
		for(int j = ray.size() - 1; j > oddIndex; j--){
			if(ray.get(j) % 2 == 0){
				// distance odd == even
				return j - oddIndex; // 12 > 2 = 10
			}
		}

		// when odd is found but even isnt there
		return -1;
	}
}