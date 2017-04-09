package martinez.rillo.victor.modelo.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 01/04/2017 Hora: 21:05
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */

@Entity(name = "Usuarios")
@Getter
@Setter
public class UsuarioBean {
    @GeneratedValue(strategy= GenerationType.IDENTITY)@Id private Long id;
    @Size(max = 20) @NotNull  private String nombre;
    @Size(max = 20) @NotNull  private String primerApellido;
    @Size(max = 20)  private String segundoApellido;
    @Size(max = 20) @NotNull private String correo;
    @Size(max = 15)  private String telefono;
    @OneToMany @JoinTable(name = "animalesUsuarios", joinColumns = {@JoinColumn(name = "idUsuario", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "idAnimal", referencedColumnName = "id")}) private List<AnimalBean> lAnimal;
    private byte[] foto;

}
