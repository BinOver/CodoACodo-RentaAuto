package RentaAutos;

public class RentaAutos {

    public static void main(String[] args) {
        
        
//Declaracion e instanciacion de Objetos
        Vehiculo miVehiculo = new Vehiculo ("4050 ABJ", 
                                                                    "VM", 
                                                                    "GTI", 
                                                                    "Blanco", 
                                                                    100.0);
        
        Turismo miTurismo = new Turismo ("4060 TUR",
                                                                    "Skoda",
                                                                    "Fabia",
                                                                    "Blanco",
                                                                    90.0,
                                                                    2,
                                                                    false);
        
        Deportivo miDeportivo = new Deportivo ("4070 DEP",
                                                                            "Ford",
                                                                            "Mustang",
                                                                            "Rojo",
                                                                            150.0,
                                                                            2000);
        
        Furgoneta miFurgoneta = new Furgoneta ("4080 FUR",
                                                                             "Fiat",
                                                                             "Ducato",
                                                                             "Azul",
                                                                             80.0,
                                                                             1200,
                                                                             8);
        
//Impresion Atributos
    System.out.print("\nVehiculo:\n" + miVehiculo.getAtributos() + "\n");
    System.out.print("\nTurismo:\n" + miTurismo.getAtributos() + "\n");
    System.out.print("\nDeportivo:\n" + miDeportivo.getAtributos() + "\n");
    System.out.print("\nFurgoneta:\n" + miFurgoneta.getAtributos() + "\n");
    }
    
}
