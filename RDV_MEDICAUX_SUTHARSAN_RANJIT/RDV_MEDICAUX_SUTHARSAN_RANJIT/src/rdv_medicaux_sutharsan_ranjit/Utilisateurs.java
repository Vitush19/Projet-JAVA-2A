/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdv_medicaux_sutharsan_ranjit;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

/**
 *
 * @author vsuthars
 */
public class Utilisateurs{
    
    private String prenom;
    private String nom;
    private int num;
    private int datedenaissance;
    private String identifiant;
    private String motdepasse;
    private ArrayList listpatient =new ArrayList();
    private ArrayList listpraticien =new ArrayList();
    private ArrayList listtamponpatient = new ArrayList();
    private ArrayList listtamponpraticien = new ArrayList();
    private ArrayList listpraticienstock = new ArrayList();
    private ArrayList listpatientstock = new ArrayList();
    private ArrayList listRDV = new ArrayList();
    //private String nomFichier;
    private int a = 0;
    public static int r = 0;    //permet de gérer la méthode stock a revoir
   
    
    public Utilisateurs(String prenom, String nom, int num, int datedenaissance, String identifiant, String motdepasse){
        
        this.prenom = prenom;
        this.nom = nom;
        this.datedenaissance = datedenaissance;
        this.num = num;
        this.identifiant = identifiant;
        this.motdepasse = motdepasse;
    }
        
    
    public void creationPraticien(){    //méthode qui va créer un spécialiste et un généraliste au début
        
        int i = 20180312;
        int j = 20180425;
        int k = 20180212;
        int l = 20181007;
        int m = 20180606;
        int n = 20180829;
        int o = 20181125;
        ArrayList AgendaRDV = new ArrayList();
        ArrayList AgendaRDVbis = new ArrayList();
        ArrayList AgendaRDVter = new ArrayList();
        ArrayList AgendaRDVquad = new ArrayList();
        AgendaRDV.add(j);
        AgendaRDV.add(i);
        AgendaRDVbis.add(j);
        AgendaRDVbis.add(k);
        AgendaRDVter.add(l);
        AgendaRDVter.add(m);
        AgendaRDVter.add(n);
        AgendaRDVquad.add(m);
        AgendaRDVquad.add(n);
        AgendaRDVquad.add(o);
        Praticien praticien1 = new Praticien("Jean","Dupont",0505050505,19621201,"Jean","Kevin",1,AgendaRDV, "Paris");
        listpraticien.add(praticien1);
        Praticien praticien3 = new Praticien("Paul","Eric",0606060606,19621201,"Paul","Kevin",1,AgendaRDVbis, "Paris");
        listpraticien.add(praticien3);
        Praticien praticien4 = new Praticien("Mika","Pierre",123,19621201,"Mika","Kevin",1,AgendaRDVter, "Lyon");
        listpraticien.add(praticien4);
        Praticien praticien2 = new Praticien("Michel","Francois",0707070707,19700623,"Michel","Bertrand",2,AgendaRDVquad, "Lyon");
        listpraticien.add(praticien2);
        Patient patient1 = new Patient("Fabio","Ranjit",0303030303,19980118,"Fabio","Ranjit", 1234);
        listpatient.add(patient1);
        Date date = new Date("Francois",0606060606,"Fabio",1234,20180316);
        listRDV.add(date);
    }

