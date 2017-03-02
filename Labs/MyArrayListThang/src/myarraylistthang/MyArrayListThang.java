/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myarraylistthang;

/**
 *
 * @author alan
 */
public class MyArrayListThang {

   public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList();

        for (int i = 0; i < 15; i++) {
            list.add(43 + i);
        }
        
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.add(0, 10);
        
        display(list);
        
        //list.add(4);  // overfills!
    }

    private static void display(MyArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }
    }  
    
}

