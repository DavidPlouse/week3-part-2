/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class C11N12 {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		ArrayList<Double> list = new ArrayList<Double>();

		
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}

		
		System.out.println("Sum of list: " + sum(list));
	}

	
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
}
}