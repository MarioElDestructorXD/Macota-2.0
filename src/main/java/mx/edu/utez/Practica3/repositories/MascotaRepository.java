package mx.edu.utez.Practica3.repositories;

import mx.edu.utez.Practica3.models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}
