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
public class Laki_laki extends Manusia {
    //add constructor
    public Laki_laki (double TB)
    {
        super(TB);
    }
    //Override
    @Override
    public double HtgBBI()
    {
        return (super.getTB() - 100) * 0.9;  
    }
}
