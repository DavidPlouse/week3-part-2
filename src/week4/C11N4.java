/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class C11N4 {
    public static Integer max(ArrayList<Integer> list) {
       if(list.size() > 0) {
           int max = list.get(0).intValue();
           for(int i=1; i<list.size(); i++) {
               if(list.get(i)>max) {
                   max = list.get(i);
               }
           }
           return max;
       } 
        return null;
    }
    
    public static void main(String[] args) {
        int[] array = {5,6,4};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(array));
        System.out.println("Max is " + max(list));
        
    }
}
