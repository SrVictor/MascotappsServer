package martinez.rillo.victor.modelo.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 02/04/2017 Hora: 11:15
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
@Entity(name = "DatosSesiones")
@Getter
@Setter
public class DatosSesionBean {

    @GeneratedValue(strategy= GenerationType.IDENTITY)@Id
    private Long id;
    @NotNull@OneToOne
    private UsuarioBean usuario;
    @Size(max = 40) @NotNull
    private String contrasena;
    @Size(max = 20) @NotNull  private String nombreUsuario;
}
