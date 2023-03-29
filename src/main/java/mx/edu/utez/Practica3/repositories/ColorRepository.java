package mx.edu.utez.Practica3.repositories;

import mx.edu.utez.Practica3.models.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRepository extends JpaRepository<Color, Long> {
}
