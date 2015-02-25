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
}

