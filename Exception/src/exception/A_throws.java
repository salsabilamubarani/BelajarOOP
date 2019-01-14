/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Salsabila
 */
public class A_throws {
    static void myMethod() throws ClassNotFoundException { throw new ClassNotFoundException ("just a demo");
}

class ThrowsDemo {

public static void main(String args[]) {

try {

A_throws.myMethod();

} catch (ClassNotFoundException e) {

System.out.println(e);

}

}

}
}
