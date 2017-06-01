package RentaAutos;

public class RentaAutos {

    public static void main(String[] args) {
        
        
//Declaracion e instanciacion de Objetos
        //Vehiculo Supercalse Default
        Vehiculo miVehiculo = new Vehiculo ("4050 ABJ", 
                                            "VM", 
                                            "GTI", 
                                            "Blanco", 
                                            100.0);
        //Vehiculo Supercarga
        Vehiculo miVehiculoSuper = new Vehiculo ("4051 JBA", 
                                            "VM", 
                                            "GTI", 
                                            "Negro");
        //Turismo Hereda de Vehiculo
        Turismo miTurismo = new Turismo ("4060 TUR",
                                         "Skoda",
                                         "Fabia",
                                         "Blanco",
                                         90.0,
                                         2,
                                         false);
        //Turismo con Conversion ascendente de tipos
        Vehiculo miTurismoConv = new Turismo ("4061 TURC",
                                         "Skoda",
                                         "Fabia",
                                         "Violeta",
                                         950.0,
                                         3,
                                         true);
        //Turismo con Conversion descendente de tipos
        Turismo miTurismoCDes = (Turismo) miTurismoConv; 
        //Deportivo Hereda de Vehiculo
        Deportivo miDeportivo = new Deportivo ("4070 DEP",
                                               "Ford",
                                               "Mustang",
                                               "Rojo",
                                               150.0,
                                               2000);
        //Furgoneta Hereda de Vehiculo
        Furgoneta miFurgoneta = new Furgoneta ("4080 FUR",
                                               "Fiat",
                                               "Ducato",
                                               "Azul",
                                               80.0,
                                               1200,
                                               8);
        //Cliente para Extension de clases
        Cliente cliente1 = new Cliente ("30435624x", 
                                        "Juan", 
                                        "Perez");
        //VehiculoAlquilado extension de cliente1 y miVehiculo
        VehiculoAlquilado alquiler1 = new VehiculoAlquilado(cliente1, 
                                                            miVehiculo,
                                                            11,
                                                            11,
                                                            2011,
                                                            2);
        //EmpresaAlquilerVehiculos instanciacion (Array)
        EmpresaAlquilerVehiculos easydrive = new EmpresaAlquilerVehiculos("A-28-187189", "easy drive", "www.easydrive.com");
        easydrive.registrarCliente(new Cliente("X5618927C", "Juan", "Gonzalez Lopez"));
        easydrive.registrarCliente(new Cliente("Z75618927C","Luis","Fernandez"));
        
        easydrive.registrarVehiculo(new Turismo("4060 TUR", "Skoda", "Fabia", "Blanco", 90.0, 2, false));
        easydrive.registrarVehiculo(new Deportivo("4070 DEP", "Ford", "Mustang", "Rojo", 150.0, 2000));
        
//Impresion Atributos
    System.out.print("\nVehiculo:\n" + miVehiculo.getAtributos() + "\n");
    //Sobrecarga de constructor Vehiculo
    System.out.print("\nVehiculo:\n" + miVehiculoSuper.getAtributos() + "\n");
    //Herencia de Vehiculo
    System.out.print("\nTurismo:\n" + miTurismo.getAtributos() + "\n");
    System.out.print("\nDeportivo:\n" + miDeportivo.getAtributos() + "\n");
    System.out.print("\nFurgoneta:\n" + miFurgoneta.getAtributos() + "\n");
    //Herencia con conversion de tipo
    System .out.print("\nFurgoneta:\n" + miTurismoConv.getAtributos() + "\n");
    System .out.print("\nFurgoneta:\n" + miTurismoCDes.getAtributos() + "\n");
    //Impresion Extension de clase
    System.out.println("\nVehiculo alquilado:");
    System.out.println("Cliente: " + 
                        alquiler1.getCliente().getNif() + " " +
                        alquiler1.getCliente().getNombre() + " " +
                        alquiler1.getCliente().getApellidos());
    System.out.println("Vehiculo: " + 
                        alquiler1.getVehiculo().getMatricula());
    ///Impresion Array easydrive
    System.out.println("\nClientes de la empresa:");
    easydrive.imprimirClientes();
    System.out.println("\nVehiculos de la empresa:");
    easydrive.imprimirVehiculos();
    } 
}
