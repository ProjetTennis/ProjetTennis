package gesmatch;

import javax.swing.UIManager;

/**
 *
 * @author Sylvio
 */
public class GesMatch
{
    public static void main(String[] args) throws Exception
      {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); // Permet d'avoir l'interface windows
           
          AdminAccueil fenetre = new AdminAccueil();
          fenetre.setVisible(true);
      }
    
}
