/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

/**
 *
 * @author janja
 */
public class Administrator {
    private int admID;
    private String ime;
    private String prezime;
    private String username;
    private String lozinka;
    private String email;

    public Administrator(int admID, String ime, String prezime, String username, String lozinka,String email) {
        this.admID = admID;
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.lozinka = lozinka;
        this.email=email;
    }

    public int getAdmID() {
        return admID;
    }

    public void setAdmID(int admID) {
        this.admID = admID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
