package ListMostFrequent;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;

public class ListMostFreq
{
	//method go will return the value 
	//that appears the most
	//if several numbers all appear
	//the same number of times
	//return the first number found
	public static int go( ArrayList<Integer> ray )
	{
		int mostFreq = ray.get(0);
		int maxCount= 0;

		for(int i = 0; i < ray.size() ; i++){
			int currentValue = ray.get(i);
			int currentCount = 0;

			for(int j = 0; j < ray.size(); j++){

				if(ray.get(j) == currentValue){
					currentCount++;
				}
			}

			if(currentCount > maxCount){
				maxCount = currentCount;
				mostFreq = currentValue;

			}
		}

		return mostFreq;
	}
}