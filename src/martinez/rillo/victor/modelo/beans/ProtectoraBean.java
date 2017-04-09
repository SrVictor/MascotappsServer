package martinez.rillo.victor.modelo.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 02/04/2017 Hora: 11:22
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
@Entity(name = "Protectoras")
@Getter
@Setter
public class ProtectoraBean {
    @GeneratedValue(strategy= GenerationType.IDENTITY)@Id
    private Long id;

    @NotNull @Size(max = 20)  private String nombre;
    @NotNull @OneToOne private LocalizacionBean localizacion;
    private byte[] imagen;
    @OneToMany @JoinTable(name = "animalesProtectoras", joinColumns = {@JoinColumn(name = "idProtectora", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "idAnimal", referencedColumnName = "id")}) private List<AnimalBean> lAnimal;
    @OneToMany @JoinTable(name = "usuariosProtectoras", joinColumns = {@JoinColumn(name = "idProtectora", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "idUsuario", referencedColumnName = "id")}) private List<UsuarioBean> lUsuario;
    @OneToOne private UsuarioBean usuarioAdministrador;
}
