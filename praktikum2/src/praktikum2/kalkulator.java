/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

class kalkulator implements Operasi {
    int bil1;
    int bil2;

    @Override
    public double penjumlahan(int bil1, int bil2) {
        return bil1 + bil2;
    }

    @Override
    public double pengurangan(int bil1, int bil2) {
        return bil1 - bil2;
    }

    @Override
    public double perkalian(int bil1, int bil2) {
        return bil1 * bil2;
    }

    @Override
    public double pembagian(int bil1, int bil2) {
        return bil1 / bil2;
    }
}