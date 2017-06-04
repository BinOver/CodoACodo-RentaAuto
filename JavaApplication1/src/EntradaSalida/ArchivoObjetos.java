
package EntradaSalida;

import java.io.*;


public class ArchivoObjetos {
    
    public static void main(String[] args) {
        
        //Nombre y Ubicacion de archivo
        String nombreFichero = "./ArchivoObjeto.txt";

        try{
            //Escribir objetos en fichero
            FileOutputStream ficheroSalida = new FileOutputStream(nombreFichero);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
            
            objetoSalida.writeObject(new ArchivoObjetoPersona("55287188B", "Maria", "Ruiz Ramos"));
            objetoSalida.writeObject(new ArchivoObjetoPersona("40302010A", "Juan", "Gonzalez Lopez"));
            
            //Leer objetos desde fichero
            FileInputStream ficheroEntrada = new FileInputStream(nombreFichero);
            ObjectInputStream objetoEntrada = new ObjectInputStream(ficheroEntrada);
            
            ArchivoObjetoPersona p1 = (ArchivoObjetoPersona) objetoEntrada.readObject();
            ArchivoObjetoPersona p2 = (ArchivoObjetoPersona) objetoEntrada.readObject();
            
            //Cerrado de flujo
            objetoEntrada.close();
            
            //Imprimir Objetos
            System.out.println("DNI\t Nombre");
            System.out.println(p1.getAtributos());
            System.out.println(p2.getAtributos());
           
        }catch (FileNotFoundException e){
            System.out.println("El archivos no existe");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }   
}
