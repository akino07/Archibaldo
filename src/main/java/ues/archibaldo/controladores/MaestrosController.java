package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akino on 05-27-16.
 */
@Controller
public class MaestrosController {
    @RequestMapping(value ="/maestros")
    public String maestros(){
        return "maestros";
    }
}
