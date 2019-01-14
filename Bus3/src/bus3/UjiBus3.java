/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus3;

/**
 *
 * @author Salsabila
 */
public class UjiBus3 {
    
    public static void main(String[] args) {
        Bus3 Bus = new Bus3(5);
        Bus.getPenumpang(17);
        Bus.getPenumpang(24);
        Bus.cetakPenumpang();
        
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        Bus.addPenumpang(2); //tambah 2 penumpang
        Bus.cetakPenumpang();
        //penambahan penumpang
        //Bus.addPenumpang(2); //tambah 2 penumpang
        //Bus.cetakPenumpang();
        //penambahan penumpang
        //Bus.addPenumpang(2); //penambahan 2 penumpang
        //Bus.cetakPenumpang();
        Bus.getAverage();
    }
}
