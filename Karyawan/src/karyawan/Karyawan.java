/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

//nama kelas
public class Karyawan {
    
    private String nama;
    private int gaji;
    
    
    public Karyawan (String nama, int gaji)
    {
        this.nama = nama;
        this.gaji = gaji;
    }
  
    public void info1()
    {
        System.out.println("Nama    : " +this.nama);
        System.out.println("gaji    : "+this.gaji);
    }
}


