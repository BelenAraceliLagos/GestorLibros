package cl.praxis.GestorLibros.controller;

import cl.praxis.GestorLibros.service.LibroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/libros")
public class LibroController {

    LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("libros", service.findAll());
        return "libros";
    }

    @GetMapping("/{nro_libro}")
    public String findOne(@PathVariable("nro_libro") int nro_libro, Model model){
      model.addAttribute("libro", service.findOne(nro_libro));
      return "libroedit";
    }
}
