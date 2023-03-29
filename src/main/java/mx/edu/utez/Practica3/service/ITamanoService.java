package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Tamano;
import java.util.List;

public interface ITamanoService {

    List<Tamano> listarTamano();

    boolean guardar(Tamano tamano);
}
