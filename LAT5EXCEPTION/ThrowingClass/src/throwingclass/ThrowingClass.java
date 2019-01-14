/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwingclass;

/**
 *
 * @author ASUS
 */

class ThrowsDemo {
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ThrowingClass.myMethod();
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
    
}

class ThrowingClass {
    static void myMethod() 
        throws ClassNotFoundException{
        throw new ClassNotFoundException("just a demo");
    }
}


