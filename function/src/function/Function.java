/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author Salsabila
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void luas_segitiga(int a, int t) {
        double hasil = 0.5 * a * t;
        System.out.print("Luas segitiga adalah " + hasil);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        luas_segitiga(10, 5);
    }
    
}
