/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

/**
 *
 * @author romai
 */
public class Scenario {
    
    Effets effets;
    
 /* Je n'ai pas trouvé comment dire à Maven que la classe de départ était celle là
    il appelle tout le temps la méthode main de ExempleDutilisation.
    C'est pour ça que j'ai laissé ExempleDutilisation active
 */   
    public void start(){
        effets = new Effets();
        effets.changeBackground();
        effets.zoomAndRotate();
        effets.changeFont();
        effets.fermerBandeau();
    } 
}
