package martinez.rillo.victor.modelo.beans;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 01/04/2017 Hora: 21:32
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
@Entity(name = "Localizaciones")
@Getter
@Setter
public class LocalizacionBean {
    @GeneratedValue(strategy= GenerationType.IDENTITY)@Id
    private Long id;
    @Size(max = 20)  private String provincia;
    @Size(max = 20)  private String localidad;
    private Integer codPostal;
    @Size(max = 30)  private String direccion;
    private Double latitud;
    private Double longitud;
    @NotNull private TipoLocalizacion tipo;

    public enum TipoLocalizacion{
        ANIMAL(0),USUARIO(1),PROTECTORA(2);
        private int id;

        TipoLocalizacion(int anId) {
            id = anId;
        }

        public int getId() {
            return id;
        }
    }
}
