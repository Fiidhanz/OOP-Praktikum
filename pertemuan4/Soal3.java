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
public class Soal3 extends Luas_lingkaran {
        //atribut
      double r,jarak;
    //method
    double banyak(){
    double hsl;
        hsl=jarak/keliling();
        return hsl;
}
    //konstruktor
   public Soal3(){
        this.r=10;
        this.jarak=900000;
    }
}
