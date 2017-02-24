/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;
import java.util.Scanner;

/**
 *
 * @author David Gordon Plouse
 */
public class C11N10 {
    
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		MyStack stack = new MyStack();

		
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(input.next());	
		}

		
		System.out.println("Stack: " + stack.toString());
	}
}