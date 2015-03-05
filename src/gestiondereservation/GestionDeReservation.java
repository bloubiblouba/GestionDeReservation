package gestiondereservation;
import java.util.ArrayList;
import java.util.Date;

public class GestionDeReservation {
    
private ArrayList<Personne>TabPers;
private ArrayList<Client>TabClient;
private Client admin;
//Constructeur de main
public GestionDeReservation ()
{
    //Tableau qui stocke les personnes
    TabPers = new ArrayList();
    TabClient = new ArrayList();
    
    admin = new Client ("Tartampion", "Patapouf", "0666666666", "01","Champs Elysées", "Paris", "75016", "admin", "admin");
    TabClient.add(admin);
}




public Personne CreerPersonne (String n, String pm, String t, String nr, String nomr, String v, String c){
        Personne p;
        p = new Personne (n, pm, t, nr, nomr, v, c);
        TabPers.add(p);
        return p;
    }
    public Client CreerClient (String n, String pm, String t, String nr, String nomr, String v, String c, String log, String mdp){
        Client cli;
        cli = new Client (n, pm, t, nr, nomr, v, c, log, mdp);
        TabClient.add(cli);
        return cli;
    }

        public ArrayList<Personne> rechercherPersonne (String p)
    {
       
        ArrayList<Personne> listepers;
        listepers = new ArrayList();
        if (!TabPers.isEmpty()){
            for (int i = 0; i<TabPers.size();i++)
            {
                if (TabPers.get(i).getNom().equalsIgnoreCase(p) && TabPers.get(i).getPrenom().equalsIgnoreCase(p) )
                {
                    listepers.add(TabPers.get(i));
                }
                }
            }
        return listepers;
    }
        
        public int testPersonne (String n, String p)
    {
        int t = 0;
    
        if (!TabClient.isEmpty()){
            for (int i = 0; i<TabClient.size();i++)
            {
                if (TabClient.get(i).getNom().equalsIgnoreCase(n) && TabClient.get(i).getPrenom().equalsIgnoreCase(p) )
                {
                    t = 1;
                    
                }
                }
            }
        return t;
    }
        
        public int testLogin (String l, String p)
    {
        int t = 0;
    
        if (!TabClient.isEmpty()){
            for (int i = 0; i<TabClient.size();i++)
            {
                if (TabClient.get(i).getLogin().equalsIgnoreCase(l) && TabClient.get(i).getMdp().equalsIgnoreCase(p) )
                {
                    t = 1;
                    System.out.println(TabClient.get(i).getLogin());
                }
                
                }
            }
        return t;
    }
        
    
    public static void main(String[] args) {
    }
    
}
