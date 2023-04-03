package inweb.spring.clab_criptomonedas_servidor_https_spring.controlador;

import innui.modelos.configuraciones.ResourceBundles;
import innui.modelos.configuraciones.iniciales;
import innui.modelos.errores.oks;
import innui.modelos.internacionalizacion.tr;
import innui.modelos.modelos;
import innui.modelos.modelos_comunicaciones.modelos_comunicaciones;
import inweb.modelos_html.modelos_html;
import inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_delete;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_insert;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_clave;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_conexion;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_driver;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_url;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_jdbc_servidor_http_spring_usuario;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_letras_por_linea;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_select;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_select_columnas_cabecera_tex;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_select_columnas_tex;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_select_count;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_select_pagina_tam;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_clab_criptomonedas_update;
import static inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas.k_paginacion_clave_fila_num;
import inweb.spring.clab_criptomonedas_servidor_https_spring.Clab_criptomonedas_servidor_https_spring;
import java.util.ResourceBundle;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import static inweb.spring.servidor_https_spring.controlador.Pagina_inicio_factoria.k_ok_tex;
import jakarta.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author emilio
 */
@Controller
public class Con_clab_criptomonedas_servidor_https_spring {
    public static String k_in_ruta = "in/inweb/spring/clab_criptomonedas_servidor_https_spring/controlador/in";
    public static final String k_clab_criptomonedas = "clab_criptomonedas"; // Ruta Web desde la raiz del servidor HTTPS
    public static final String k_index_html = k_clab_criptomonedas + "/index.html"; // Ruta + Página Web de inicio
    public static String k_clab_criptomonedas_tex = "clab_criptomonedas_tex";
    public static String k_titulo_tex = "titulo_tex";    
    public static String k_csrf = "_csrf";
    public Clab_criptomonedas clab_criptomoneda = null;
    public iniciales inicial = new iniciales () {
        @Override
        public boolean run(oks ok, Object... extra_array) throws Exception {
            try {
                iniciar(ok);                
                if (ok.es) { 
                    oks ok_fin = new oks();
                    terminar(ok_fin);
                    if (ok_fin.es == false) {
                        ok.setTxt(ok.getTxt(), ok_fin.getTxt());
                    }
                }
                return ok.es;
            } catch (Exception e) {
                throw e;
            }
        }

        @Override
        public boolean iniciar(oks ok, Object... extra_array) throws Exception {
            if (ok.es == false) { return ok.es; }
            _iniciar_desde_clase(modelos.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            _iniciar_desde_clase(modelos_html.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            _iniciar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            _iniciar_desde_clase(Clab_criptomonedas_servidor_https_spring.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            return ok.es;
        }

        @Override
        public boolean terminar(oks ok, Object... extra_array) throws Exception {
            _terminar_desde_clase(modelos.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            _terminar_desde_clase(modelos_html.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            _terminar_desde_clase(modelos_comunicaciones.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            _terminar_desde_clase(Clab_criptomonedas_servidor_https_spring.class, ok);
            if (ok.getGravedad() > oks.k_gravedad_baja) { return ok.es; }
            ok.iniciar();
            return ok.es;
        }
        
    };
    
    @GetMapping(k_clab_criptomonedas)
    public String clab_criptomonedas_get(HttpServletRequest request, Model model) throws Exception {
        oks ok = new oks();
        ResourceBundle in;
        try {
            if (ok.es == false) { return null; }
            in = ResourceBundles.getBundle(k_in_ruta);
            Long fila_num = 0L;
            String fila_num_tex;
            if (clab_criptomoneda == null) {
                clab_criptomoneda = new Clab_criptomonedas();
                inicial.iniciar(ok);
                if (ok.es) {
                    while (true) {
                        configurar(ok);
                        if (ok.es == false) { break; }
                        clab_criptomoneda.crear_formulario_lectura(ok);
                        if (ok.es == false) { break; }
                        clab_criptomoneda.crear_formulario_insercion(ok);
                        if (ok.es == false) { break; }
                        clab_criptomoneda.crear_formulario_borrado(ok);
                        if (ok.es == false) { break; }
                        break;                        
                    }
                }
            }
            while (true) {
                Long filas_cuenta = clab_criptomoneda.leer_cuenta_filas_criptomonedas(ok);
                if (ok.es == false) { break; }
                if (request.getParameterMap().containsKey(k_paginacion_clave_fila_num)) {
                    fila_num_tex = request.getParameterMap().get(k_paginacion_clave_fila_num)[0];
                    fila_num = Long.valueOf(fila_num_tex);
                }
                clab_criptomoneda.capturar_lecturas_web_formulario(fila_num, filas_cuenta, ok);
                if (ok.es == false) { break; }
                String texto = clab_criptomoneda.lectura_web_formulario.getContenido_formulario_html();
                model.addAttribute(k_clab_criptomonedas_tex, texto);
                texto = tr.in(in, "CLAB criptomonedas con Servidor HTTPS Spring "); // Traducible a otros lenguajes
                model.addAttribute(k_titulo_tex, texto);
                break;
            }
            oks ok_fin = new oks();
            inicial.terminar(ok_fin);
            if (ok_fin.es == false) {
                ok.setTxt(ok.getTxt(), ok_fin.getTxt());
            }
            if (ok.es == false) {
                model.addAttribute(k_ok_tex, ok.getTxt());
            }
        } catch (Exception e) {
            in = ResourceBundles.getBundle(k_in_ruta);
            ok.setTxt(tr.in(in, "Excepción inesperada "), e);
            model.addAttribute(k_ok_tex, ok.getTxt());
        }
        return k_index_html;
    }
    
    @PostMapping(k_clab_criptomonedas)
    public String clab_criptomonedas_post(HttpServletRequest request, Model model) throws Exception {
        oks ok = new oks();
        ResourceBundle in;
        try {
            if (ok.es == false) { return null; }
            in = ResourceBundles.getBundle(k_in_ruta);
            inicial.iniciar(ok);
            if (ok.es) {
                while (true) {
                    Map<String, String> datos_mapa = new LinkedHashMap<>();
                    String [] valor_array;
                    for (Entry<String, String []> entry : request.getParameterMap().entrySet()) {
                        if (entry.getKey().equals(k_csrf) == false) {
                            valor_array = entry.getValue();
                            if (valor_array.length != 1) {
                                ok.setTxt(tr.in(in, "Nombre de parámetro HTTP/S repetido. "));
                                break;
                            }
                            datos_mapa.put(entry.getKey(), valor_array[0]);
                        }
                    }
                    if (ok.es == false) { break; }
                    String texto = clab_criptomoneda.procesar_formulario(datos_mapa, ok);
                    if (ok.es == false) { break; }
                    model.addAttribute(k_clab_criptomonedas_tex, texto);
                    texto = tr.in(in, "CLAB criptomonedas con Servidor HTTPS Spring "); // Traducible a otros lenguajes
                    model.addAttribute(k_titulo_tex, texto);
                    break;
                }
                oks ok_fin = new oks();
                inicial.terminar(ok_fin);
                if (ok_fin.es == false) {
                    ok.setTxt(ok.getTxt(), ok_fin.getTxt());
                }
            }
            if (ok.es == false) {
                model.addAttribute(k_ok_tex, ok.getTxt());
            }
        } catch (Exception e) {
            in = ResourceBundles.getBundle(k_in_ruta);
            ok.setTxt(tr.in(in, "Excepción inesperada "), e);
            model.addAttribute(k_ok_tex, ok.getTxt());
        }
        return k_index_html;
    }
    /**
     * Obtiene las propiedades de configuración 
     * @param ok
     * @param extra_array
     * @return
     * @throws Exception 
     */
    public boolean configurar(oks ok, Object... extra_array) throws Exception {
        // Terminar clase principal de la librería
        if (ok.es == false) { return ok.es; }
        ResourceBundle in = null;
        try {
            in = ResourceBundles.getBundle(k_in_ruta);
            clab_criptomoneda.url = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            if (clab_criptomoneda.url == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_url);
            }
            clab_criptomoneda.driver = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            if (clab_criptomoneda.driver == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_driver);
            }
            clab_criptomoneda.conexion = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            if (clab_criptomoneda.conexion == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_conexion);
            }
            clab_criptomoneda.usuario = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            if (clab_criptomoneda.usuario == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_usuario);
            }
            clab_criptomoneda.clave = inicial.properties.getProperty(k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            if (clab_criptomoneda.clave == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_jdbc_servidor_http_spring_clave);
            }
            clab_criptomoneda.select = inicial.properties.getProperty(k_clab_criptomonedas_select);
            if (clab_criptomoneda.select == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select);
            }
            clab_criptomoneda.select_columnas_tex = inicial.properties.getProperty(k_clab_criptomonedas_select_columnas_tex);
            if (clab_criptomoneda.select_columnas_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_tex);
            }
            clab_criptomoneda.select_columnas_cabecera_tex = inicial.properties.getProperty(k_clab_criptomonedas_select_columnas_cabecera_tex);
            if (clab_criptomoneda.select_columnas_cabecera_tex == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_columnas_cabecera_tex);
            }
            clab_criptomoneda.select_pagina_tam = inicial.properties.getProperty(k_clab_criptomonedas_select_pagina_tam);
            if (clab_criptomoneda.select_pagina_tam == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_pagina_tam);
            } else {
                clab_criptomoneda.pagina_tam = Integer.valueOf(clab_criptomoneda.select_pagina_tam);
            }
            clab_criptomoneda.select_count = inicial.properties.getProperty(k_clab_criptomonedas_select_count);
            if (clab_criptomoneda.select_count == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_select_count);
            }
            clab_criptomoneda.insert = inicial.properties.getProperty(k_clab_criptomonedas_insert);
            if (clab_criptomoneda.insert == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_insert);
            }
            clab_criptomoneda.update = inicial.properties.getProperty(k_clab_criptomonedas_update);
            if (clab_criptomoneda.update == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_update);
            }
            clab_criptomoneda.delete = inicial.properties.getProperty(k_clab_criptomonedas_delete);
            if (clab_criptomoneda.delete == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_delete);
            }
            clab_criptomoneda.letras_por_linea = inicial.properties.getProperty(k_clab_criptomonedas_letras_por_linea);
            if (clab_criptomoneda.letras_por_linea == null) {
                ok.setTxt(ok.getTxt(), tr.in(in, "Falta definir la propiedad: ") + k_clab_criptomonedas_letras_por_linea);
            }
            if (ok.es == false) {
                inicial.escribir_linea_error(ok.getTxt(), ok, extra_array);
            }
        } catch (Exception e) {
            throw e;
        }
        return ok.es;
    }
}
