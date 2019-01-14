/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_exception;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas_Exception {
        public static void main (String [] args)
        {
            try{
                Scanner input = new Scanner(System.in);
                    String[] barang;
                    double[] harga, jumlah, total;
                    
            int x = 0;
            double totalhs = 0;
            
            System.out.println("---------------- TOKO JAYA MAKMUR ---------------");
            System.out.print("Masukkan Jumlah Data : ");
            int data = input.nextInt();
            
            barang = new String[data];
            harga = new double[data];
            jumlah = new double[data];
            total = new double[data];
     
            //instance of class
            toko t = new toko();
            if (data <= 0){
                System.out.println("data harus lebih dari 0");
            }
            else{
            do
            {
                System.out.println("-------------------------------------------------");
                System.out.println("Data "+(x + 1));
                //input
                System.out.print("Nama Barang       : ");
                barang[x] = input.next();
                System.out.print("Jumlah Barang     : ");
                jumlah[x] = input.nextDouble();
                System.out.print("Harga Barang      : ");
                harga[x] = input.nextDouble();
                total[x] = harga[x] * jumlah[x];
                x++;
            }
            while (x < data);
            
            //output
            System.out.println("--------------------------------------------------");
            System.out.print("\n");
            System.out.println("+------------------------------------------------+");
            System.out.println("|             N O T A    B E L A N J A           |");
            System.out.println("+------------------------------------------------+");
            System.out.println("|     Barang      | Jumlah |   Harga  | SubTotal |");
            System.out.println("+------------------------------------------------+");
            
            for(x = 0; x < data; x++){
                System.out.println("|      "   + barang[x]+      "     |   "  + jumlah[x] +  "  |   "   +harga[x]+ " |  "  +total[x]+ "  |");        
                totalhs = totalhs + total[x];
            }
            System.out.println("+------------------------------------------------+");
            System.out.println("|            Total                    |  " + totalhs +"  |");
            System.out.println("+------------------------------------------------+");

            }
            }
            catch (Exception e){
                System.out.println("Masukkan dengan benar" + e);
            }   
        }
}
