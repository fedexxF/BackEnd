package Login.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @Column(name = "idPersona",nullable = false)
    private Long idPersona;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    public String descripcion1;
    public String descripcion2;
    public String descripcion3;
    public String descripcion4;
    public String descripcion5;

}
