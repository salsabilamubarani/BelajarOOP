/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biodata;

import java.util.Scanner;

/**
 *
 * @author Salsabila
 */
public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String a,b,c,d,e,f,g;
        System.out.println("------------- DATA DIRI -------------");
        System.out.print("Nama             : ");
        a = input.nextLine();
        System.out.print("NIS              : ");
        b = input.nextLine();
        System.out.print("Tempat Lahir     : ");
        c = input.nextLine();
        System.out.print("Tanggal Lahir    : ");
        d = input.nextLine();
        System.out.print("Jenis Kelamin    : ");
        e = input.nextLine();
        System.out.print("Alamat di Malang : ");
        f = input.nextLine();
        System.out.print("Motto Hidup      : ");
        g = input.nextLine();
        System.out.println("-------------------------------------");
    }
}
