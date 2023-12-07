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
public class datapenyewa extends Persewaan implements waktu{
       String nm,nohp,inputuser,almt;
       private String password;
       int denda;
       double waktu,jamsewa,durasi;
       
    public datapenyewa (){
        password="2218018";
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }
    
    String passcocok(){
        if(password.compareTo(inputuser)==0){
            hasil="Data telah ditambahkan";
        }
        else{
            hasil="Password Salah!!";
        }
        return hasil;
    }
    
    String nm(){
        return nama;
    }
    
    String nohp(){
        return nohp;
    }
    String almt(){
        return alamat;
        
    }
    double jamsewa(){
        return jamsewa;
        
    }
      double lama(){
        return durasi;    
    }

    @Override
    int denda(int jumlah) {
        return super.denda(jumlah); 
    }

    @Override
    public double waktu() {
        waktu = jamsewa+durasi;
        return waktu;
    }
    
      
}
