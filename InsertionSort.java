
public class InsertionSort implements SortStratergy {

	@Override
	public void getSortTime(long[] population) {
		// TODO Auto-generated method stub
		long [] ar = new long[population.length];

		ar = population;
		long startTime = System.currentTimeMillis();
		
	   for (int i=1; i< ar.length; i++)
	   {
	      long index = ar[i]; int j = i;
	      while (j > 0 && ar[j-1] > index)
	      {
	           ar[j] = ar[j-1];
	           j--;
	      }
	      ar[j] = index;
	      
	   } 
	   
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		
		
		System.out.println("Insertion Sort Time"+totalTime+"  Milli Seconds");


}
}