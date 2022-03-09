/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ACER
 */
public class PersegiPanjang implements MenghitungBidang{

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double Luas() {
        return panjang*lebar;
    }

    @Override
    public double Keliling() {
        return 2*(panjang+lebar);
    }
    
    public double Luas(double a, double b){
        return a*b;
    }
}
