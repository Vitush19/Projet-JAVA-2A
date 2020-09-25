/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdv_medicaux_sutharsan_ranjit;

import java.util.ArrayList;

/**
 *
 * @author franjit
 */
public class Praticien extends Utilisateurs{
    
    private String ville;
    private int specialite;
    private ArrayList AgendaRDV =new ArrayList();
    
    public Praticien(String prenom, String nom, int num, int datedenaissance, String pseudo, String mdp, int specialite,ArrayList AgendaRDV, String ville){
        
        super(prenom, nom, num, datedenaissance, pseudo, mdp);
        this.specialite = specialite;
        this.AgendaRDV = AgendaRDV;
        this.ville = ville;
    }
    
    public int getNumstelephone(){
        return super.getNum();
    }
            
    public String getPseudo(){
        return super.getIdentifiant();
    }
    
    public String getMdp(){
        return super.getMotdepasse();
    }
    
    public String getName(){
        return super.getNom();
    }
    
    public int getSpecialite(){
        return specialite;
    }
    
    public ArrayList getAgendaRDV(){
        return AgendaRDV;
    }
    
    public void changertype(ArrayList a){
        this.AgendaRDV = a;
    }

    public String getVille() {
        return ville;
    }
    
}
