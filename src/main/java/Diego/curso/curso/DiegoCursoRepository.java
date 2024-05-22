package Diego.curso.curso;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jakarta.transaction.Transactional;

public interface DiegoCursoRepository extends CrudRepository<DiegoCurso, Long> {
    @Modifying
    @Transactional
    @Query("DELETE FROM DiegoCurso r WHERE r.nombre = ?1")
    void deleteNombre(String nombreCurso);
}
