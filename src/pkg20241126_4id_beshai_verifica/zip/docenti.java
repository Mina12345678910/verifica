/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241126_4id_beshai_verifica.zip;

/**
 *
 * @author Ospite1
 */
public class docenti {
// in questa parte di codice inizializziamo
String cognome;
String materia;
    public docenti(String c, String m) {
         cognome = c;
         materia = m;
    } 
      public void stampadocenti(){
           System.out.println("docente:" +cognome+ ",materia"+ materia);
           
      }
}
