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
 * Día: 07/04/2017 Hora: 21:34
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
@Entity(name = "Chat")
@Getter
@Setter
public class ChatBean {
    @GeneratedValue(strategy= GenerationType.IDENTITY)@Id
    private Long id;
    @ManyToMany @JoinTable(name = "chatsUsuarios", joinColumns = {@JoinColumn(name = "idChat", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "idUsuario", referencedColumnName = "id")}) private List<UsuarioBean> lusuarios;
    }