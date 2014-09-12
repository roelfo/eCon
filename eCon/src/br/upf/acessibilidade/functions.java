package br.upf.acessibilidade;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.KeyStroke;

public class functions {
    
    public static void setAcessibilidade(final JFrame frame) {
        JRootPane meurootpane = frame.getRootPane();
        meurootpane.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "ESCAPE");
        meurootpane.getRootPane().getActionMap().put("ESCAPE", new AbstractAction("ESCAPE") {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
    
    public static String getAtualTime(){
       Calendar data = Calendar.getInstance();
        return new SimpleDateFormat("yyyMMddhhmmss").format(data.getTime()); 
    }
}
