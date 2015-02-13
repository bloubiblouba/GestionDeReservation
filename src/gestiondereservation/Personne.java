
package gestiondereservation;
import java.util.ArrayList;

public class Personne {
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    
    public Personne (String n, String pm, String adr, String t)
    {
        nom = n;
        prenom = pm;
        adresse = adr;
        tel=t;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
}
