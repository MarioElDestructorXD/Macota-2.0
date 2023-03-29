package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Mascota;
import java.util.List;

public interface IMascotaService {

    List<Mascota> listar();

    boolean guardar(Mascota mascota);

}
