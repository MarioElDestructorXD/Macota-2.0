package mx.edu.utez.act3.repositories;

import mx.edu.utez.act3.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
