/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2218018;

/**
 *
 * @author ASUS
 */
public class BUKU {
    //atribut
    int panjang,lebar,tinggi;
    String Warna,bahan,jenis;
    
   //method
    String baca(){
        return "Dapat mudah dibaca";
    }
    String pinjam(){
        return "Boleh Dipinjam";
    }
    String koleksi(){
        return "Dapat diKoleksi";
    }
    
    //konstruktor
    public BUKU(){
        this.tinggi=2;
        this.panjang=8;
        this.lebar=5;
        this.jenis="edukasi";
        this.bahan="kertas";
        this.Warna="putih";
    }
}


