package mx.edu.utez.act3.services;

import mx.edu.utez.act3.model.Mascota;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMascotaService {
    List<Mascota> listar();

    boolean guardar(Mascota mascota);
    Mascota mostrar(long id);

    boolean eliminar(long id);
    Page<Mascota> listarPaginacion(Pageable page);
}
