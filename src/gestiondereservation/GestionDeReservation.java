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

public void creerCompte()
{
    //Saisie des infos de la personne
    System.out.println("Quel est votre nom");
    String nom = Clavier.lireString();
    System.out.println("Quel est votre prénom ?");
    String prenom = Clavier.lireString();
    System.out.println("Quelle est votre adresse ?");
    String adresse = Clavier.lireString();
    System.out.println("Quel est votre numero de téléphone ?");
    String telephone = Clavier.lireString();

    
    //Verifie que le mot de passe n'est pas nul et le deuxieme saisi soit le meme que le premier
    String login;
    String mdp;
    String mdp2;
    int i=0;
    do{
        if(i!=0)
        System.out.println("login ou mot de passe non saisi ou les deux mots de passes ne correspondent pas \n \n");

            System.out.println("login ou mot de passe non saisi ou les deux mots de passe ne correspondent pas \n \n");

        System.out.println("Choisir un nom de login");
        login = Clavier.lireString();
        System.out.println("Choisir un mot de passe");
        mdp = Clavier.lireString();
        System.out.println("Repetez votre mot de passe");
        mdp2 = Clavier.lireString();
        i++; 
    }while(login.isEmpty()||mdp.isEmpty()||!mdp.equalsIgnoreCase(mdp2));
    
    Personne a = new Client(nom, prenom,adresse, telephone,login,mdp);
    TabPers.add(a);
    
    System.out.println("Votre compte a été créé avec succès");
    
    
}

public void creerVol()
{
    Date da;
    int a, m, j;
    
    //Saisie des informations d'un vol
    System.out.println("Quel est le numero de vol ?");
    String numero = Clavier.lireString();

    do{    
        System.out.println("Quelle est la date de départ du vol ?");
        System.out.println("Veuillez saisir l'année en format AAAA");
        a = Clavier.lireInt();
        System.out.println("Saisir le mois en format en format numérique");
        m = Clavier.lireInt();
        System.out.println("Saisir le jour");
        j = Clavier.lireInt();
        System.out.println("Saisir l'heure de départ en format HH");
        int h = Clavier.lireInt();
        System.out.println("Saisir les minutes  en format MM");
        int min= Clavier.lireInt();
        da = new Date(a-1900,m-1,j,h,min);
        
        System.out.println("Quelle est la date de départ du vol ?");
        System.out.println("Veuillez saisir l'année en format AAAA");
        a = Clavier.lireInt();
        System.out.println("Saisir le mois en format en format numérique");
        m = Clavier.lireInt();
        System.out.println("Saisir le jour");
        j = Clavier.lireInt();
        System.out.println("Saisir l'heure de départ en format HH");
        int h = Clavier.lireInt();
        System.out.println("Saisir les minutes  en format MM");
        int min= Clavier.lireInt();
        da = new Date(a-1900,m-1,j,h,min);
    }
    while (da.compareTo(new Date())<=0);
    
    

}

   public void menu()
    {
    int r;
    System.out.println("1 pour creer un compte");
 
    r = Clavier.lireInt();
    switch (r)
    {
        case 1 : creerCompte() ;
            menu() ;
            break;
        case 2 : creerVol();
            menu();
            break;
            }
}
    public static void main(String[] args) {
        GestionDeReservation g = new GestionDeReservation ();
        g.menu();
    }
    
}
