package gestiondereservation;

public class Aeroport {
    private int numero_aeroport;
    private String nom_aeroport;
    private String adresse;
    private String telephone;
    
public Aeroport (int num_a, String nom_a, String ad, String tel){
    numero_aeroport = num_a;
    nom_aeroport = nom_a;
    adresse = ad;
    telephone = tel;
}

    public int getNumero_aeroport() {
        return numero_aeroport;
    }

    public void setNumero_aeroport(int numero_aeroport) {
        this.numero_aeroport = numero_aeroport;
    }

    public String getNom_aeroport() {
        return nom_aeroport;
    }

    public void setNom_aeroport(String nom_aeroport) {
        this.nom_aeroport = nom_aeroport;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
