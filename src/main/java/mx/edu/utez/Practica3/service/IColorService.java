package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Caracter;
import mx.edu.utez.Practica3.models.Color;

import java.util.List;

public interface IColorService {

    List<Color> listarColor();

    boolean guardar(Color color);
}
