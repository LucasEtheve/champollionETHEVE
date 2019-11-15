/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package champollion;

import java.util.Date;

/**
 *
 * @author lucasetheve
 */
public class Intervention {
    
    public Date date;
    public int duree;
    public boolean annulee = false;
    public Typeintervention intervention;
    public Salle lieu;
    public UE matière;

    public Intervention(Date date, int duree, Typeintervention intervention, Salle lieu, UE matière) {
        this.date = date;
        this.duree = duree;
        this.intervention = intervention;
        this.lieu = lieu;
        this.matière = matière;
    }
    
}
