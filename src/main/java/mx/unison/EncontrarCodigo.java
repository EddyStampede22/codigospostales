package mx.unison;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EncontrarCodigo {
    public static void main(String[] args) throws IOException {
        FileReader archivoFisico = new FileReader("codigos_postales.csv");
        BufferedReader archivoLogico = new BufferedReader(archivoFisico);
        String registro = null;
        String campos[];
        for(String n : args){
            while ( (registro = archivoLogico.readLine()) != null ) {
                campos = registro.split(",");
                if(n.equalsIgnoreCase(campos[0])){
                    System.out.println(campos[2]);
                    break;
                }

            }
        }
        archivoLogico.close();
        archivoFisico.close();


    }
}
