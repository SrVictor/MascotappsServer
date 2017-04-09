package martinez.rillo.victor.controlador;

import martinez.rillo.victor.modelo.beans.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase creada por: Víctor Rillo Martínez
 * Día: 01/04/2017 Hora: 20:39
 * Proyecto: MascotappsServer
 * Clase:
 * <p>
 * Comentario:
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hola");
//
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mascotapps");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        UsuarioBean usuario = new UsuarioBean();
        usuario.setNombre("NombreEnviado");
        usuario.setPrimerApellido("Primer APP");
        usuario.setCorreo("correo@email.com");
        em.persist(usuario);
        usuario = em.createQuery("Select a From Usuarios a where a.id = 1",UsuarioBean.class).getSingleResult();

        UsuarioBean usuario2 = new UsuarioBean();
        usuario.setNombre("NombreRecibido");
        usuario.setPrimerApellido("Primer APP");
        usuario.setCorreo("correo@email.com");
        em.persist(usuario2);
        usuario2 = em.createQuery("Select a From Usuarios a where a.id = 2",UsuarioBean.class).getSingleResult();

        ChatBean chat = new ChatBean();
        List<UsuarioBean> usuarios = new ArrayList<>();
        usuarios.add(usuario);
        usuarios.add(usuario2);
        chat.setLusuarios(usuarios);
        em.persist(chat);
        chat = em.createQuery("Select a From Chat a where a.id = 1",ChatBean.class).getSingleResult();


        MensajeBean mensaje = new MensajeBean();
        mensaje.setFecha(new Date());
        mensaje.setHora(new Date());
        mensaje.setMensaje("Este es un mensaje de prueba");
        mensaje.setUsuarioEmisor(usuario);
        mensaje.setChat(chat);
        em.persist(mensaje);
        mensaje = em.createQuery("Select a From Mensajes a where a.id = 1",MensajeBean.class).getSingleResult();
//
//        AnimalBean animalBean = new AnimalBean();
//        animalBean.setTipo(AnimalBean.TipoAnimal.PERRO);
//        animalBean.setTamano(AnimalBean.TamanoAnimal.MEIDANO);
//        animalBean.setEstado(AnimalBean.EstadoAnimal.ENCONTRADO);
//
//        LocalizacionBean localizacionBean = new LocalizacionBean();
//        localizacionBean.setProvincia("Zaragoza");
//        localizacionBean.setLocalidad("Zaragoza");
//        em.persist(localizacionBean);
//
//        localizacionBean = em.createQuery("Select a From Localizaciones a where a.provincia = 'Zaragoza'",LocalizacionBean.class).getSingleResult();
//        animalBean.setLocalizacion(localizacionBean);
//        em.persist(animalBean);
//        em.getTransaction().commit();
//
//        animalBean = em.createQuery("Select a From Animales a where a.tipo = "+ AnimalBean.TipoAnimal.PERRO.getId(),AnimalBean.class).getSingleResult();
//
//        em.getTransaction().begin();
//
//        UsuarioBean usuarioBean = new UsuarioBean();
//        usuarioBean.setNombre("Prueba");
//        em.persist(usuarioBean);
//        List<AnimalBean> animales = new ArrayList<>();
//        animales.add(animalBean);
//        AnimalBean animal2= new AnimalBean();
//        animal2.setEstado(AnimalBean.EstadoAnimal.ENCONTRADO);
//        animal2.setTipo(AnimalBean.TipoAnimal.GATO);
//        animal2.setNombre("gatito");
//        em.persist(animal2);
//        animal2 = em.createQuery("Select a From Animales a where a.tipo = "+ AnimalBean.TipoAnimal.GATO.getId(),AnimalBean.class).getSingleResult();
//        animales.add(animal2);
//        usuarioBean.setAnimales(animales);
//        em.persist(usuarioBean);
        em.getTransaction().commit();
//
//        UsuarioBean usuarioBean2 = new UsuarioBean();
//        usuarioBean2 = em.createQuery("Select a From Usuarios a where a.id = 1",UsuarioBean.class).getSingleResult();

    }
}
