package Login.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @Column(name = "idPersona",nullable = false)
    private Long idPersona;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    public String Universidad;
    public String  UniversidadFecha;
    public String UniversidadLugar;
    public String  Curso1;
    public String Curso1Fecha;
    public String Curso1Lugar;
    public String Curso2;
    public String Curso2Fecha;
    public String  Curso2Lugar;
    public String  Colegio;
    public String  ColegioFecha;
    public String  ColegioLugar;
    public String descripcion;
    public String descripcion1;
    public String descripcion2;
}


