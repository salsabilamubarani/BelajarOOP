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
public class Perempuan extends Manusia {
    //add constructor
    public Perempuan (double TB)
    {
        super(TB);
    }
    //Override
    public double HtgBBI()
    {
        return (super.getTB() - 100) * 0.8;
    }
}
