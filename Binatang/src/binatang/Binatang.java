/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binatang;

/**
 *
 * @author Salsabila
 */
public class Binatang {
    public void begerak(){
        System.out.println("Binatang bergerak sesuai kemampuannya");
    }
    public void berkembangBiak(){
        System.out.println("Binatang berkembang biak sesuai kemampuannya");
    }
}

public class Mamalia extends Binatang {
    //overriding method parent class
    public void begerak(){
        System.out.println("Mamalia bergerak sebagian besar dengan kakinya");
    }    
    public void berlari(){
        System.out.println("Sebagian Mamalia dapat berlari");
    }
}

public class PenggunaanOverriding {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Binatang b = new Binatang();
        Mamalia m = new Mamalia();
        Binatang bm = new Mamalia();
        
        b.begerak();
        m.begerak();
        bm.begerak();
        bm.berkembangBiak();
    }
}

