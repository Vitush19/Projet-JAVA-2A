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
public class Date {
    
    String nomDoc;
    String nomPatient;
    int numsocialDoc;
    int numsocialPatient;
    int date;

    public Date(String nomDoc, int numsocialDoc, String nomPatient, int numsocialPatient, int date){
        
        this.nomDoc = nomDoc;
        this.numsocialDoc = numsocialDoc;
        this.nomPatient = nomPatient;
        this.numsocialPatient = numsocialPatient;
        this.date = date;
    }

    public String getNomDoc() {
        return nomDoc;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public int getNumsocialDoc() {
        return numsocialDoc;
    }

    public int getNumsocialPatient() {
        return numsocialPatient;
    }

    public int getDateRDV() {
        return date;
    }
    
    
}
