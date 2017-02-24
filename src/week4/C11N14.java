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
public class C11N14 {
    
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		
		System.out.print("Enter five integers for list1: ");
		fill(list1);
		System.out.print("Enter five integers for list2: ");
		fill(list2);

		
		ArrayList<Integer> list3 = union(list1, list2);

		
		System.out.print("The combined list is: ");
		for (int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i) + " ");
		}
		System.out.println();
	}

	
	public static ArrayList<Integer> union(
		ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> list3 = list1;
		for (int i = 0; i < list2.size(); i++) {
			list3.add(list2.get(i));
		}
		return list3;
	}	

	
	public static void fill(ArrayList<Integer> list) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			list.add(input.nextInt());
		}
}
}
