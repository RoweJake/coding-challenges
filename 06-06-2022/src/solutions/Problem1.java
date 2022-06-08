package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem1 {
	
	public static void main(String[] args) {
		// Handle number of triples input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of triples:");
		int N = Integer.valueOf(scanner.nextLine());
		
		ArrayList<ArrayList<Integer>> allTriples = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> triple = new ArrayList<Integer>();
		
		// Loop through input for all triples
		for(int i = 0; i < N; i++) {
			System.out.println("Enter a triple:");
			String input = scanner.nextLine();
			String[] splitInput = input.split(" ");
			
			for(String s : splitInput) {
				triple.add(Integer.parseInt(s));
			}
			allTriples.add(triple);
			triple = new ArrayList<Integer>();
		}
		
		scanner.close();
		
		// Loop through output for each triple
		for(ArrayList<Integer> currentTriple : allTriples) {
			middleNumber(currentTriple);
		}
	}
	
	/**
	 * Prints out the 2nd highest number in an array list of three numbers.
	 * 
	 * @param triple
	 */
	private static void middleNumber(ArrayList<Integer> triple) {
		Collections.sort(triple);
		System.out.println(triple.get(1));
	}
	
}
