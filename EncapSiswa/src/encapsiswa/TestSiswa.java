/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsiswa;

/**
 *
 * @author Salsabila
 */
public class TestSiswa {
    
     public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Salsabila Siti");
        siswa.setAbsen(36);
        siswa.setAddress("Jl Danau Tambingan");
        
        System.out.println("Name : " + siswa.getName());
        System.out.println("Absen : " + siswa.getAbsen());
        System.out.println("Address : " + siswa.getAddress());
    }
}
