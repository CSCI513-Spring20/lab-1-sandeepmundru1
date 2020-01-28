
public class BubbleSort implements SortStratergy {

	@Override
	public void getSortTime(long[] population) {
		// TODO Auto-generated method stub
		long [] ar = new long[population.length];
		long startTime = System.currentTimeMillis();
		ar = population;		
		   for (int i = (ar.length - 1); i >= 0; i--)
		   {
		      for (int j = 1; j <= i; j++)
		      {
		         if (ar[j-1] > ar[j])
		         {
		              long temp = ar[j-1];
		              ar[j-1] = ar[j];
		              ar[j] = temp;
		         } 
		       } 
		    } 
		   
		long endTime = System.currentTimeMillis();
	
		long totalTime = endTime - startTime;
		System.out.println("Bubble Sort Time "+totalTime+" Milli Seconds");

}
	}