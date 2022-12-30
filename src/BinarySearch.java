import java.util.List;


public class BinarySearch
{

	int binarySearch( List<Integer> sortedList, int target )
	{
		int indexLow = 1;
		int indexHigh = sortedList.size();
		int indexMiddle;

		while ( indexLow <= indexHigh )
		{
			indexMiddle = indexLow + ( indexHigh - indexLow ) / 2;

			if ( sortedList.get(indexMiddle) == target )
			{
				return sortedList.get( indexMiddle );
			}

			else if ( sortedList.get( indexMiddle ) < target )
			{
				indexLow = indexMiddle + 1;
			}

			else
			{
				indexHigh = indexMiddle + 1;
			}
		}

		return -1;
	}



	int recursiveBinarySearch( int[] intArray, int indexLow, int indexHigh, int target )
	{
		if ( indexHigh >= 1 )
		{
			int indexMiddle = indexLow + ( indexHigh - indexLow ) / 2;

			if ( intArray[indexMiddle] == target )
			{
				return indexMiddle;
			}

			if ( intArray[indexMiddle] > target )
			{
				return recursiveBinarySearch( intArray, indexLow, indexMiddle - 1, target );
			}

			else
			{
				return recursiveBinarySearch( intArray, indexMiddle + 1, indexHigh, target );
			}
		}

		return -1;
	}
}