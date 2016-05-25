package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akino on 05-22-16.
 */

@Controller
public class InicioControlador {

    @RequestMapping(value = "/")
    public String index(){
        return "inicio";
    }

    @RequestMapping(value = "/acerca")
    public String acerca(){
        return "acerca";
    }

}
