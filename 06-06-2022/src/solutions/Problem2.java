package solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
	
	public static void main(String[] args) {
		// Handle number of test cases input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of test cases:");
		int T = Integer.valueOf(scanner.nextLine());
		
		ArrayList<String> testCases = new ArrayList<String>();
		
		// Loop through input for all test cases
		for(int i = 0; i < T; i++) {
			System.out.println("Enter a string:");
			String input = scanner.nextLine();
			testCases.add(input);
		}
		
		scanner.close();
		
		// Loop through output for each test case
		for(String testCase : testCases) {
			findSum(testCase);
		}
	}
	
	/**
	 * Adds together all numbers within a string and prints out the resulting sum.
	 * 
	 * @param testCase
	 */
	private static void findSum(String testCase) {
		int sum = 0;
		
		// Strip letters from the string
		testCase = testCase.replaceAll("[^0-9]", "");
		String[] splitDigits = testCase.split("");
		
		for(String digit : splitDigits) {
			sum += Integer.parseInt(digit);
		}
		
		System.out.println(sum);
	}
	
}
