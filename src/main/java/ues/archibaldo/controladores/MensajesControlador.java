package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akino on 05-24-16.
 */
@Controller
public class MensajesControlador {

    @RequestMapping(value = "/mensajes")
    public String mensajes(){
        return "mensajes";
    }

    @RequestMapping(value = "/historial")
    public String historial(){
        return "historial";
    }

    @RequestMapping(value = "/recordatorios")
    public String recordatorios(){
        return "recordatorios";
    }
}
