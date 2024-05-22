package Diego.curso.estudiante;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/estudiantes")
public class DiegoEstudianteController {
     @Autowired
    private DiegoEstudianteService estudianteService;

    @GetMapping("/")
    public ResponseEntity<List<DiegoEstudiante>> getAllProyectos() {
        List<DiegoEstudiante> estudiantes = estudianteService.findAll();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DiegoEstudiante> createEstudiante(@RequestBody DiegoEstudiante estudiante) {
        DiegoEstudiante createEstudiante = estudianteService.insert(estudiante);
        return new ResponseEntity<>(createEstudiante, HttpStatus.CREATED);
    }
}
