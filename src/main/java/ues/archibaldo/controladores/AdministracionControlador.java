package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akino on 05-26-16.
 */
@Controller
public class AdministracionControlador {

    @RequestMapping(value = "/administracion")
    public String admin(){
        return "administracion";
    }

}
