/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus3;

public class Bus3 {
    public int penumpang;
    public int maxPenumpang;
    private double average;
    //konstruktor kelas bus
    public Bus3(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        } 
        else {
            this.penumpang = temp;
        }
    }
    public void getPenumpang(int password)
    {
        if (password == 24)
        {
            System.out.println("Password benar");
        }
        else
        {
            System.out.println("Password salah");
        }
    }
    
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang = " + penumpang);
        System.out.println("Penumpang maksimum seharusnya = " + maxPenumpang);
    }
    
    public void getAverage(){
    double penumpang,average;
    penumpang = this.penumpang + this.maxPenumpang;
    average = penumpang / 2;
    System.out.println("Rata - rata penumpang Hari ini adalah = " + average);
    }
}
