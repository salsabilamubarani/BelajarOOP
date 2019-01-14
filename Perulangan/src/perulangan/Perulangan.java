/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;
import java.util.Scanner;
/**
 *
 * @author Salsabila
 */
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.print("Masukkan Jumlah kebawah : ");
        a = input.nextInt();
        System.out.print("Masukkan Jumlah kesamping : ");
        b = input.nextInt();
        for(int i=1;i<=a;i++){
            for(int n=1;n<=b;n++){
                System.out.print((i*n) + " | ");
            }
            System.out.println();
        }
    }
    
}
