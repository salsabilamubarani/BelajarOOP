/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handphone;
import java.util.Scanner;
/**
 *
 * @author Salsabila
 */
public class Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.print("Masukkan Angka ke-1 : ");
        a = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        b = input.nextDouble();
        c = a*b;
        System.out.print("hasil dari "+a+" x "+b+" = "+c);
    }
    
}
