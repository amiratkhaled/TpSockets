
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khaled
 */
public class startclient {

    public static void main(String[] args) {
        try {
            String m = JOptionPane.showInputDialog("Your name first please?");
            mychat c = new mychat(m);
            Thread t1 = new Thread(c);
            t1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
