/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg20241126_4id_beshai_verifica.zip;

/**
 *
 * @author Ospite1
 */
public class verifica{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    studenti studente1 = new studenti ("beshai",6,8,5);
    studenti studente2 = new studenti ("bayon",7,8,2);
    studenti studente3 = new studenti ("metawe",6,6,7); 
    
    docenti docente1 =new docenti ("Torsello", "lab.informatica");
    docenti docente2 =new docenti ("Infante", "informatica");
    docenti docente3 =new docenti ("Tagliabue", "matematica");
    
    System.out.println("ecco le varie informazioni sugli studenti: ");
    studente1.stampastudenti();
    studente2.stampastudenti();
    studente3.stampastudenti();
    
      System.out.println("ecco le varie informazioni sui docenti: ");
       docente1.stampadocenti();
       docente2.stampadocenti();
       docente3.stampadocenti();
    }
    
}
