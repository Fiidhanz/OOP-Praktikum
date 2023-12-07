/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

/**
 *
 * @author ASUS
 */
public class Luas_lingkaran {
   //atribut
    double r;
    //method
    double luas(){
        double hsl;
        hsl=(3.14)*r*r;
        return hsl;
    }
    double keliling(){
        double hsl;
        hsl=2*(3.14)*r;
        return hsl;
    }
    //konstruktor
   public Luas_lingkaran(){
        this.r=10;
    }
}
