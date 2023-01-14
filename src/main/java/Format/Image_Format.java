/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Format;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author MINDLUNNY
 */
public class Image_Format {
    
    public static void Set_Size_Image_Label (JLabel jlabel, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(jlabel.getWidth(), jlabel.getHeight(), Image.SCALE_DEFAULT));
        jlabel.setIcon(icon);
    }
    
    public static void Set_Size_Image_Button (JButton jbutton, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(jbutton.getWidth(), jbutton.getHeight(), Image.SCALE_DEFAULT));
        jbutton.setIcon(icon);
    }
    
}
