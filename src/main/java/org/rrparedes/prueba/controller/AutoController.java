package org.rrparedes.prueba.controller;

import org.rrparedes.prueba.model.Auto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AutoController {

    @GetMapping({"/autos"})
    public String autos(Model model) {

        Auto a1 = new Auto("XBA-1010", "totoya Yaris", 2023, "Plateado", 12500.0);

        List<Auto> autos = new ArrayList<>();
        autos.add(a1);
        autos.add(new Auto("PCH-2020", "Chevrolet Sail", 2021, "Azul Marino", 48000.0));
        autos.add(new Auto("FMD-3030", "Ford Mustang", 2022, "Amarillo", 25000.0));
        autos.add(new Auto("KSP-4040", "Kia Sportage", 2024, "Blanco Perla", 8000.0));
        autos.add(new Auto("MCX-5050", "Mazda CX-5", 2020, "Rojo Cereza", 62000.0));

        model.addAttribute("saludo", "Catálogo de Vehículos Registrados");
        model.addAttribute("auto", a1);
        model.addAttribute("autos", autos);

        return "autos";
    }
}
