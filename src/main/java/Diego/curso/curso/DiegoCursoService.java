package Diego.curso.curso;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DiegoCursoService {
    @Autowired
    private DiegoCursoRepository cursoRepository;

    public List<DiegoCurso> findAll() {
        Iterable<DiegoCurso> iterable = cursoRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }

    public DiegoCurso diegoInsert (DiegoCurso entity) {
        return cursoRepository.save(entity);
    }

    public void deleteNombre(String nombreCurso) {
        cursoRepository.deleteNombre(nombreCurso);
    }
}
