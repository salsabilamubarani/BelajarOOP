/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasPraktikum1;

/**
 *
 * @author Salsabila
 */
public abstract class Manusia {
        //deklarasi variabel
        public double TinggiBadan;
        //add constructor
        public Manusia (double TB)
        {
            TinggiBadan = TB;
        }
        //add getter
        public double getTB()
        {
            return TinggiBadan;
        }
        //add method htgBBI()
        public abstract double HtgBBI();
}
