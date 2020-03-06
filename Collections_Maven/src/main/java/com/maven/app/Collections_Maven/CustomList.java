package com.maven.app.Collections_Maven;

import java.util.Arrays;

public class CustomList<E> 
{
    
    private int size = 0;   
    
    private int capacity = 10;
     
    
    private Object elements[];
 
    
    public CustomList() {
        elements = new Object[capacity];
    }
 
    
    public void add(E e) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = e;
    }
     
    
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
     
    
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = elements[i];
        int numElts = elements.length - ( i + 1 ) ;
        System.arraycopy( elements, i + 1, elements, i, numElts ) ;
        size--;
        return (E) item;
    }
     
    //Get Size of list
    public int size() {
        return size;
    }
     
    
    public String traverse() 
    {
         StringBuilder stringBulider = new StringBuilder();
         stringBulider.append('[');
         for(int i = 0; i < size ;i++) {
             stringBulider.append(elements[i].toString());
             if(i<size-1){
                 stringBulider.append(",");
             }
         }
         stringBulider.append(']');
         return stringBulider.toString();
    }
     
    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    
    
}
