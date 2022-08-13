package Login.BackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Home {
    @Id
    @Column(name = "idPersona",nullable = false)
    private Long idPersona;

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }
    public String Bienvenidos;
    public String  Titulo;
    public String Nombre;
}
