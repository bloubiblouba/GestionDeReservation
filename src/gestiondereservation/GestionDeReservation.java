package gestiondereservation;
import java.util.ArrayList;
import java.util.Date;

public class GestionDeReservation {
    
private ArrayList<Personne>TabPers;

//Constructeur de main
public GestionDeReservation ()
{
    //Tableau qui stocke les personnes
    TabPers = new ArrayList();

} 
    public Personne CreerPersonne (String n, String pm, String t, String nr, String nomr, String v, String c){
        Personne p;
        p = new Personne (n, pm, t, nr, nomr, v, c);
        TabPers.add(p);
        return p;
    }

    public static void main(String[] args) {
    }
    
}
