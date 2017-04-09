package test;

import junit.framework.TestCase;
import lombok.Getter;
import martinez.rillo.victor.modelo.beans.AnimalBean;
import martinez.rillo.victor.modelo.repository.AnimalRepository;
import org.junit.Test;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 02/04/2017 Hora: 11:40
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
public class AnimalBeanTest {
    private AnimalBean animalBean;

    @Test
    public void generarAnimal(){
        animalBean = new AnimalBean();
        animalBean.setNombre("Nube");
        animalBean.setTipo(AnimalBean.TipoAnimal.PERRO);
        animalBean.setEstado(AnimalBean.EstadoAnimal.ADOPCION);
        animalBean.setDescripcion("Perro bipolar pero cariñoso.");
        animalBean.setEdad(5);
        animalBean.setRaza("Mestizo");
        animalBean.setLocalizacion(LocalizacionBeanTest.generarLocalizacionSt());
    }

    public static AnimalBean generarAnimalSt(){
        AnimalBean animalBean = new AnimalBean();
        animalBean = new AnimalBean();
        animalBean.setNombre("Nube");
        animalBean.setTipo(AnimalBean.TipoAnimal.PERRO);
        animalBean.setEstado(AnimalBean.EstadoAnimal.ADOPCION);
        animalBean.setDescripcion("Perro bipolar pero cariñoso.");
        animalBean.setEdad(5);
        animalBean.setRaza("Mestizo");
        animalBean.setLocalizacion(LocalizacionBeanTest.generarLocalizacionSt());

//        AnimalRepository animalRepository = new
        return animalBean;
    }
}
