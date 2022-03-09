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
public class Lingkaran implements MenghitungBidang{
    double jarijari;

    public double getJarijari() {
        return jarijari;
    }

    public double getPhi() {
        return phi;
    }
    
    double phi=3.14;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double Luas() {
        return phi*jarijari*jarijari;
    }

    @Override
    public double Keliling() {
        return phi*(2*jarijari);
    }
    
}
