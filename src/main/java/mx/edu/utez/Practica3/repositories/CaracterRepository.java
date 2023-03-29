package mx.edu.utez.Practica3.repositories;

import mx.edu.utez.Practica3.models.Caracter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaracterRepository extends JpaRepository<Caracter, Long> {
}
