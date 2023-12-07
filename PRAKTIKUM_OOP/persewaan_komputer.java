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
public class persewaan_komputer {
    public static void main(String[]args){
        Persewaan sewa = new Persewaan();
        System.out.println("    Lengkapi Data Penyewa Komputer");
        System.out.println("=======================================");
        sewa.nama("Hafiidh");
        sewa.alamat("Lowok waru");
        sewa.merk("Lenovo");
        sewa.harga(4000);
        sewa.durasi(1);
        sewa.tanggal("10 Oktober 2023");
        System.out.println("Nama Penyewa = "+sewa.nama);
        System.out.println("Alamat = "+sewa.alamat);
        System.out.println("Merk Komputer = "+sewa.merk);
        System.out.println("Durasi sewa = "+sewa.durasi);
        System.out.println("Harga (per jam) = "+sewa.harga);
        System.out.println("Tanggal sewa = "+sewa.tanggal);
        System.out.println("\n");
        System.out.println("========= Data Penyewa =========");
        System.out.println("Nama Penyewa = "+sewa.nama());
        System.out.println("Alamat = "+sewa.alamat());
        System.out.println("Merk Komputer = "+sewa.merk());
        System.out.println("Durasi sewa = "+sewa.durasi());
        System.out.println("Harga (per jam) = "+sewa.harga());
        System.out.println("Tanggal Sewa = "+sewa.tanggal());
        System.out.println("--------------------------------");
        System.out.println("Total Biaya = "+sewa.total());
    }
}
