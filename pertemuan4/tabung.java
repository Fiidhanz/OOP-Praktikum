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
public class tabung extends Luas_lingkaran {
    //atribut
      double t;
    //method
    double volume(){
        double hsl;
        hsl=luas()*t;
        return hsl;
    }
    //konstruktor
   public tabung(){
        this.r=10;
        this.t=20;
    }
}
