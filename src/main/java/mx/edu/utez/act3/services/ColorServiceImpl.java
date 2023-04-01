package mx.edu.utez.act3.services;

import mx.edu.utez.act3.model.Color;
import mx.edu.utez.act3.repositories.ColorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorServiceImpl implements IColorService{
    @Autowired
    private ColorRepository colorRepository;


    @Override
    public List<Color> listar() {
        return colorRepository.findAll(Sort.by("nombre").ascending());
    }
}
