package gestiondereservation;
import java.util.Date;

public class Vol {
    private String numero_vol;
    private Date date_depart;
    private Date date_arrivee;
    private int heure_depart;
    private int heure_arrivee;
    private int prix_premiere_classe;
    private int quantite_premiere;
    private int prix_seconde_classe;
    private int quantite_seconde;
    
public Vol (String nv, Date dd, Date da, int hd, int ha, int px1, int q1, int px2, int q2){
    numero_vol = nv;
    date_depart = dd;
    date_arrivee = da;
    heure_depart = hd;
    heure_arrivee = ha;
    prix_premiere_classe = px1;
    quantite_premiere = q1;
    prix_seconde_classe = px2;
    quantite_seconde = q2;
}


    public String getNumero_vol() {
        return numero_vol;
    }

    public void setNumero_vol(String numero_vol) {
        this.numero_vol = numero_vol;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_arrivee() {
        return date_arrivee;
    }

    public void setDate_arrivee(Date date_arrivee) {
        this.date_arrivee = date_arrivee;
    }

    public int getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(int heure_depart) {
        this.heure_depart = heure_depart;
    }

    public int getHeure_arrivee() {
        return heure_arrivee;
    }

    public void setHeure_arrivee(int heure_arrivee) {
        this.heure_arrivee = heure_arrivee;
    }

    public int getPrix_premiere_classe() {
        return prix_premiere_classe;
    }

    public void setPrix_premiere_classe(int prix_premiere_classe) {
        this.prix_premiere_classe = prix_premiere_classe;
    }

    public int getQuantite_premiere() {
        return quantite_premiere;
    }

    public void setQuantite_premiere(int quantite_premiere) {
        this.quantite_premiere = quantite_premiere;
    }

    public int getPrix_seconde_classe() {
        return prix_seconde_classe;
    }

    public void setPrix_seconde_classe(int prix_seconde_classe) {
        this.prix_seconde_classe = prix_seconde_classe;
    }

    public int getQuantite_seconde() {
        return quantite_seconde;
    }

    public void setQuantite_seconde(int quantite_seconde) {
        this.quantite_seconde = quantite_seconde;
    }
}
