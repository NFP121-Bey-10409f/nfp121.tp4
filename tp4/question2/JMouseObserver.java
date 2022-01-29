 package question2;
import java.util.*;
import java.awt.event.*;// � compl�ter
import java.awt.event.MouseEvent;
import java.awt.TextArea;
//import javax.swing.*;
/**
 * D�crivez votre classe JButtonObserver ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class JMouseObserver implements MouseListener{ // � compl�ter

    private String nom;
    private TextArea contenu;

    /**
     * Constructeur d'objets de classe JButtonObserver
     */
    public JMouseObserver(String nom, TextArea contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    public void mouseClicked(MouseEvent e) {
    }

    /**
     * affichage d'un message dans la zone de texte ce message est de la forme
     * observateur this.nom : souris entr�e en (X,Y) exemple : observateur jmo1
     * : souris entr�e en (15,20)
     * 
     * @param
     */
    public void mouseEntered(MouseEvent e) {
        String message = "observateur " + this.nom + " : " + "souris entr?en ("+e.getX()+","+e.getY()+")";
        contenu.append(message + "\n");
    }

    public void mouseExited(MouseEvent e) {
        String message = "observateur " + this.nom + " : " + "souris entr?en ("+e.getX()+","+e.getY()+")";
        contenu.append(message + "\n");
       }

    public void mousePressed(MouseEvent e) {
        String message = "observateur " + this.nom + " : " + "souris entr?en ("+e.getX()+","+e.getY()+")";
        contenu.append(message + "\n");
       }

    public void mouseReleased(MouseEvent e) {
        String message = "observateur " + this.nom + " : " + "souris entr?en ("+e.getX()+","+e.getY()+")";
        contenu.append(message + "\n");
       }

}
