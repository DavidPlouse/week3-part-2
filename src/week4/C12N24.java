/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class C12N24 {
    public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("Salary.txt");

		
		if (file.exists()) {
			System.out.println("File " + file.getName() + " already exists");
			System.exit(0);
		}
		String rank = "";
		double salary;
		try (
			// Create output file
			PrintWriter output = new PrintWriter(file);
		) {
			// Save data to file
			for (int i = 1; i <= 1000; i++) {
				output.print("FirstName" + i + " LastName" + i);
				rank = getRank();
				salary = getSalary(rank);
				output.printf(" " + rank + " %.2f\n", salary);
			}
		}
	}

	/** Return a randomly generated rank */
	public static String getRank() {
		String[] ranks = {"assistant", "associate", "full"};
		return ranks[(int)(Math.random() * ranks.length)];
	}

	/** Return a randomly generated salary */
	public static double getSalary(String rank) {
		if (rank.equals("assistant"))
			return  50000 + (double)(Math.random() * 30001);
		else if (rank.equals("associate"))
			return 60000 + (double)(Math.random() * 50001);
		else
			return 75000 + (double)(Math.random() * 55001); 
}
}
