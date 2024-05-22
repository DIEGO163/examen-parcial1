package Diego.curso.estudiante;

import java.sql.Date;

import Diego.curso.curso.DiegoCurso;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class DiegoEstudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private Integer edad;
    private Date fechaNacimiento;
    private Boolean activo;

    @ManyToOne
    private DiegoCurso cursoDiego;
}
