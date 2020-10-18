/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericfunction;



/**
 *
 * @author ADMIN
 */

public class Genericfunction 
{
    public static <T extends Comparable<T>> T min(T... elements) {
    T minval = elements[0];
    for (T element : elements) 
    {
        if (element.compareTo(minval)<0) 
        {
            minval= element;
        }
    }
         return minval;

  }
    public static void main(String[] args) {
        // TODO code application logic here
            Integer[] intArray = {10,20,30,40,50};
            //print the lowest value
            System.out.println("The minimum value is ->"+min(intArray));
           
    } 
}
