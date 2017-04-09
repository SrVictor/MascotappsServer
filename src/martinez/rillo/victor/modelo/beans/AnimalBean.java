package martinez.rillo.victor.modelo.beans;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 01/04/2017 Hora: 21:35
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
@Entity(name = "Animales")
@Getter
@Setter
public class AnimalBean {
    @GeneratedValue(strategy= GenerationType.IDENTITY)@Id
    private Long id;
    @Size(max = 20)  private String nombre;
    @NotNull private TipoAnimal tipo;
    @Size(max = 20)  private String otro;
    @Size(max = 200)  private String descripcion;
    @Size(max = 15)  private String raza;
    private Integer edad;
    private TamanoAnimal tamano;
    @NotNull private EstadoAnimal estado;
//    TODO: @NOTNUTLL
    private byte[] foto;
//    TODO: NUNCA AÑADIR UNO NUEVO, MEJOR EDITAR EL QUE HAY YA
    @OneToOne(cascade = CascadeType.REFRESH)
    private LocalizacionBean localizacion;
    @NotNull private Date fecha;

    public enum TipoAnimal{
        OTRO(0), PERRO(1), GATO(2), PAJARO(3), ERIZO(4), HUERON(5);
        private int id;

        TipoAnimal(int anId) {
            id = anId;
        }

        public int getId() {
            return id;
        }
    }

    public enum TamanoAnimal{
        PEQUENO(0), MEIDANO(1), GRANDE(2);
        private int id;

        TamanoAnimal(int anId) {
            id = anId;
        }

        public int getId() {
            return id;
        }
    }

    public enum EstadoAnimal{
        PERDIDO(0), ENCONTRADO(1), RESUELTO(2), ADOPCION(3), ADOPTADO(4) ;
        private int id;

        EstadoAnimal(int anId) {
            id = anId;
        }

        public int getId() {
            return id;
        }
    }


}
