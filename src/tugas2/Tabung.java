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
public class Tabung extends Lingkaran implements MenghitungRuang{
    double tinggi;

    public Tabung(double tinggi, double jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }

    @Override
    public double Volume() {
        return super.Luas()*tinggi;
    }

    @Override
    public double LuasPermukaan() {
        return 2*super.Luas() + 2*super.getPhi()*super.getJarijari()*tinggi;
    }
    
    
}
