/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdv_medicaux_sutharsan_ranjit;

/**
 *
 * @author franjit
 */
public class Patient extends Utilisateurs{
    
    private int social;
    
    public Patient(String prenom, String nom, int num, int datedenaissance, String pseudo, String mdp, int social){
        
       super(prenom, nom, num, datedenaissance, pseudo, mdp);
       this.social = social;
    }
    
    public String getPseudo(){
        return super.getIdentifiant();
    }
    
    public String getMdp(){
        return super.getMotdepasse();
    }
    public int getSocial(){
        return social;
    }
    
    public String getNaming(){
        return super.getNom();
    }
    
    public int getNumsocial(){
        return super.getNum();
    }
}

