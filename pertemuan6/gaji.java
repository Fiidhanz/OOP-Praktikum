/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
abstract public class gaji {
    int GajiPokok;
    int HrLembur;
    int HrHadir;
    int GajiTotal;
    int jmlhadir,jmllembur;
    String Nama;

    public gaji() {
        GajiPokok = 3000000;
        HrLembur = 50000;
        HrHadir = 15000;
    }
    public void Jmlhadir(int jmlhadir) {
        this.jmlhadir = jmlhadir;
    }
    public void Jmllembur(int jmllembur) {
        this.jmllembur = jmllembur;
    }
    abstract int hitGaji();
    
    void Nama(String Nama){
        this.Nama = Nama;
    }
}
