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

        Auto a1 = new Auto("PBA-1234", "totoya", 2022, "Rojo", 45000.5);

        List<Auto> autos = new ArrayList<>();
        autos.add(a1);
        autos.add(new Auto("PBB-5678", "Ford", 2020, "Negro", 78000.0));
        autos.add(new Auto("PBC-9012", "Chevrolet", 2021, "Blanco", 60000.0));
        autos.add(new Auto("PBD-3456", "Nissan", 2019, "Gris", 92500.0));
        autos.add(new Auto("PBE-7890", "Hyundai", 2023, "Azul", 15000.0));

        model.addAttribute("saludo", "Catálogo de Vehículos Registrados");
        model.addAttribute("auto", a1);
        model.addAttribute("autos", autos);

        return "autos";
    }
}
