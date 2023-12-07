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
public class Persewaan {
    //atribut
    String nama,kasir,merk,tanggal,alamat,inputuser,hasil;
    private String password;
    int harga,durasi,denda,jumlah;
    //method
    public Persewaan (){
        password="2218018";
        harga=5000;
        denda=50000;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }
    String passcocok(){
        if(password.compareTo(inputuser)==0){
            hasil="Data Anda Telah Ditambahkan Ke dalam tabel";
        }
        else{
            hasil="Password Salah!!";
        }
        return hasil;
    }
    String nama(){
        return nama;}
    int harga(){
        return harga;}
    String merk(){
        return merk;}
    int durasi(){
        return durasi;}
    String tanggal(){
        return tanggal;}
    String alamat(){
        return alamat; }
    int jumlah(){
        return jumlah;
    }
    int total(){
        int tot;
        tot=harga*durasi;
        return tot;
    }
     int total(int denda){
        int tot;
        tot=total()+denda;
        return tot;
    }
    int denda(){
        return denda;
    }
    int denda(int jumlah) {
        int jum;
        jum=jumlah*denda;
        return jum; 
    }
   

    void nama(String nama){
        this.nama = nama;
    }
    void alamat(String alamat){
        this.alamat = alamat;
    }
    void merk(String merk){
        this.merk = merk;
    }
    void harga(int harga){
        this.harga = harga;
    }
    void durasi(int durasi){
        this.durasi = durasi;
    }
    void tanggal(String tanggal){
        this.tanggal = tanggal;
    }
    void jumlah (int jumlah){
        this.jumlah=jumlah;
    }
    static class setText {

        public setText() {
        }
    }
}
