/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author romai
 */
public class Effets {
    Bandeau bandeau;
    List<Font> fonts = new LinkedList<>();
    List<Color> colors = new LinkedList<>();
    
    public Effets(){
        bandeau = new Bandeau();
        addFonts();
        addColors();
    }
    
    private void addFonts(){
        fonts.add(new Font("Monospaced", Font.BOLD, 15));
        fonts.add(new Font("SansSerif", Font.PLAIN, 15));
        fonts.add(new Font("Dialog", Font.BOLD, 15));
        fonts.add(new Font("Courier new", Font.PLAIN, 15));
    }
    
    private void addColors(){
        colors.add(Color.YELLOW);
        colors.add(Color.DARK_GRAY);
        colors.add(Color.ORANGE);
        colors.add(Color.CYAN);
        colors.add(Color.GREEN);
    }
    
    public void changeBackground(){
        Color baseColor = bandeau.getBackground();
        bandeau.setMessage("Changement de couleur de fond !");
        for (int i=0;i< colors.size();i++){
        bandeau.sleep(1000);
        bandeau.setBackground(colors.get(i));
        }
        bandeau.setBackground(baseColor);
	
    }
    
    public void zoomAndRotate(){
        Font baseFont = bandeau.getFont();
        bandeau.setMessage("On va tourner et zoomer !");
	bandeau.sleep(1000);
	bandeau.setMessage("On tourne...");
	for (int i = 0; i <= 100; i++)
        {            
		bandeau.setFont(new Font("Dialog", Font.BOLD, 10+i/2));
		bandeau.setRotation(2*Math.PI*i / 100);
		bandeau.sleep(100);
        }
        bandeau.setFont(baseFont);
    }
    
    public void changeFont(){
        Font baseFont = bandeau.getFont();
        bandeau.setMessage("On va changer de police");
        bandeau.sleep(1000);
        bandeau.setMessage("Il y en a plusieurs...");
        for(int i = 0; i<fonts.size();i++){
            bandeau.setFont(fonts.get(i));
            bandeau.sleep(1000);
        }
        bandeau.setFont(baseFont);
        bandeau.setMessage("On a fait le tour des polices");
    }
    
    public void fermerBandeau(){
        bandeau.sleep(3000);
	bandeau.close();
    }

    
    
    
    
    
}
