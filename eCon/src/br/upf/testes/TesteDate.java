package br.upf.testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;

public class TesteDate extends JFrame {

    public void aaa() {
        String a = this.getClass().getSimpleName();
        System.out.println(a);
    }

    private void mostraData() {
        Calendar data = Calendar.getInstance();
        String time = new SimpleDateFormat("yyyMMddhhmmss").format(data.getTime());
        System.out.println(time);
    }

    public static void main(String[] args) {
        new TesteDate().aaa();
    }

}
