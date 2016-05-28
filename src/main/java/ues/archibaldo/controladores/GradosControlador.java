package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Samuel on 27/05/2016.
 */

@Controller
public class GradosControlador {
    @RequestMapping(value = "/grados")
    public String index(){
        return "grados";
    }


}
