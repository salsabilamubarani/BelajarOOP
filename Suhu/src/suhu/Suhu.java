/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

/**
 *
 * @author Salsabila
 */
import java.util.Scanner;
public class Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner (System.in);
    int celcius;
    float reamur,fahrenhait,kelvin;
    
    System.out.println("---------------------------");
    System.out.print("Masukan suhu celcius: ");
    celcius = input.nextInt();
    System.out.println("---------------------------");
    
    reamur = 4f/5f*celcius;
    fahrenhait = 9f/5f*celcius+32f;
    kelvin = celcius +273;
    
    System.out.println("reamur              : " +reamur);
    System.out.println("fahrenhait          : " + fahrenhait);
    System.out.println("kelvin              : " +kelvin);
    System.out.println("---------------------------");
    }  
}