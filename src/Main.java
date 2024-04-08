import uy.edu.ucu.aed.ManejadorArchivosGenerico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        uy.edu.ucu.aed.ManejadorArchivosGenerico manejadorArchivosGenerico = new ManejadorArchivosGenerico();
        for (String s : manejadorArchivosGenerico.leerArchivo("src/sucursales.txt")) {
            System.out.println(s);
        }
    }
}