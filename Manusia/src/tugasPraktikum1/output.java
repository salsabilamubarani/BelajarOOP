/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum1;
import java.util.Scanner;

/**
 *
 * @author Salsabila
 */
public class output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x = 0;
        System.out.println("--------------- BERAT BADAN IDEALKU -----------------");
        System.out.print("\n");
        System.out.print("Masukkan Jumlah User           : ");
        int user = input.nextInt();
        Manusia[] m = new Manusia[user];
        
        do
        {
            System.out.print("\n");
            System.out.println("-----------------------------------------------------");
            System.out.print("\n");
            System.out.println("User "+(x + 1));
            System.out.print("Masukkan Tinggi Badan (cm)     : ");
            double t = input.nextDouble();
            System.out.print("Masukkan Jenis Kelamin (L/P)   : ");
            String jk = input.next();
            
            if (jk.toUpperCase().equals("L"))
            {
                m[x] = new Laki_laki(t);
                System.out.print("Berat Badan Ideal Laki-laki    : "+m[x].HtgBBI());
                System.out.println();
            }
            else if(jk.toUpperCase().equals("P"))
            {
                
                m[x] = new Perempuan(t);
                System.out.print("Berat Badan Ideal Perempuan    : "+m[x].HtgBBI());
                System.out.println();
            }
            else {
                System.out.println("Masukkan dengan Benar");
            }
            
            x++;
        }
        while (x < user);
    }
}
