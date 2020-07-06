package ec.edu.ups.controladorDirectorio;

import java.io.File;
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
    public void crearDirectorio(String nombre) {

        try {

            archivo = new File(nombre);
            archivo.mkdir();//se crea con el mkdir

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    //Eliminar Directorio
    public void eliminarDirectorio(String nombre) {

        archivo = new File(nombre);
        if (archivo.exists()) {

            archivo.delete();

        }

    }

    //le da un nuevo nombre al directorio
    public void renombrar(String nuevo, String nombre) {

        archivo = new File(nombre);
        if (archivo.exists()) {

            archivo.renameTo(new File(nuevo));

        }

    }

  

}


