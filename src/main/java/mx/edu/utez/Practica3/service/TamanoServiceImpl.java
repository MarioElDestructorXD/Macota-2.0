package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Tamano;
import mx.edu.utez.Practica3.repositories.TamanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TamanoServiceImpl implements ITamanoService{

    @Autowired
    TamanoRepository tamanoRepository;

    @Override
    public List<Tamano> listarTamano() {
        return tamanoRepository.findAll(Sort.by("nombre").ascending());
    }

    @Override
    public boolean guardar(Tamano tamano) {
        return false;
    }
}
