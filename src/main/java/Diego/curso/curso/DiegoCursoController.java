package Diego.curso.curso;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody; // Importación correcta de @RequestBody
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/cursos")
public class DiegoCursoController {
    @Autowired
    private DiegoCursoService cursoService;

    @GetMapping("/")
    public ResponseEntity<List<DiegoCurso>> getAll() {
        List<DiegoCurso> cursos = cursoService.findAll();
        return new ResponseEntity<>(cursos, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<DiegoCurso> createCurso(@RequestBody DiegoCurso curso) {
        DiegoCurso createdCurso = cursoService.diegoInsert(curso);
        return new ResponseEntity<>(createdCurso, HttpStatus.CREATED);
    }

    @DeleteMapping("/{nombre}/")
    public ResponseEntity<Void> deleteCursoNombre(@PathVariable String nombre) {
        cursoService.deleteNombre(nombre);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
