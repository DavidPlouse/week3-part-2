/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SevenPointTwelve {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int[] numbers = new int[10];
 
  System.out.print("Enter 10 integers:");
 
  for (int i = 0; i < numbers.length; i++) {
   numbers[i] = input.nextInt();
  }
          int[] reverseNumbers = reverse(numbers);
           
        //Printing both the original array and returned array.
        //This is a good demonstration of what happen when arrays are passed to function.
        //They are both pointing to the same array after the function call.
    
        System.out.println("Printing the original array:");
  for (int i = 0; i < numbers.length; i++) {
   System.out.print(numbers[i] + " "); 
  }
   
  System.out.println();
        System.out.println("Printing the returned array:");
  for (int i = 0; i < reverseNumbers.length; i++) {
   System.out.print(reverseNumbers[i] + " "); 
  }
 }
 
 public static int[] reverse(int[] list) {
   
  int temp;
 
  for (int i = 0, j = list.length -1; i < list.length/2; i++, j--) {
   temp = list[j];
   list[j] = list[i];
   list[i] = temp;
  }
 
  return list;
 }
}