package ues.archibaldo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Samuel on 25/05/2016.
 */
@Controller
public class AlumnosControlador {

    @RequestMapping(value = "/huellas")
    public String huellas(){
        return "huellas";
    }

    @RequestMapping(value = "/alumnos")
    public String alumnos(){
        return "alumnos";
    }

    @RequestMapping(value = "/detalleAlumno")
    public String detalleAlumno(){
        return "detalleAlumno";
    }

    @RequestMapping(value = "/actualizarAlumno")
    public String actualizarAlumno(){
        return "actualizarAlumno";
    }
}
