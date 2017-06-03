
package EntradaSalida;

import java.util.Scanner; //Libreria Scanner para ingreso por teclado

public class EntradaDatosTeclado {
    
    public static void main (String args[]){
        
     String nombre;
     int diaNacimiento, mesNacimiento, anioNacimiento;
    
     //Inicializacion de instancia Scanner en entradaTeclado
     Scanner entradaTeclado = new Scanner(System.in);
    
     System.out.print("Nombre: ");
     nombre = entradaTeclado.nextLine(); //entrada por tecldo de String
     
     System.out.print("Dia de nacimiento: ");
     diaNacimiento = entradaTeclado.nextInt(); //entrada por teclado de Int
     
     System.out.print("Mes de nacimiento: ");
     mesNacimiento = entradaTeclado.nextInt(); //entrada por teclado de Int
     
     System.out.print("Año de nacimiento: ");
     anioNacimiento = entradaTeclado.nextInt(); //entrada por teclado de Int
     
     System.out.println ("Hola " + nombre + ", naciste el " + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento);
    } 
}
