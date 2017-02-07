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
public class FivePointFourSix {
    public static void main(String[] args) {
        String input = "abc";
   
   int b = input.length();
   String reverse = ""; 
     while(b!=0){
        
        reverse += (input.charAt(b-1));
        b--;
        }
        System.out.println(reverse);
    }
}
