package mx.edu.utez.act3.repositories;

import mx.edu.utez.act3.model.Caracter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaracterRepository extends JpaRepository<Caracter, Long> {
}
