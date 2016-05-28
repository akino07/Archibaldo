package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * Created by olmedo on 05-26-16.
 */

@Controller
public class EstadisticasControlador {

    @RequestMapping(value = "/estadisticas")
    public String estadisticas(){
        return "estadisticas";
    }
}
