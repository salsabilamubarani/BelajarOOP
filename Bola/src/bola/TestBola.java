/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

/**
 *
 * @author Salsabila
 */
public class TestBola {
       public static void main(String[] args) {
       double jarijari = 14;
       
       Bola objekbola = new Bola(21);
       objekbola.showDiameter();
       objekbola.showLuasPermukaan();
       objekbola.showVolume();
       System.out.println("\n---------------------------------------------\n");
       objekbola.setJarijari(jarijari); //manipulasi variabel jarijari yg dibuat
       objekbola.showDiameter();
       objekbola.showLuasPermukaan();
       objekbola.showVolume();
    }
}
