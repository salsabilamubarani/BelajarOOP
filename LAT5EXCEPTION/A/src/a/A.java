/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author ASUS
 */
public class A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            throw new B(); //cobalah  ganti baris ini dengan à new B();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class B extends Exception
{
    B()
    //konstruktor
    {
    }
    public String toString()
    {
        return "object dengan tipe kelas B";
    }
}
