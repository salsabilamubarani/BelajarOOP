/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajaroop;

/**
 *
 * @author Salsabila
 */
public class mainClass extends overloadingMethod {
    public static void main(String[] args) {
        overloadingMethod ovm = new overloadingMethod();
        System.out.println(ovm.hitung(1.5, 2.5));
        System.out.println(ovm.hitung(5, 5));
    }
    
    @Override
    double hitung (double nilai1, double nilai2){
        return nilai1 + nilai2;
    }
}
