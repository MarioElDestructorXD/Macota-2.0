package mx.edu.utez.act3.services;

import mx.edu.utez.act3.model.Tamano;
import mx.edu.utez.act3.repositories.TamanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TamanoServiceImpl implements ITamanoService {
    @Autowired
    private TamanoRepository tamanoRepository;

    @Override
    public List<Tamano> listar() {
        return tamanoRepository.findAll(Sort.by("nombre").ascending());
    }
}
