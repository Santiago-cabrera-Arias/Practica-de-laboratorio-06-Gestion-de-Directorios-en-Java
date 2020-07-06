package ec.edu.ups.controladorDirectorio;

import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControladorDirectorio {

    private String ruta;
    private File archivo;
    private File[] archivos;

    public ControladorDirectorio() {

    }

    //Creamos el directorio
    public void crearDirectorio(String nombre, String ruta) {

        try {

            archivo = new File(nombre, ruta);
            archivo.mkdir();//se crea con el mkdir

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    //Eliminar Directorio
    public void eliminar(String eliminarDirectorio) {
        archivo = new File(eliminarDirectorio);
        File[] archivosLista = archivo.listFiles();
        if (archivo.isDirectory()) {
            for (int i = 0; i < archivosLista.length; i++) {
                if (archivosLista[i].isDirectory()) {
                    eliminar(archivosLista[i].toString());
                } else {
                    archivosLista[i].delete();
                }
            }
        }
        archivo.delete();
    }

    //le da un nuevo nombre al directorio
    public void renombrar(String nombre, String nuevo) {
        archivo = new File(nombre);
        if (archivo.exists()) {
            archivo.renameTo(new File(nuevo));
        }
    }

    //lista el directorio al introducir la ruta
    public java.util.List<String> listarDirectorios(File listDirectorio) {

        List<String> lista = new ArrayList<>();
        archivo = listDirectorio;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {
            //isDirectory comprueba si es una carpeta o no
            if (directorio.isDirectory()) {
                if (!directorio.isHidden()) {

                    lista.add(directorio.getName());
                }
            }
        }
        return lista;
    }
 
    //listar Archivos
    public List<String> listarArchivos(File buscarArchivos) {
        List<String> lista = new ArrayList<>();
        archivo = buscarArchivos;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {
            if (!directorio.isDirectory()) {
                if (!directorio.isHidden()) {
                    lista.add(directorio.getName());
                }
            }
        }

        return lista;

    }
  

    public java.util.List<String> listarArchivosOcultos(File archivosOcultos) {

        List<String> lista = new ArrayList<>();

        Arrays.sort(archivos);

        archivo = archivosOcultos;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {

            if (!directorio.isDirectory()) {

                if (directorio.isHidden()) {

                    lista.add(directorio.getName());

                }
            }

        }

        return lista;

    }

    public java.util.List<String> listarDirectoriosOcultos(File directorioOculto) {

        List<String> lista = new ArrayList<>();
        archivo = directorioOculto;
        archivos = archivo.listFiles();

        for (File directorio : archivos) {

            if (directorio.isDirectory()) {

                if (directorio.isHidden()) {

                    lista.add(directorio.getName());

                }
            }

        }

        return lista;
    }

    public Double tamañoDeDirectorio(File informacionDeArchivo) {
        File[] nombreDeArchivos = informacionDeArchivo.listFiles();
        Double tamaño = 0.00;
        if (informacionDeArchivo.isDirectory()) {
            for (int i = 0; i < nombreDeArchivos.length; i++) {
                if (nombreDeArchivos[i].isFile()) {
                    tamaño += ((nombreDeArchivos[i].length() / 1024.0) / 1024.0);
                } else {
                    tamaño += tamañoDeDirectorio(nombreDeArchivos[i]);
                }
            }
        } else {
            tamaño = ((informacionDeArchivo.length() / 1024.0) / 1024.0);
        }

        return tamaño;
    }

    public String mostrarInformacion(File informacionDeArchivos) {

        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String datos = fecha.format(informacionDeArchivos.lastModified());

        return datos;
    }

}
