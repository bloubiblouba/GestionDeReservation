package gestiondereservation;
import java.util.Date;

public class Passager extends Personne {
    private String numero_passeport;
    private Date date_validite;
    private String sexe;
    
public Passager (String n, String p, String ad, String tel, String num_passeport, Date date_val, String sx){
    super (n, p, ad, tel);
    numero_passeport = num_passeport;
    date_validite = date_val;
    sexe = sx;
    }

    public String getNumero_passeport() {
        return numero_passeport;
    }

    public void setNumero_passeport(String numero_passeport) {
        this.numero_passeport = numero_passeport;
    }

    public Date getDate_validite() {
        return date_validite;
    }

    public void setDate_validite(Date date_validite) {
        this.date_validite = date_validite;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    
}
