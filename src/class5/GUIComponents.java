/*******************************************************************************
* GUIComponents.java
*******************************************************************************/
package class6;

import javax.Swing.*;

/*******************************************************************************
* GUI Components
*******************************************************************************/
public class GUIComponents
  {
  /*****************************************************************************
  * Driver
  *****************************************************************************/
  public static void main (String[] args)
    {
    /*------------------------*/
    /* Create the components. */
    /*------------------------*/
    JButton      jbtOK      = new JButton     ("OK");
    JButton      jbtCancel  = new JButton     ("Cancel");
    JLabel       jlblName   = new JLabel      ("Name");
    JTextField   jtfName    = new JTextField  ("Enter your name: ");
    JCheckBox    jchkBold   = new JCheckBox   ("Bold");
    JCheckBox    jchkItalic = new JCheckBox   ("Italic");
    JRadioButton jrbRed     = new JRadioButton("Red");
    JRadioButton jrbYellow  = new JRadioButton("Yellow");
    JComboBox    jcboColor  = new JComboBox   (new String[] { "Freshmen", "Sophmore", "Junior", "Senior" });
    
    /*------------------*/
    /* Setup the panel. */
    /*------------------*/
    JPanel panel = new JPanel();
    panel.add(jbtOK);
    panel.add(jbtCancel);
    panel.add(jlblName);
    panel.add(jtfName);
    panel.add(jchkBold);
    panel.add(jchkItalic);
    panel.add(jrbRed);
    panel.add(jrbYellow);
    panel.add(jcboColor);
    
    /*-------------------*/
    /* Create the frame. */
    /*-------------------*/
    JFrame frame = new JFrame();
    frame.add(panel);
    frame.setTitle("Show GUI Components");
    frame.setSize(450, 100);
    frame.setLocation(200, 100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
  }
