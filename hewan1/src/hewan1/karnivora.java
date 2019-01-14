/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hewan1;

/**
 *
 * @author Salsabila
 */
public class karnivora {
    public static void main(String[] args) {
        //cara penulisan objek: (SuperClass) variabel = new (subclass)
        System.out.println("===== HEWAN DEFAULT =====");
        Hewan1 h = new Hewan1();
        h.setNama();
        h.setSuara();
        h.setBerat();
       
        System.out.println("===== HEWAN KUCING =====");
        Hewan1 k = new kucing();
        h.setNama();
        h.setSuara();
        h.setBerat();
        
        System.out.println("===== HEWAN SINGA =====");
        Hewan1 s = new singa();
        h.setNama();
        h.setSuara();
        h.setBerat();
    }
}
