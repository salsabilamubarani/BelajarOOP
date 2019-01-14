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
public class A_try {
    public static void main(String[] args) {
      try{
          int a = 1/0; //berpotensi untuk menimbulkan
          //kesalahan yaitu pembagian bilangan 0
          System.out.println("Perintah Selanjutnya");
      }
      catch (Exception kesalahan) {
          System.err.println(kesalahan);
      }
    }   
}
