/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.io.*;
import java.util.*;
/**
 *
 * @author David Gordon Plouse
 */
public class C12N15 {
    
	public static void main(String[] args) throws Exception {
		// Check if file exists
		File file = new File("C12N15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		try (
			// Create output file
			PrintWriter output = new PrintWriter(file);
		) {
			// Write 100 integers created radomly to file
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 500) + 1));
				output.print(" ");
			}
		}

		// Crate and ArrayList
		ArrayList<Integer> list = new ArrayList<>();

		try(
			// Create input file
			Scanner input = new Scanner(file);
		) {
			// Read the data back from the file
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}

		// Sort array list
		Collections.sort(list);

		// Display data in increasing order
		System.out.print(list.toString());
		System.out.println();
}
}