package martinez.rillo.victor.modelo.beans;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 02/04/2017 Hora: 11:17
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
@Entity(name = "Mensajes")
@Getter
@Setter
public class MensajeBean {
    @GeneratedValue(strategy= GenerationType.IDENTITY)@Id
    private Long id;
    @Size(max = 120) @NotNull
    private String mensaje;
    @ManyToOne @JoinTable(name = "mensajesUsuarios", joinColumns = {@JoinColumn(name = "idMensaje", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "idUsuario", referencedColumnName = "id")}) private UsuarioBean usuarioEmisor;
    @ManyToOne @JoinTable(name = "mensajesChats", joinColumns = {@JoinColumn(name = "idMensaje", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "idChat", referencedColumnName = "id")}) private ChatBean chat;
    @NotNull  private Date fecha;
    @NotNull @Type(type="timestamp") private Date hora;
    @NotNull private TipoEstado estado;

    public enum TipoEstado{
        SINLEER(0),LEIDO(1);
        private int id;

        TipoEstado(int anId) {
            id = anId;
        }

        public int getId() {
            return id;
        }
    }
}
