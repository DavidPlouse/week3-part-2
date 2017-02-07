/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Administrator
 */
public class SixPointThreeEight {
       public static void main(String[] args) {
 
  for (int i = 1; i <= 100; i++) {
 
   if (i % 10 == 1 && i != 1) {
    System.out.println();
   }
 
   System.out.print(getRandomUpperCaseLetter());
 
  }
 
  for (int i = 1; i <= 100; i++) {
 
   if (i % 10 == 1) {
    System.out.println();
   }
 
   System.out.print(getRandomDigitCharacter());
 
  }
 
 }
 
 /** Generate a random character between ch1 and ch2 */
 public static char getRandomCharacter(char ch1, char ch2) {
  return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
 }
 
 /** Generate a random lowercase letter */
 public static char getRandomLowerCaseLetter() {
  return getRandomCharacter('a', 'z');
 }
 
 /** Generate a random uppercase letter */
 public static char getRandomUpperCaseLetter() {
  return getRandomCharacter('A', 'Z');
 }
 
 /** Generate a random digit character */
 public static char getRandomDigitCharacter() {
  return getRandomCharacter('0', '9');
 }
 
 /** Generate a random character */
 public static char getRandomCharacter() {
  return getRandomCharacter('\u0000', '\uFFFF');
 }
}
