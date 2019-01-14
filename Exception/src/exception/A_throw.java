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
public class A_throw {
    public static void main(String[] args) {
        try
        {
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
    {
    }
    public String toString()
    {
        return "object dengan tipe kelas B";
    }
}

