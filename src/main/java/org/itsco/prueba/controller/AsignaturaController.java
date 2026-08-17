package org.itsco.prueba.controller;

import org.itsco.prueba.model.Asignatura;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AsignaturaController {

    @GetMapping({"/Asignatura", "/asignatura"})
    public String asignatura(Model model) {

        List<Asignatura> asignaturas = new ArrayList<>();

        // Ejemplo 1: Aprobado (Suma >= 21)
        asignaturas.add(new Asignatura("Base de Datos", 8.0f, 7.5f, 8.0f));

        // Ejemplo 2: Suspenso (Suma entre 18 y 21)
        asignaturas.add(new Asignatura("Programación", 6.0f, 6.5f, 6.5f));

        // Ejemplo 3: Reprobado (Suma < 18)
        asignaturas.add(new Asignatura("Matemáticas", 5.0f, 4.5f, 5.0f));

        // Ejemplo 4: Aprobado (Suma >= 21)
        asignaturas.add(new Asignatura("Estructura de Datos", 7.0f, 8.0f, 7.0f));

        // Ejemplo 5: Suspenso (Suma entre 18 y 21)
        asignaturas.add(new Asignatura("Redes", 6.0f, 6.0f, 6.0f));

        model.addAttribute("saludo", "Reporte de Calificaciones de Asignaturas");
        model.addAttribute("asignaturas", asignaturas);

        return "asignatura";
    }
}
