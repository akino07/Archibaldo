package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akino on 05-24-16.
 */
@Controller
public class PermisosControlador {
    @RequestMapping(value = "/permisos")
    public String permisos(){
        return "permisos";
    }
}
