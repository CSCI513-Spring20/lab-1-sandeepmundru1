import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {
	String token1,token2,token3;
	int i=0; 
	int h = 0;
	long totalPopulation = 0;
	

	SortStratergy sortStratergy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
	// Lab Exercise:  After creating some Stratergy classes -- set the default Stratergy here.
	public WorldPopulation(){
		sortStratergy = new SelectionSort(); // Set the default Stratergy here.	
	}
	
	public void readInputFile(){
		population = readPopulationFile("Lab1\\WorldPopulation.csv");
	}
	
	public void setStratergy(SortStratergy Stratergy){
		sortStratergy = Stratergy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
		i = 0;
		
		try {
			FileReader inputFile = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(inputFile);
			String line;
			while((line = reader.readLine()) != null) {
			//System.out.println(line);
				StringTokenizer tokenizer = new StringTokenizer(line, ",") ;
				token1 = tokenizer.nextToken();
				token2 = tokenizer.nextToken();
				token3 = tokenizer.nextToken();
				population[i] = Long.parseLong(token3);
				i++;
				
			 }
			reader.close();
			} catch (Exception e) {
			e.printStackTrace();
			
			}
		
	  
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the Stratergy object
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
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
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