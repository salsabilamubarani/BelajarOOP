/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

/**
 *
 * @author Salsabila
 */
public class output{
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       kalkulator k = new kalkulator();
       
       System.out.print("Masukkan Bilangan 1 = ");
       int bil1 = input.nextInt();
       System.out.print("Masukkan Bilangan 2 = ");
       int bil2 = input.nextInt();
       
       System.out.println("\n");
       System.out.println("Penjumlahan : "+k.penjumlahan(bil1,bil2));
       System.out.println("Pengurangan : "+k.pengurangan(bil1,bil2));
       System.out.println("Perkalian   : "+k.perkalian(bil1,bil2));
       System.out.println("Pembagian   : "+k.pembagian(bil1,bil2));
   }
}
