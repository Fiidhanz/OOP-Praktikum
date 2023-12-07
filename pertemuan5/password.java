/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author ASUS
 */
public class password {
    String username,inputuser,hasil;
    private String password;
    
    public password (){
        password="ITN-Malang";
    }
    
    public void setusername (String username){
        this.username=username;
    }

    public void setInputuser(String inputuser) {
        this.inputuser = inputuser;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     String passcocok(){
        if(password.compareTo(inputuser)==0){
            hasil="LOGIN BERHASIL!!";
        }
        else{
            hasil="LOGIN GAGAL!!";
        }
        return hasil;
    }
    
}
