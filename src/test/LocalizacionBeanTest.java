package test;

import lombok.Getter;
import martinez.rillo.victor.modelo.beans.AnimalBean;
import martinez.rillo.victor.modelo.beans.LocalizacionBean;
import org.junit.Test;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 02/04/2017 Hora: 11:40
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
public class LocalizacionBeanTest {
    private LocalizacionBean localizacion;

    @Test
    public void generarLocalizacion(){
       localizacion = new LocalizacionBean();
       localizacion.setProvincia("Zaragoza");
       localizacion.setLocalidad("Zaragoza");
       localizacion.setCodPostal(50002);
       localizacion.setDireccion("Monasterio de Sigena Nº8 3ºB");
       localizacion.setLatitud(41.68);
       localizacion.setLongitud(-0.86);
       localizacion.setTipo(LocalizacionBean.TipoLocalizacion.ANIMAL);
    }

    public static LocalizacionBean  generarLocalizacionSt(){
        LocalizacionBean localizacionBean = new LocalizacionBean();
        localizacionBean.setProvincia("Zaragoza");
        localizacionBean.setLocalidad("Zaragoza");
        localizacionBean.setCodPostal(50002);
        localizacionBean.setDireccion("Monasterio de Sigena Nº8 3ºB");
        localizacionBean.setLatitud(41.68);
        localizacionBean.setLongitud(-0.86);
        localizacionBean.setTipo(LocalizacionBean.TipoLocalizacion.ANIMAL);
        return localizacionBean;
    }
}
