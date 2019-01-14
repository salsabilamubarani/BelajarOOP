/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohoverloading;

/**
 *
 * @author Salsabila
 */
public class PenggunaanOverloading {
    public static void main(String[] args) {
        ContohOverloading co  = new ContohOverloading();        
        co.jumlah(83,32);
        co.jumlah(34,454,432);
        co.jumlah(34.43,34);
        co.jumlah(28,33.23);
    }
}
