import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {
	String T1,T2,T3;
	int i=0; 
	int h = 0;
	long totalPopulation = 0;
	

	SortStratergy sortStratergy;
	long[] population = new long[13484]; 
	public WorldPopulation(){
		sortStratergy = new SelectionSort(); // Set the default Stratergy here.	
	}
	
	public void readInputFile(){
		population = readPopulationFile("Lab1\\WorldPopulation.csv");
	}
	
	public void setStratergy(SortStratergy Stratergy){
		sortStratergy = Stratergy;
	}
	
	public long[] readPopulationFile(String fileName){
		i = 0;
		
		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(inputFile);
			String line;
			while((line = reader.readLine()) != null) {
			//System.out.println(line);
				StringTokenizer tokenizer = new StringTokenizer(line, ",") ;
				T1 = tokenizer.nextToken();
				T2 = tokenizer.nextToken();
				T3 = tokenizer.nextToken();
				population[i] = Long.parseLong(T3);
				i++;
				
			 }
			reader.close();
			} catch (Exception e) {
			e.printStackTrace();
			
			}
		
	  
		return population;
	}
	
	public void sortPopulation(SortStratergy Stratergy){
		Stratergy.getSortTime(population);
		
		
	}
	
	public void computeTotalPopulation(){
		while(h < population.length) {
			
			totalPopulation = totalPopulation + population[h];
			//System.out.println(totalPopulation);
		} 
			System.out.println("totalPopulation");
			System.out.println(totalPopulation);
	}
	
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		
		BubbleSort bubbleSort = new BubbleSort();
		worldPopulation.setStratergy(bubbleSort); //  BubbleSort.
		worldPopulation.sortPopulation(bubbleSort);	
		
	    // Selection Sort
		worldPopulation.readInputFile();
		SelectionSort selectionSort = new SelectionSort();
		worldPopulation.setStratergy(selectionSort); //  Selection Sort.
		worldPopulation.sortPopulation(selectionSort);	
		
		worldPopulation.readInputFile();
		InsertionSort insertionSort = new InsertionSort();
		worldPopulation.setStratergy(insertionSort); //  Insertion Sort
		worldPopulation.sortPopulation(insertionSort);
		
		worldPopulation.computeTotalPopulation();
	} 

}