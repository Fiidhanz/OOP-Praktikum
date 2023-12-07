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
public class volume_tabung {
     public static void main (String[]args){
        tabung hasil = new tabung();
        hasil.r=20;hasil.t=15;
        System.out.println("jari jari : "+hasil.r);
        System.out.println("tinggi : "+hasil.t);
        System.out.println("volume : "+hasil.volume());
    }
}
