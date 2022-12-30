public class BubbleSort
{

	/** Sorting algorithm that traverses from first element to last element. Elements are sorted by comparing the current element with the next element -- if
	 * current element is greater than the next element, then the two elements indices are swapped.
	 * @param intArray int[] : array of integers to be sorted.
	 */
	static void bubbleSort( int[] intArray )
	{
		int n = intArray.length;
		int temp = 0;

		for ( int i = 0 ; i < n ; i++ )
		{
			for ( int j = 1 ; j < ( n - i ) ; j++ )
			{
				if ( intArray[ j - 1] > intArray[j] )
				{
					temp = intArray[j - i];
					intArray[j - i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
	}
}