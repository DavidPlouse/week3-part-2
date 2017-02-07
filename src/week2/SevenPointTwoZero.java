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
public class SevenPointTwoZero {
      public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int[] numbers = new int[10];
 
  System.out.print("Enter ten numbers:");
 
  for (int i = 0; i < numbers.length; i++) {
   numbers[i] = input.nextInt();
  }
 
  System.out.print("The sorted numbers are:");
 
  selectionSort(numbers);
  for (int i = 0; i < numbers.length; i++) {
   System.out.print(numbers[i] + " ");
  }
 }
 
  
 public static void selectionSort(int[] list) {
  for (int i = list.length-1; i > 0; i--) {
   // Find the max in the list[list.length...1]
   int currentMax = list[i];
   int currentMaxIndex = i;
 
   for (int j = 0; j < i; j++) {
    if (currentMax < list[j]) {
     currentMax = list[j];
     currentMaxIndex = j;
    }
   }
 
   // Swap list[i] with list[currentMaxIndex] if necessary
   if (currentMaxIndex != i) {
    list[currentMaxIndex] = list[i];
    list[i] = currentMax;
   }
  }
 }
}
