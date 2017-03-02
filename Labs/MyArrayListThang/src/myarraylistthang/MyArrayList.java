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
public class MyArrayList<T> {

    final static int INITIAL_CAPACITY = 10;
    Object[] list;
    Object[] newlist;
    int last;
    int capacity;

    MyArrayList() {
        list = new Object[10];
        last = -1;
        capacity = INITIAL_CAPACITY;
    }

    T get(int i) {
        return (T) list[i];
    }

    void add(T nuOne) {
        if (size() >= capacity) {
            doubleCapacity();
        }
        
        list[++last] = nuOne;  // you know there is space now!
    }
    
    void add(T nuOne, int i) {
        if (size() >= capacity) {
            doubleCapacity();
        }
        
        capacity = list.length + 1;
        newlist = new Object[capacity];
        
        for (int j = 0; j < i; j++) {
            newlist[j] = list[j];
        }
        
        for (int j = i; j < capacity; j++) {
            if (j == i) {
                newlist[j] = nuOne;
            } else {
                newlist[j] = list[j-1];
            }
        }
        
        list = newlist;
        
        last = last +1;
       
    }
    
    void remove(int i) {        
        capacity = list.length - 1;
        
        for (int j = i; j < capacity; j++) {
            if (j == list.length) {
                list[j] = null;
            } else {
                list[j] = list[j+1];
            }
        }
        
        last = last -1;
    }

    public int size() {
        return last + 1;
    }

    private void doubleCapacity() {
        capacity = list.length * 2;
        newlist = new Object[capacity];
        
        for (int i = 0; i < list.length; i++) {
            newlist[i] = list[i];
        }
        
        list = newlist;
        
    }
}
