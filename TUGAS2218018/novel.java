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
public class novel {
    public static void main (String[]args){
BUKU BukuNovel = new BUKU();
BukuNovel.tinggi=3;
BukuNovel.lebar=10;
BukuNovel.panjang=5;
System.out.println("Tinggi buku : "+BukuNovel.tinggi);
System.out.println("Lebar buku : "+BukuNovel.lebar);
System.out.println("Panjang buku : "+BukuNovel.panjang);
System.out.println("Jenis buku : "+BukuNovel.jenis);
System.out.println("Bahan buku : "+BukuNovel.bahan);
System.out.println("Warna buku : "+BukuNovel.Warna);
}
}