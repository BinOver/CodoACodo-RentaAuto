
package RentaAutos;

public class EmpresaAlquilerVehiculos {
    private String cif;
    private String nombre;
    private String paginaWeb;
    private int totalClientes;
    private Cliente[] clientes;
    private int totalVehiculos;
    private Vehiculo[] vehiculos;
    private int totalAlquiler;
    private VehiculoAlquilado[] alquileres;
 
//Consltructor
    public EmpresaAlquilerVehiculos(String cif, String nombre, String paginaWeb){
        this.cif = cif;
        this.nombre=nombre;
        this.paginaWeb = paginaWeb;
        this.totalClientes = 0;
        this.clientes = new Cliente[50];
        this.totalVehiculos = 0;
        this.vehiculos = new Vehiculo[50];
        this.totalAlquiler = 0;
        this.alquileres = new VehiculoAlquilado[100];
    }

//Setters
    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

//Getters
    public String getCif() {
        return cif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public int getTotalVehiculos() {
        return totalVehiculos;
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public int getTotalAlquiler() {
        return totalAlquiler;
    }

    public VehiculoAlquilado[] getAlquileres() {
        return alquileres;
    }  
  
//Metodos
    public void registrarCliente(Cliente cliente){
        this.clientes[this.totalClientes] = cliente;
        this.totalClientes++;
    }
    
    public void registrarVehiculo(Vehiculo vehiculo){
        this.vehiculos[this.totalVehiculos] = vehiculo;
        this.totalVehiculos++;
    }
    
    public void imprimirClientes(){
        System.out.println("NIF cliente\tNombre\n");
        
        for(int i=0;i<this.totalClientes;i++){
            System.out.println(clientes[i].getAtributos());
        }
    }
    
    public void imprimirVehiculos(){
        System.out.print("Matricula\tModelo " + "\tImporte Disponible\n");
        
        for(int i=0; i<this.totalVehiculos;i++) {
            System.out.println(vehiculos[i].getAtributos());
        }
    }
}
