/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

/**
 *
 * @author Salsabila
 */
public class Departemen extends Karyawan { 
  
    private String alamat;
    private String jabatan;
    
    public Departemen(String nama, int gaji, String alamat, String jabatan) {
        
        super(nama, gaji);     
        this.alamat = alamat;
        this.jabatan = jabatan;
    }
   
    public void info()
    {
        super.info1();
        System.out.println("Alamat  : " +this.alamat);
        System.out.println("Jabatan : " +this.jabatan);
    }
}