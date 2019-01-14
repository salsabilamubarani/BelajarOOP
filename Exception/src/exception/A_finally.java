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
public class A_finally {
   public static void main(String[] args) {
        try
        {
            int a = 1/0;
        }
        catch (Exception e)
        {
            System.out.println("ada kesalahan yang muncul");
        }
        finally
        {
            System.out.println("terima kasih telah menjalankan program");
        }
    }
}
