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
public class sekretaris extends gaji {
     String Id,nm;
    public sekretaris() {
        GajiPokok = 3300000;
        HrHadir = 15000;
    }
    void nm(String nm){
        this.nm = nm;
    }
    void Id(String Id){
        this.Id = Id;
    }
    String Id(){
        return Id;
    }

    @Override
    int hitGaji() {
        GajiTotal = GajiPokok + (jmlhadir * HrHadir);
        return GajiTotal;
    }

}
