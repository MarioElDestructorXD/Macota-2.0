package mx.edu.utez.act3.services;

import mx.edu.utez.act3.model.Mascota;

import java.util.List;

public interface IMascotaService {
    List<Mascota> listar();

    boolean guardar(Mascota mascota);
    Mascota mostrar(long id);

    boolean eliminar(long id);
}
