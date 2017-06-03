
package EntradaSalida;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintWriter;
import java.util.*;

public class Archivo {
    public static void main (String[] args) throws IOException {
        int [][] numeros = {{1, 2, 3, 4, 5},
                            {6, 7, 8, 9, 10},
                            {11, 12, 13, 14, 15},
                            {16, 17, 18, 19, 20},
                            {21, 22, 23, 24, 25}
        };
        
        String idFichero = "./Numeros.txt"; //ubicacion y nombre de archivo
        
        PrintWriter ficheroSalida = new PrintWriter(idFichero);
        
        for (int i=0; i<numeros.length; i++){
            for (int j=0; j<numeros[i].length; j++){
               ficheroSalida.print(numeros[i][j] + ","); 
            }
            ficheroSalida.println("");
        }
        ficheroSalida.close();
        
        File ficheroEntrada = new File(idFichero);
        
        if (ficheroEntrada.exists()){
            Scanner datosFichero = new Scanner(ficheroEntrada);
            System.out.println("Numeros del Fichero");
            while (datosFichero.hasNext()){
                StringTokenizer numerosFichero = new 
                    StringTokenizer(datosFichero.next(),",");
                while (numerosFichero.hasMoreTokens()){
                    System.out.print(numerosFichero.nextToken() + "\t");
                }
                System.out.println("");
            }
        datosFichero.close();
        }else {
          System.out.println("El fichero no existe");
        }
    }
}
