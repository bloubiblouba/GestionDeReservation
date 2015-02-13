

package gestiondereservation;
import java.util.ArrayList;
import java.util.Date;

public class GestionDeReservation {
    
private ArrayList<Personne>TabPers;

//Constructeur de main
public GestionDeReservation ()
{
    //Tableau qui stock les personnes
    TabPers = new ArrayList();

} 

public void creerCompte()
{
    //Saisie des infos de la personne
    System.out.println("Quelle est votre nom");
    String nom = Clavier.lireString();
    System.out.println("Quelle est votre prénom ?");
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
    
    System.out.println("Votre compte a été crée avec succès");
    
    
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

            }
}
    public static void main(String[] args) {
        GestionDeReservation g = new GestionDeReservation ();
        g.menu();
    }
    
}
