/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handphone2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Salsabila
 */
public class Handphone2 {
    //deklarasi
        private String merk, tipe, warna;
        private double harga;
    //setter
        public void setMerk(String merk)
        {
            this.merk = merk;
        }
        public void setTipe(String tipe){
            this.tipe=tipe;
        }
        public void setWarna(String colour)
        {
            warna=colour;
        }
        public void setHarga(double harga){
            this.harga=harga;
        }
        
        //getter
        public String getMerk()
        {
            return merk;
        }
        public String getTipe()
        {
            return tipe;
        }
        public String getWarna()
        {
            return warna;
        }
        public double getHarga()
        {
            return harga;
        }
        
        //method tambahan
        public double HargaDiskon()
        {
            double diskon = 0.1 * getHarga();
            double total = getHarga() - diskon;
            
            return total;
        }
        public void keterangan()
        {
            System.out.println("Harga HP sesudah diskon (10%) = Rp " + HargaDiskon());
        }
    
 
        public static void main (String [] args) throws Exception
        {
            BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
            //instance of class
            Handphone2 hp = new Handphone2();
            //input
            System.out.print("Masukkan merk handphone : ");
            String merk_hp = br.readLine();
            System.out.print("Masukkan tipe handphone : ");
            String tipe_hp = br.readLine();
            System.out.print("Masukkan warna handphone : ");
            String warna_hp = br.readLine();
            System.out.print("Masukkan harga handphone : ");
            double harga_hp = Double.parseDouble(br.readLine());
            
            hp.setMerk(merk_hp);
            hp.setTipe(tipe_hp);
            hp.setWarna(warna_hp);
            hp.setHarga(harga_hp);
            
            //output
            System.out.println("======================================");
            System.out.println("DAFTAR HARGA PONSEL DAN SPESIFIKASINYA");
            System.out.println("======================================");
            System.out.println("Merk HP = "+hp.getMerk());
            System.out.println("Tipe HP = "+hp.getTipe());
            System.out.println("Warna HP = "+hp.getWarna());
            System.out.println("Harga HP sebelum diskon = Rp "+hp.getHarga());
            hp.keterangan();
        }
}