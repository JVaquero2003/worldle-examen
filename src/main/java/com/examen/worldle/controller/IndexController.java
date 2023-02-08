package com.examen.worldle.controller;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examen.worldle.model.Palabra;
import com.examen.worldle.service.ServicePalabra;

@Controller
public class IndexController {

    Logger l = org.apache.logging.log4j.LogManager.getLogger(IndexController.class);

    public ServicePalabra servicePalabra;

    @Autowired
    public IndexController(ServicePalabra servicePalabra) {
        this.servicePalabra = servicePalabra;
    }

    @GetMapping("/")
    public ModelAndView goToIndexPage() {
        List<Palabra> listPalabras = servicePalabra.listaPalabras();
        ModelAndView modelAndView = new ModelAndView("index");
        Palabra palabra = new Palabra(servicePalabra.getPalabraCorrecta());
        modelAndView.addObject("palabra", palabra);
        modelAndView.addObject("listaPalabra", listPalabras);
        return modelAndView;
    }

    @PostMapping("comprobarPalabra")
    public ModelAndView comprobarAcierto(@ModelAttribute("palabra") Palabra palabra) {
        System.out.println(palabra.palabra);
        int intentos = 1;
        servicePalabra.guardarIntentos(palabra.intentos);
        ModelAndView modelAndView = new ModelAndView("index");
        String resultado = servicePalabra.comprobar(palabra.palabra);
        if (resultado.equals("Correcto")) {
            intentos++;
        } else {
            intentos++;
        }
        servicePalabra.getIntentos(intentos);
        System.out.println(servicePalabra.getIntentos(intentos));
        modelAndView.addObject("resultado", resultado);
        modelAndView.addObject("intentos", intentos);
        return modelAndView;
    }
}
