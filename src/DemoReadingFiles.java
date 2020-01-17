import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class DemoReadingFiles {

	public static void main(String[] args)  {
		
		
		double[] d = readFile("randomDataExtract1.txt");
		for (int i = 0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		
		
		double min = findMin(d);
		double max = findMax(d);
		double range = findRange(d);
		double mean = findMean(d);
		double median = findMedian(d);
		double sum = findSum(d);
		
		System.out.println("\nMin: " +min);
		System.out.println("Max: " +max);
		System.out.println("Range: " +range);
		System.out.println("Mean: " +mean);
		System.out.println("Median: " +median);
		System.out.println("Sum: " +sum);
		
		
	}
	
	/**
	 * This function loops through the data and finds the sum
	 * @param d
	 * @return
	 */
	public static double findSum(double[] d) {
		
		double sum = 0;
		for (int i = 0; i<d.length; i++) {
			sum = sum + d[i];
		}
		return sum;
		
	}
	
	/**
	 * This function loops through the data and finds the median
	 * @param d
	 * @return
	 * 
	 * Precondition - The data has to be in order beforehand
	 * 
	 */
	public static double findMedian(double[] d) {
		
		Arrays.sort(d);
		
		
		if (d.length % 2 == 0) {
			double med1 = d[d.length/2];
			double med2 = d[d.length/2 -1];
			double medAv = (med1 + med2)/2;
			
			return medAv;
			
			
		} else {
		return d[d.length/2 -1];
		}
	}
	
	/**
	 * This function loops through the data and finds the mean
	 * @param d
	 * @return
	 */
	public static double findMean(double[] d) {
		
		double av = 0;
		for (int i = 0; i < d.length; i++) {
			av = av + d[i];
		}
		
		double mean = av/d.length;
		return mean;
		
	}
	
	/**
	 * This function loops through the data and finds the Range
	 * @param d
	 * @return
	 */
	public static double findRange(double[] d) {
		
		double min = findMin(d);
		double max = findMax(d);
		return max - min;
	}
	/**
	 *This function loops through the data and finds the min
	 * @param d
	 * @return
	 */
	public static double findMin(double[] d) {
		
		
		//Always set your min or max to an element in the list
		double min = d[0];
		for (int i = 0; i < d.length; i = i + 1) {
			if (d[i] < min) {
				min = d[i];
			}
		}
		return min;
	}
	
	/**
	 * This function loops through the data and finds the max
	 * @param d
	 * @return
	 */
	public static double findMax(double[] d) {
		
		
		//Always set your min or max to an element in the list
		double max = d[0];
		for (int i = 0; i < d.length; i = i + 1) {
			if (d[i] > max) {
				max = d[i];
			}
		}
		return max;
	}
	
	
	/**
	 * This reaches out and accesses the file, adding it to the program in the form of an array of doubles
	 * @param name
	 * @return
	 */
	public static double[] readFile(String name)  {
				
			try {
				//System.out.println("BEFORE TRY");
				
				File file = new File(name);
				Scanner s = new Scanner(file);
				int cnt = 0;
				
				
				while (s.hasNext()) { //This loop will scan through the text file until there are no data points left
					cnt = cnt + 1;
					s.nextDouble();
				}
				
				double[] arr = new double[cnt];
				Scanner s1 = new Scanner(file);
				
				
				for (int i=0; i<arr.length; i = i+1) {
					arr[i] = s1.nextDouble();
				}
				
				return arr;
				
				//System.out.println("AFTER TRY");				
				
				
				
	
			
			}
			catch (Exception e) {
				System.out.println("NO FILE FOUND");
				
			}
			return null;
	}
}
