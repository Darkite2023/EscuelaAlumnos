/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testguialibro;

/**
 *
 * @author Andrey
 */
public class TestGuiaLibro {
int counter = 0;
    public static void main(String[] args) {
      
        
        int count =0;
        TestGuiaLibro[] m4a = new TestGuiaLibro[20];
        
        int x =0;
        
        while (x < 9) {
            m4a[x] = new TestGuiaLibro();
            System.out.println(m4a[x].toString());
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;

        }
        System.out.println(count +" "+m4a[1].counter);
        
        
        
    }
    
    public int maybeNew(int index){
        if (index<9) {
         TestGuiaLibro m4 =new TestGuiaLibro();
         m4.counter = m4.counter +1;
         return 1;
        }
        return 0;
    }
    
    
}
