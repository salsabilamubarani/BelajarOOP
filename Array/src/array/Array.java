/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Salsabila
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [] nama_barang;
        nama_barang = new String[4];
        nama_barang[0]="Rinso Deterjen";
        nama_barang[1]="Sabun Kodok";
        nama_barang[2]="Shampoo Nuvo";
        nama_barang[3]="Sikat Gigi";
        
        int harga []={2000,1000,3000,5000};
        
        for(int i=0;i<nama_barang.length;i++){
            System.out.println("nama barang " + nama_barang[i]+", harga " + harga[i]);
        }
    }
    
}
