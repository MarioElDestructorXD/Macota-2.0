package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Color;
import mx.edu.utez.Practica3.repositories.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ColorServiceImpl implements IColorService{

    @Autowired
    ColorRepository colorRepository;

    @Override
    public List<Color> listarColor() {
        return colorRepository.findAll(Sort.by("nombre").ascending());
    }

    @Override
    public boolean guardar(Color color) {
        return false;
    }
}
