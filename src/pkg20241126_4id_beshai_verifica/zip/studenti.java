/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241126_4id_beshai_verifica.zip;

/**
 *
 * @author Ospite1
 */
public class studenti {
 
    String cognome;
    int voto1; 
    int voto2;
    int voto3;
    public studenti(String c, int v1, int v2, int v3){

    cognome = c;
    voto1 = v1;
    voto2 = v2;
    voto3 = v3;
    }
    public void stampastudenti(){
         System.out.println("studente:"+cognome);
         System.out.println("voti:"+voto1+","+voto2+","+voto3);
    }
    

}
