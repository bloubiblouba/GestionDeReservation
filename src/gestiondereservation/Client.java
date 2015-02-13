/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestiondereservation ;

public class Client extends Personne {
    private int numClient;
    private String login;
    private String mdp;
    public Client (String n, String pm, String adr, String t, String log, String mdp)
    {
        super (n,pm,adr,t);
        //numero client auto incrementant et unique
        numClient ++;
        login = log;
        mdp=mdp;
        
    }

    public int getNumClient() {
        return numClient;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
