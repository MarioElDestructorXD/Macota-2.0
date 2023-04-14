package mx.edu.utez.act3.services;

import mx.edu.utez.act3.model.Mascota;
import mx.edu.utez.act3.repositories.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaServiceImpl implements IMascotaService{
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

    @Override
    public Mascota mostrar(long id) {
        Optional<Mascota> optional = mascotaRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public boolean eliminar(long id) {
        boolean existe = mascotaRepository.existsById(id);
        if (existe) {
            mascotaRepository.deleteById(id);
            return !mascotaRepository.existsById(id);
        }
        return false;
    }

    @Override
    public Page<Mascota> listarPaginacion(Pageable page) {
        return mascotaRepository.findAll(page);
    }

}
