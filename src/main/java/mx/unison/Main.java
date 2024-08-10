package mx.unison;

/* Contar cuantos códigos postales corresponden a asentamientos rurales
y cantos a asentamientos rurales
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader archivoFisico = new FileReader("codigos_postales.csv");
        BufferedReader archivoLogico = new BufferedReader(archivoFisico);
        String registro = null;
        int contadorUrbano=0;
        int contadorRural=0;
        String campos[];

        while ( (registro = archivoLogico.readLine()) != null ) {
            campos = registro.split(",");
            if (campos[2].equalsIgnoreCase("urbano")) {
                contadorUrbano++;
            }else if (campos[2].equalsIgnoreCase("rural")) {
                contadorRural++;
            }
        }
        archivoLogico.close();
        archivoFisico.close();
        System.out.println("Existen "+contadorUrbano+ " codigos postales que pertenecen a la zona Urbana");
        System.out.println("Existen "+contadorRural+" codigos postales que pertenecen a la zona Rural");


    }
}