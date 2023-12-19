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
public class datakomputer extends Persewaan1{
    int jumlah,pinjam,stok,denda,harga;
    String jenis,inputuser,password,hasil;
    private String id;
    
    public datakomputer(){
        id="Yupiza2218018";
        password="2218018";
        harga=5000;
        denda=0;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }
    String passcocok(){
        if(id.compareTo(inputuser)==0){
            hasil="Data Komputer ditambahkan pada tabel pemilik ID "+id;
        }
        else{
            hasil="Pemilik tidak diketahui!!";
        }
        return hasil;
    }
    int pinjam(){
        return pinjam;
    }
    int jumlah(){
        return jumlah;
    }
    String id(){
        return id;
    }
    String jenis(){
        return merk();
    }

    @Override
    int total(){
        stok=jumlah-pinjam;
        return stok;
    }  
}
