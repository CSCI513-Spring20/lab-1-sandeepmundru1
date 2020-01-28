
public class InsertionSort implements SortStratergy {

	@Override
	public void getSortTime(long[] population) {
		// TODO Auto-generated method stub
		long [] array = new long[population.length];

		array = population;
		long ST = System.currentTimeMillis(); // ST= Start Time
		
	   for (int i=1; i< array.length; i++)
	   {
	      long index = array[i]; int j = i;
	      while (j > 0 && array[j-1] > index)
	      {
	           array[j] = array[j-1];
	           j--;
	      }
	      array[j] = index;
	      
	   } 
	   
		long ET = System.currentTimeMillis(); // ET = End Time
		long Total = ET - ST;
		
		
		System.out.println("Insertion Sort Time"+Total+"  Milli Seconds");


}
}