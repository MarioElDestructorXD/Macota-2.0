package mx.edu.utez.act3.services;

import mx.edu.utez.act3.model.Caracter;
import mx.edu.utez.act3.repositories.CaracterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaracterServiceImpl implements ICaracterService{
    @Autowired
    private CaracterRepository caracterRepository;

    @Override
    public List<Caracter> listar() {
        return caracterRepository.findAll(Sort.by("nombre").ascending());
    }
}
