/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOP;

/**
 *
 * @author ASUS
 */
public abstract class Persewaan1 {
    public String merk;
    abstract int total();
   String merk(){
        return merk;}
     void merk(String merk){
        this.merk = merk;
    }
}
