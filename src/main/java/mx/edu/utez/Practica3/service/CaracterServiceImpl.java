package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Caracter;
import mx.edu.utez.Practica3.repositories.CaracterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaracterServiceImpl implements ICaracterService{

    @Autowired
    CaracterRepository caracterRepository;

    @Override
    public List<Caracter> listarCaracter() {
        return caracterRepository.findAll(Sort.by("nombre").ascending());
    }

    @Override
    public boolean guardar(Caracter caracter) {
        return false;
    }
}
