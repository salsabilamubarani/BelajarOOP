/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function2;

import java.util.Scanner;

/**
 *
 * @author Salsabila
 */
public class Function2 {

    /**
     * @param args the command line arguments
     */
    static int luas_trapesium(int a, int b, int t) {
        // Return an expression based on two arguments (variables).
        int hasil = (int) ((a+b)*t/2);
        return hasil;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b,t;
        System.out.print("Masukkan alas atas : ");
        a = input.nextInt();
        System.out.print("Masukkan alas bawah : ");
        b = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = input.nextInt();
        System.out.print("Luas Trapesium adalah " +luas_trapesium(a, b, t));
    }
}
