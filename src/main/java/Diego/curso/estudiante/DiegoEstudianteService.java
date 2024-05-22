package Diego.curso.estudiante;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class DiegoEstudianteService {
    @Autowired
    private DiegoEstudianteRepository estudianteRepository;

    public List<DiegoEstudiante> findAll() {
        Iterable<DiegoEstudiante> iterable = estudianteRepository.findAll();
        return StreamSupport.stream(iterable.spliterator(), false)
                            .collect(Collectors.toList());
    }
    public DiegoEstudiante insert(DiegoEstudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}
