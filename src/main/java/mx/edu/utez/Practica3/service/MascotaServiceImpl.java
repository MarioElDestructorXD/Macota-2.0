package mx.edu.utez.Practica3.service;

import mx.edu.utez.Practica3.models.Mascota;
import mx.edu.utez.Practica3.repositories.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements  IMascotaService{

    @Autowired
    private MascotaRepository mascotaRepository;

    @Override
    public List<Mascota> listar() {
        return mascotaRepository.findAll();
    }

    @Override
    public boolean guardar(Mascota mascota) {

        try {
            mascotaRepository.save(mascota);
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

}
