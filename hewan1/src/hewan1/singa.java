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
public class singa extends Hewan1 {
    @Override
    void setNama(){
        String singa = "Diablo";
        System.out.println("Nama Singa : "+singa);
    }
    void setSuara(){
        String suara = "Roarrrrr";
        System.out.println("Suara Singa : "+suara);
    }
    void setBerat(){
        double berat = 10.0;
        System.out.println("Berat Singa : "+berat+" Kg");
    }
}
