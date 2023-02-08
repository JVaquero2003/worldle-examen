package com.examen.worldle.controller;

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
        ModelAndView modelAndView = new ModelAndView("index");
        Palabra guess = new palabra(guessService.getPalabraCorrecta());
        modelAndView.addObject("guess", guess);
        return modelAndView;
    }

    @PostMapping("/comprobarPalabra")
    public ModelAndView comprobarAcierto(@ModelAttribute("palabra") Palabra palabra) {
        System.out.println(palabra.);

        ModelAndView modelAndView = new ModelAndView("index");
        String resultado = ServicePalabra.comprobar(palabra);
        modelAndView.addObject("resultado", resultado);
        return modelAndView;
    }
}
