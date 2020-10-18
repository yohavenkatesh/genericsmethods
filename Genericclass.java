/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;
/**
 *
 * @author ADMIN
 */
import java.util.Scanner;
class sample<T>
{
    T[] value;
    
    public sample(T[] value)
    {
        this.value=value;
    }
    void add(T t)
    {
      System.out.println("Inserting at beginning:");  
      for(int i=(value.length-1);i>0;i--)
      {
          value[i]=value[i-1];
      }
      value[0]=t;
        for (T value1 : value) {
            System.out.println(value1);
        }
   
      System.out.println("Inserting at middle:");
      for(int i=(value.length-1);i>=(4);i--)
      {
          value[i]=value[i-1];
      }
      value[4]=t;
        for (T value1 : value) {
            System.out.println(value1);
        }
    
        System.out.println("Inserting at last:");
        for(int i=(value.length-1);i>=(9);i--)
        {
          value[i]=value[i-1];
        }
      value[9]=t;
        for (T value1 : value) {
            System.out.println(value1);
        }
    }  
    void delete(int a)
    {
        System.out.println("Removing element at specific position:");
        for(int i=(a-1);i<(value.length-1);i++)
        {
            value[i]=value[i+1];
        }
        for (T value1 : value) 
        {
            System.out.println(value1);
        }
    }
    
}
public class Genericclass 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Integer n[]={1,2,3,4,5,6,7,8,9,10};
      sample<Integer> obj=new sample<Integer>(n);
      Scanner o=new Scanner(System.in);
      System.out.println("enter the element to insert->");
      int a=o.nextInt();
      obj.add(a);
      System.out.println("enter the position to be deleted->");
      int b=o.nextInt();
      obj.delete(b);
    }
}