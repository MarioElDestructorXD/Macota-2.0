package mx.edu.utez.Practica3.controllers;

import mx.edu.utez.Practica3.models.Mascota;
import mx.edu.utez.Practica3.service.CaracterServiceImpl;
import mx.edu.utez.Practica3.service.ColorServiceImpl;
import mx.edu.utez.Practica3.service.MascotaServiceImpl;
import mx.edu.utez.Practica3.service.TamanoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = "/mascotas")
public class MascotaController {

    @Autowired
    private MascotaServiceImpl mascotaService;

    @Autowired
    private CaracterServiceImpl caracterService;

    @Autowired
    private ColorServiceImpl colorService;

    @Autowired
    private TamanoServiceImpl tamanoService;

    @GetMapping(value = { "/listar", "/listar/{tipoMascota}" })
    public String listarMascotas(@PathVariable(required = false) String tipoMascota, Model model) {
        model.addAttribute("listaMascotas", mascotaService.listar());

        return "voluntario/listarMascotas";
    }

    @GetMapping("/crear")
    public String crearMascota(Mascota mascota, Model model) {

        Mascota mascota1 = new Mascota();
        model.addAttribute("mascota", mascota1);
        model.addAttribute("listaCaracter", caracterService.listarCaracter());
        model.addAttribute("listaColor", colorService.listarColor());
        model.addAttribute("listaTamano", tamanoService.listarTamano());

        return "voluntario/formMascota";
    }

    @PostMapping("/crear")
    public String guardarMascota(Mascota mascota, Model model, RedirectAttributes redirectAttributes) {

        mascota.setValidacion("pendiente");
        mascota.setDisponibleAdopcion(0);
        boolean respuesta = mascotaService.guardar(mascota);
        if (respuesta) {
            redirectAttributes.addFlashAttribute("msg_success", "¡Registro exitoso!");
            return "redirect:/mascotas/listar";
        } else {
            redirectAttributes.addFlashAttribute("msg_error", "¡Registro fallido! Por favor intenta de nuevo.");
            return "redirect:/mascotas/crear";
        }
    }
}
