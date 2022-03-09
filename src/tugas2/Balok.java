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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double Volume() {
        return super.Luas()*tinggi;
    }

    @Override
    public double LuasPermukaan() {
        return 2*(super.Luas() + super.Luas(super.getPanjang(), tinggi) + super.getLebar()*tinggi);
    }
    
}
