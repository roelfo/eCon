
package br.upf.exemploManualFrame;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Rodrigo
 */
public class AbreURL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String cod = "8754";

            Desktop desktop = null;
//Primeiro verificamos se é possível a integração com o desktop
            if (!Desktop.isDesktopSupported()) {
                throw new IllegalStateException("Desktop resources not supported!");
            }

            desktop = Desktop.getDesktop();
//Agora vemos se é possível disparar o browser default.
            if (!desktop.isSupported(Desktop.Action.BROWSE)) {
                throw new IllegalStateException("No default browser set!");
            }
            
            String valor = new AbreURL().convertStringToHex("22102");
//Pega a URI de um componente de texto.
            URI uri = new URI("http://192.168.15.131:8082/central_reportws/repos?id=" + valor + "&status=1");

//Dispara o browser default, que pode ser o Explorer, Firefox ou outro.
            desktop.browse(uri);

        } catch (Exception e) {
        }
    }

    public String convertStringToHex(String str) {
        char[] chars = str.toCharArray();
        StringBuffer hex = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            hex.append(Integer.toHexString((int) chars[i]));
        }
        return hex.toString();
    }

}
