package gestiondereservation;

import java.util.ArrayList;
import java.util.Date;

public class GestionDeReservation {

    private ArrayList<Personne> TabPers;
    private ArrayList<Client> TabClient;
    private ArrayList<Vol> TabVol;
    private Client admin;
//Constructeur de main

    public GestionDeReservation() {
        //Tableau qui stocke les personnes
        TabPers = new ArrayList();
        TabClient = new ArrayList();
        TabVol = new ArrayList();

        admin = new Client("Tartampion", "Patapouf", "0666666666", "01", "Champs Elysées", "Paris", "75016", "admin", "admin");
        TabClient.add(admin);
    }

    public Personne CreerPersonne(String n, String pm, String t, String nr, String nomr, String v, String c) {
        Personne p;
        p = new Personne(n, pm, t, nr, nomr, v, c);
        TabPers.add(p);
        return p;
    }

    public Client CreerClient(String n, String pm, String t, String nr, String nomr, String v, String c, String log, String mdp) {
        Client cli;
        cli = new Client(n, pm, t, nr, nomr, v, c, log, mdp);
        TabClient.add(cli);
        System.out.println(TabClient.size());
        return cli;
    }
    
     public Vol CreerVol(String nv, Date dd, Date da, int hd, int ha, int px1, int q1, int px2, int q2,Aeroport ori,Aeroport dest ) {
        Vol v;
        v = new Vol(nv, dd, da, hd, ha, px1, q1, px2, q2, ori, dest);
        TabVol.add(v);
        return v;
    }

    public ArrayList<Personne> rechercherPersonne(String p) {

        ArrayList<Personne> listepers;
        listepers = new ArrayList();
        if (!TabPers.isEmpty()) {
            for (int i = 0; i < TabPers.size(); i++) {
                if (TabPers.get(i).getNom().equalsIgnoreCase(p) && TabPers.get(i).getPrenom().equalsIgnoreCase(p)) {
                    listepers.add(TabPers.get(i));
                }
            }
        }
        return listepers;
    }

    public int testPersonne(String n, String p) {
        int t = 0;

        if (!TabClient.isEmpty()) {
            for (int i = 0; i < TabClient.size(); i++) {
                if (TabClient.get(i).getNom().equalsIgnoreCase(n) && TabClient.get(i).getPrenom().equalsIgnoreCase(p)) {
                    t = 1;

                }
            }
        }
        return t;
    }
    
    public String retourneAdmin(){
        String nom = TabClient.get(0).getNom()+" "+TabClient.get(0).getPrenom();
        return nom;
    }
    public String retourneAdmin2(){
        String nom = TabClient.get(1).getLogin()+" "+TabClient.get(1).getMdp();
        return nom;
    }
    
    public int testLogin(String l, String p) {
        int t = 0;

        if (!TabClient.isEmpty()) {
            System.out.println(TabClient.size());
            for (int i = 0; i < TabClient.size(); i++) {
                if (TabClient.get(i).getLogin().equalsIgnoreCase(l) && TabClient.get(i).getMdp().equalsIgnoreCase(p)) {
                    t = 1;
                    
                }

            }
        }
        return t;
    }

    public String retourneNom(String login) {
        String nom = new String();
        if (!TabClient.isEmpty()) {
            for (int i = 0; i < TabClient.size(); i++) {
                if (TabClient.get(i).getLogin().equalsIgnoreCase(login)) {

                    nom = TabClient.get(i).getNom();
                    System.out.println(nom);

                }

            }
        }
        return nom;
    }

    public static void main(String[] args) {
    }

}
