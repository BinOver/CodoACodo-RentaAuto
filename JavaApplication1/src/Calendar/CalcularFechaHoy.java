
package Calendar;

import java.util.Calendar;

public class CalcularFechaHoy {
    
    public static void main (String[] args){
        int edad, diaHoy, mesHoy, anioHoy;
        
        diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mesHoy = Calendar.getInstance().get(Calendar.MONTH);
        anioHoy = Calendar.getInstance().get(Calendar.YEAR);
        
        
        System.out.println("\n\n\nLa fecha de hoy es: " + diaHoy + "/" + mesHoy + "/" + anioHoy + "\n\n\n");
    }
    
}
