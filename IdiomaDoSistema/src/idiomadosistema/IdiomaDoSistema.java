package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author lyhar
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O sistema esta no idioma");
        System.out.println(loc.getDisplayLanguage());
    }
    
}
