package inweb.spring.clab_criptomonedas_servidor_https_spring.controlador;

import innui.modelos.errores.oks;
import inweb.spring.servidor_https_spring.controlador.Pagina_inicio_factoria;
import org.springframework.ui.Model;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.controlador.Con_clab_criptomonedas_servidor_https_spring.k_clab_criptomonedas;

/**
 *
 * @author emilio
 */
public class Pagina_inicio extends Pagina_inicio_factoria {

    @Override
    public String presentar_inicio(Model model, oks ok, Object... extra_array) throws Exception {
        String text = "redirect:" + k_clab_criptomonedas; // Orden de redirección a la página hola_mundo
        return text;
    }

}