    public int inscription(int indication, String nom, String prenom,int datenaissance,int numerotel,String id, String mdp, int numsocial, int spec, String ville){  //méthode d'inscription
        
        //int i = 0;
        //boolean b = true;
        //String prenom1;
        //String nom1;
        //String ident;
        //String motdp;
        //int date;
        //int numero;
        //int social;
        int reussite = 2;
        //int specialite;
        ArrayList AgendaRDV = new ArrayList();
        //i = indication;
        //prenom1 = prenom;
        //nom1 = nom;
        //date = datenaissance;
        //numero = numerotel;
        //ident = id;
        //motdp = mdp;
        //social = numsocial;
        //specialite = spec;
        
        if(indication==1){
            reussite =1;
            Iterator<Patient> it = listpatient.iterator();  //création d'un itérateur
            while(it.hasNext()){
                Patient a = it.next();
                if(a.getPseudo().equals(id)==true){  //si un compte a le meme pseudo 
                    reussite = 0;
                }
            }
            Patient pat = new Patient(prenom,nom,numerotel,datenaissance,id, mdp,numsocial); //on crée le patient avec les données demandées
            listpatient.add(pat);   //on l'ajoute à la liste
            listtamponpatient.add(pat); //on l'ajoute à une liste tampon qui nous permettra de savoir les détails de l'usager connecté
            if(reussite == 1){
                JOptionPane.showMessageDialog(null, "Inscription réussie", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Pseudo déjà utilisé", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);             //on indique de recommencer
            }
        }        
        else{
            reussite = 1;
            Iterator<Praticien> its = listpraticien.iterator();  //création d'un itérateur
            while(its.hasNext()){
                Praticien a = its.next();
                if(a.getPseudo().equals(id)==true){  //si un compte a le meme pseudo 
                   reussite = 0;
                }
            }
            Praticien prat = new Praticien(prenom,nom,numerotel,datenaissance,id,mdp,spec, AgendaRDV, ville); // on crée le praticien avec les données demandées
            listpraticien.add(prat);   //on l'ajoute à la liste
            listtamponpraticien.add(prat); //on l'ajoute à une liste tampon qui nous permettra de savoir les détails de l'usager connecté
            if(reussite == 1){
                JOptionPane.showMessageDialog(null, "Inscription réussie", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Pseudo déja pris", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);               //on indique de recommencer
            }
        }
        return reussite;
    }

    public int connexion(int indicPraticien, String id,String mdp){    //méthode de connexion
        
        int i;
        int reussite = 0;
        boolean connexionok = false;
        i = indicPraticien;
        if(i==1){   //on va dans l'arraylist du patient
            Iterator<Patient> it = listpatient.iterator();  //création d'un itérateur
            while(it.hasNext()){
                Patient a = it.next();
                a.getPseudo();
                if(a.getPseudo().equals(id)==true){
                    if(a.getMdp().equals(mdp)==true){
                        connexionok = true; //connexionok devient true si et seulement si l'usager entre le bon pseudo et mdp
                        listtamponpatient.add(a);   //on l'ajoute à une liste tampon qui nous permettra de savoir les détails de l'usager connecté
                    }
                }
            }
            if(connexionok == false){
                JOptionPane.showMessageDialog(null,"Erreur de connexion!", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{   // on va dans l'arraylist du praticien
            Iterator<Praticien> its = listpraticien.iterator();  //création d'un itérateur
            while(its.hasNext()){
                Praticien a = its.next();
                a.getPseudo();
                if(a.getPseudo().equals(id)==true){
                    if(a.getMdp().equals(mdp)==true){
                        connexionok = true; //connexionok devient true si et seulement si l'usager entre le bon pseudo et mdp
                        listtamponpraticien.add(a); //on l'ajoute à une liste tampon qui nous permettra de savoir les détails de l'usager connecté
                    }
                }
            }
             if(connexionok == false){
             JOptionPane.showMessageDialog(null, "Erreur de connexion !", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }

        if(connexionok == true){
             JOptionPane.showMessageDialog(null, "Connexion réussie !", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
             reussite = 1;  //permet de savoir si on peut passer à la fenetre suivante ou non
        }
        return reussite;
    }

    public void consulterPraticien(int valeur, JList liste){   //méthode pour consulter les praticiens
       
       DefaultListModel model = new DefaultListModel(); 
       Iterator<Praticien> it = listpraticien.iterator();  //création d'un itérateur
       while(it.hasNext()){
           Praticien pn = it.next();
           if(valeur == pn.getSpecialite())      //selon la spécialité on va afficher ou non le praticien
               model.addElement("Dr."+pn.getName());
        }
       liste.setModel(model);
    }
    
    public void consulterPraticienVille(int valeur, JList liste, String ville){   //méthode pour consulter les praticiens
       
        int check = 1;
       DefaultListModel model = new DefaultListModel(); 
       Iterator<Praticien> it = listpraticien.iterator();  //création d'un itérateur
       while(it.hasNext()){
           Praticien pn = it.next();
           if(valeur == pn.getSpecialite())      //selon la spécialité on va afficher ou non le praticien
               if(ville.equals(pn.getVille())){
                   model.addElement("Dr."+pn.getName());
                   check = 0;
               }       
        }
       if(check == 1){
           JOptionPane.showMessageDialog(null, "Il n'y pas de praticien dans cette ville", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
       }
       liste.setModel(model);
    }
    
    public void lookrdv(int choix, String nom, JList liste){
            int u=1;
            ArrayList listb = new ArrayList();
            int f =1;
            int lock = 0;
            DefaultListModel model = new DefaultListModel();
            Iterator<Praticien> ite= listpraticien.iterator();  //on boucle sur la liste des praticien pour afficher les praticien dans un premier temps
            while(ite.hasNext()){
                Praticien z = ite.next();
                if(choix==z.getSpecialite()){
                    model.addElement(u+": Dr."+z.getName());
                }
                u++;
            }
            liste.setModel(model);
            Iterator<Praticien> iter= listpraticien.iterator();
            while(iter.hasNext()){
                Praticien ze = iter.next();
                if(nom.equals(ze.getName())==true)  //si ce nom correspond bien à un nom qui appartient à celui de la liste on continue
                    lock = 1;
                if(nom.equals("")==true)
                    lock = 1;
            }
            if(lock == 0){
                JOptionPane.showMessageDialog(null, "Ce praticien n'existe pas", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
            }
            DefaultListModel model1 = new DefaultListModel();
            Iterator<Praticien> ites = listpraticien.iterator();    //on boucle sur la liste des praticien pour afficher les praticien dans un premier temps
            while(ites.hasNext()){
                Praticien be = ites.next();
                if(nom.equals(be.getName())==true){ //on accede au praticien en question
                   listb = be.getAgendaRDV();
                   if(listb.isEmpty()==true){   //si l'arraylist des rdv du praticien est vide on l'indique
                       JOptionPane.showMessageDialog(null, "Désolé, ce praticien n'a pas ou n'a plus de RDV", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
                   }
                   else{
                    Iterator<Integer> loel = listb.iterator();
                        while(loel.hasNext()){
                            model1.addElement(f+loel.next());
                            f++;
                        }
                        liste.setModel(model1);
                   }
                }
            }
    }
    
    public void prendrerdv(int choix, String nom, JList liste, int o){
        
        ArrayList listb = new ArrayList();
        int t=1;
        int u=1;
        int y;
        int plock = 0;
        if(nom.length()==0){
            JOptionPane.showMessageDialog(null, "Veuillez saisir un nom pour votre praticien", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
        }
        else{
            DefaultListModel model = new DefaultListModel();
            Iterator<Praticien> it= listpraticien.iterator();   //on boucle sur la liste des praticien pour afficher les praticien dans un premier temps
            while(it.hasNext()){
                Praticien a = it.next();
                if(choix==a.getSpecialite()){
                    model.addElement(u+": Dr."+a.getName());
                    listpraticienstock.add(a);
                    u++;
                }
            }
            liste.setModel(model);
            Iterator<Praticien> iteri= listpraticienstock.iterator();    //on boucle sur la liste des praticien pour afficher les praticien dans un premier temps
            while(iteri.hasNext()){
                Praticien zer = iteri.next();
                if(nom.equals(zer.getName())==true)
                    plock = 1;
            }
            if(plock == 0)
                JOptionPane.showMessageDialog(null, "Ce praticien n'existe pas", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
            DefaultListModel model1 = new DefaultListModel();
            Iterator<Praticien> its = listpraticienstock.iterator(); //on boucle sur la liste des praticien pour afficher les praticien dans un premier temps
            while(its.hasNext()){
                Praticien b = its.next();
                if(nom.equals(b.getName())==true){
                   listb = b.getAgendaRDV();       //peut etre passe au suivant a check
                   if(listb.isEmpty()==true){
                       JOptionPane.showMessageDialog(null, "Désolé, ce praticien n'a pas ou n'a plus de RDV", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
                   }
                   else{
                    Iterator<Integer> lol = listb.iterator();
                    while(lol.hasNext()){
                        model1.addElement(t+":"+lol.next());
                        t++;
                    }
                    liste.setModel(model1);
                    if(o>(t-1)|| o<0){
                      JOptionPane.showMessageDialog(null, "Saisissez un indice de la liste", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
                   }
                    y = (int) listb.get((o-1)); //on donne à y la valeur de la date saisie
                    listb.remove(o-1);  //suppression de la date de la liste du praticien
                    b.changertype(listb);   //on met a jour la nouvelle liste sur le praticien concerné
                    Date rdv = new Date(b.getName(),b.getNum(),nom, num, y);    //on crée une date avec les données
                    listRDV.add(rdv);   //on l'ajoute à la liste des rdv
                    JOptionPane.showMessageDialog(null,"Le rendez-vous a bien été pris pour le "+y,  "Message d'information", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }
    
    public void annulerRDV(int choix, String nom, JList liste, int s){
        ArrayList listb = new ArrayList();
        int v=1;
        int block = 0;
        int e=0;
        DefaultListModel model = new DefaultListModel();
        Iterator<Praticien> i= listpraticien.iterator();    //on boucle sur la liste des praticien pour afficher les praticien dans un premier temps
        while(i.hasNext()){
            Praticien a = i.next();
            if(choix==a.getSpecialite()){
                model.addElement(v+": Dr."+a.getName());
                v++;
            }
        }
        liste.setModel(model);
            Iterator<Date> iteratorbis = listRDV.iterator();
            while(iteratorbis.hasNext()){
                Date date = iteratorbis.next();
                if(nom.equals(date.getNomDoc())==true){
                    block=1;
                }
            }
            if(block == 0)
                JOptionPane.showMessageDialog(null,"Ce praticien n'existe pas",  "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
        DefaultListModel model1 = new DefaultListModel();
        Iterator<Date> itesi = listRDV.iterator();
        while(itesi.hasNext()){
            Date dat = itesi.next();
            if(nom.equals(dat.getNomDoc())==true){
               model1.addElement(dat.getDateRDV());
               }
            }
        liste.setModel(model1);
        Iterator<Date> iteratori = listRDV.iterator();
        while(iteratori.hasNext()){
            Date da = iteratori.next();
            if(s==da.getDateRDV()){
                e=1;
            }
        }
        if(e==0)
            JOptionPane.showMessageDialog(null, "Cette date n'existe pas", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
        if(e!=0){
            Iterator<Date> iteratoris = listRDV.iterator();     //on boucle sur la liste des date pour afficher les dates
            while(iteratoris.hasNext()){
                Date dat = iteratoris.next();
                if(s==dat.getDateRDV()){
                    listRDV.remove(dat);
                }
            }
            Iterator<Praticien> iterat = listpraticien.iterator();  //on boucle sur la liste des praticien pour afficher les praticien 
            while(iterat.hasNext()){
                Praticien prat = iterat.next();
                if(nom.equals(prat.getName())==true){
                    listb = prat.getAgendaRDV();
                }
                listb.add(s);  //ajout de la date de la liste du praticien car elle est désormais disponible
                prat.changertype(listb);   //on met a jour la nouvelle liste sur le praticien concerné
            }
            JOptionPane.showMessageDialog(null, "La date du RDV a bien été supprimée", "Message d'information", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void consulterSesRDV(JList liste){
        
        ArrayList listb = new ArrayList();
        DefaultListModel model = new DefaultListModel();
        Iterator<Praticien> it = listtamponpraticien.iterator();    //on boucle sur la liste des praticien pour afficher le praticien connecté
        while(it.hasNext()){
            Praticien a = it.next();
            listb = a.getAgendaRDV();
            if(listb.isEmpty()){
                JOptionPane.showMessageDialog(null, "Veuillez ajouter une date, votre liste de rendez-vous est actuellement vide", "Message d'avertissement", JOptionPane.WARNING_MESSAGE);
            }
            else{
                Iterator<Integer> its = listb.iterator();
                while(its.hasNext()){
                    model.addElement(its.next());
                }
                liste.setModel(model);
            }
        }
    }
    
    public void ajouterRDV(JList liste, int d){
        
        ArrayList listb = new ArrayList();
        Iterator<Praticien> it = listtamponpraticien.iterator();    //on boucle sur la liste des praticien pour afficher le praticien connecté
        while(it.hasNext()){
            Praticien a = it.next();
            listb = a.getAgendaRDV();
                if(listb.contains(d)==true){
                    JOptionPane.showMessageDialog(null, "Cette date existe deja", "Message d'averissement", JOptionPane.WARNING_MESSAGE);
                }
            listb.add(d);   //on ajoute la date
            a.changertype(listb);   //on met à jour la date
            JOptionPane.showMessageDialog(null, "la date "+d+" a été ajoutée", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void modifierRDV(JList liste, int w, int j){
        
        ArrayList listb = new ArrayList();
        Iterator<Praticien> it = listtamponpraticien.iterator();    //on boucle sur la liste des praticien pour afficher le praticien connecté
        while(it.hasNext()){
            Praticien a = it.next();
            listb = a.getAgendaRDV();
            if(listb.isEmpty()){
                JOptionPane.showMessageDialog(null, "Veuillez ajouter une date, votre liste de rendez-vous est actuellement vide", "Message d'averissement", JOptionPane.WARNING_MESSAGE);
            }
            else{
                int u=1;
                DefaultListModel model = new DefaultListModel();
                Iterator<Integer> its = listb.iterator();
                while(its.hasNext()){
                    model.addElement(u+" : "+its.next());
                    u++;
                }
                liste.setModel(model);
                
                if(w>listb.size()){
                    JOptionPane.showMessageDialog(null, "Veuillez saisir un indice de la liste", "Message d'averissement", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    listb.set((w-1), j);    //on change la date
                    a.changertype(listb);   //on met à joue la liste
                    JOptionPane.showMessageDialog(null, "la nouvelle date a bien été pris en compte", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }
    
    public void annulerRDV(JList liste, int w){
        
        ArrayList listb = new ArrayList();
        Iterator<Praticien> it = listtamponpraticien.iterator();    //on boucle sur la liste des praticien pour afficher le praticien connecté
        while(it.hasNext()){
            Praticien a = it.next();
            listb = a.getAgendaRDV();
            if(listb.isEmpty()){
                JOptionPane.showMessageDialog(null, "Veuillez ajouter une date, votre liste de rendez-vous est actuellement vide", "Message d'averissement", JOptionPane.WARNING_MESSAGE);
            }
            else{
                int u=1;
                DefaultListModel model = new DefaultListModel();
                Iterator<Integer> its = listb.iterator();
                while(its.hasNext()){
                    model.addElement(u+" : "+its.next());
                    u++;
                }
                liste.setModel(model);
                
                if(w>listb.size()){
                    JOptionPane.showMessageDialog(null, "Veuillez saisir un indice de la liste", "Message d'averissement", JOptionPane.WARNING_MESSAGE);
                }
                else{
                    listb.remove((w-1));    //on supprime la date
                    JOptionPane.showMessageDialog(null, "La suppression a bien été effectué !", "Message d'information", JOptionPane.INFORMATION_MESSAGE);
                    a.changertype(listb);   //on met a jour la liste
                }
            }
        }
        
    }
    
    public int recupererMDPpat(String pseudo, int social){

        int reussite = 0;
        Iterator<Patient> it = listpatient.iterator();  //création d'un itérateur
        while(it.hasNext()){
            Patient a = it.next();
            if(a.getPseudo().equals(pseudo)==true){
                if(a.getSocial()==social){
                    reussite = 1;
                    listtamponpraticien.add(a); //on l'ajoute à une liste tampon qui nous permettra de savoir les détails de l'usager connecté
                }
                
            }
        }
        return reussite;
    }
    
    public int recupererMDPprat(String pseudo, int telephone){
        
        int reussite = 0;
        Iterator<Praticien> its = listpraticien.iterator();  //création d'un itérateur
            while(its.hasNext()){
                Praticien a = its.next();
                if(a.getPseudo().equals(pseudo)==true){
                    if(a.getNumstelephone()==telephone){
                        reussite = 1;
                        listtamponpraticien.add(a); //on l'ajoute à une liste tampon qui nous permettra de savoir les détails de l'usager connecté
                    }
                    
                }
            }
            return reussite;
    }
    
    public void versFichierPrat() throws IOException{
        FileWriter fich = new FileWriter("praticien.txt");
        
        for(int i=0; i<listpraticien.size();i++){
            Iterator<Praticien> iterator= listpraticien.iterator();
            while(iterator.hasNext()){
                Praticien a = iterator.next();
                
                fich.write(a.getNom()+System.lineSeparator()+a.getPrenom()+System.lineSeparator()+a.getNum()+System.lineSeparator()+a.getDatedenaissance()+System.lineSeparator()+a.getIdentifiant()+System.lineSeparator()+a.getMotdepasse()+System.lineSeparator()+a.getSpecialite()+System.lineSeparator()+a.getAgendaRDV()+System.lineSeparator()+a.getVille()+System.lineSeparator());
            }
        }
        fich.close();
    }
    
    public void versFichierPat() throws IOException{
        FileWriter fich = new FileWriter("patient.txt");
        
        for(int i=0; i<listpatient.size();i++){
            fich.write(listpatient.get(i)+System.lineSeparator());
        }
        fich.close();
    }
    
//    public void depuisFichierPrat() throws FileNotFoundException{
//        FileReader fich = new FileReader("praticien.txt");
//        BufferedReader br = new BufferedReader(fich);
//        String line = br.readLine();
//        
//        while(line != null){
//            
//        }
//    }
    
    public void versFichier() throws IOException{
        FileWriter fich = new FileWriter("patient.txt");    //création fichier patient
        
        for(int i=0;i<listpatient.size();i++){  //on ecrit sur le fichier
            fich.write(listpatient.get(i)+System.lineSeparator());
        }
        fich.close();
    }
    
    public String getNom(){
        return nom;
    }
    
    public String getPrenom(){
        return prenom;
    }
    
    public int getNum(){
        return num;
    }
    
    public int getDatedenaissance(){
        return datedenaissance;
    }
    
    public String getIdentifiant(){
        return identifiant;
    }
    
    public String getMotdepasse(){
        return motdepasse;
    }
   
}
    
    