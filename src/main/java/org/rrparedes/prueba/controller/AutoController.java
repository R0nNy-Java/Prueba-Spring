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

        Auto a1 = new Auto("THX-8888", "totoya Hilux", 2024, "Negro", 5000.0);

        List<Auto> autos = new ArrayList<>();
        autos.add(a1);
        autos.add(new Auto("NFR-7777", "Nissan Frontier", 2023, "Gris Metalizado", 18500.0));
        autos.add(new Auto("HTC-5555", "Hyundai Tucson", 2022, "Azul", 32000.0));
        autos.add(new Auto("VAK-3333", "Volkswagen Amarok", 2021, "Blanco", 54000.0));
        autos.add(new Auto("SVT-1111", "Suzuki Vitara", 2020, "Verde", 67000.0));

        model.addAttribute("saludo", "Catálogo de Vehículos Registrados");
        model.addAttribute("auto", a1);
        model.addAttribute("autos", autos);

        return "autos";
    }
}
