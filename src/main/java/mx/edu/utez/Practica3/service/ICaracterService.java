package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Caracter;
import java.util.List;

public interface ICaracterService {

    List<Caracter> listarCaracter();

    boolean guardar(Caracter caracter);
}
