
public class BubbleSort implements SortStratergy {

	@Override
	public void getSortTime(long[] population) {
		// TODO Auto-generated method stub
		long [] array= new long[population.length];
		long ST = System.currentTimeMillis(); // Start Time
		array = population;		
		   for (int i = (array.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (array[j-1] > array[j])
		         {
		              long temp = array[j-1];
		              array[j-1] = array[j];
		              array[j] = temp;
		         } 
		       } 
		    } 
		   
		long ET = System.currentTimeMillis(); // ET = End Time
	    long Total = ET - ST;
		System.out.println("Bubble Sort Time "+Total+" Milli Seconds");

}
	}