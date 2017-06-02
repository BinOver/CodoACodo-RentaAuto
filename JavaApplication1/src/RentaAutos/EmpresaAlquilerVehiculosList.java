
package RentaAutos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EmpresaAlquilerVehiculosList {
    private String cif;
    private String nombre;
    private String paginaWeb;
    private List <Cliente> clientes;
    private List <Vehiculo> vehiculos;
    private List <VehiculoAlquilado> alquileres;
    
    private int edad, diaHoy, mesHoy, anioHoy;
    
    public EmpresaAlquilerVehiculosList (String cif,
                                                                          String nombre,
                                                                          String paginaWeb){
        this.cif = cif;
        this.nombre = nombre;
        this.paginaWeb = paginaWeb;
        this.clientes = new ArrayList<Cliente>();
        this.vehiculos = new ArrayList<Vehiculo>();
        this.alquileres = new ArrayList<VehiculoAlquilado>();
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

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<VehiculoAlquilado> getAlquileres() {
        return alquileres;
    }
    
    private Cliente getCliente(String nif){
        for (Cliente c : this.clientes){
            if (c.getNif() == nif){
                return c;
            }
        }
        return null;
    }
    
    private Vehiculo getVehiculo(String matricula){
        for (Vehiculo v : this.vehiculos){
            if (v.getMatricula() == matricula){
                return v;
            }
        }
        return null;
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

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void setAlquileres(List<VehiculoAlquilado> alquileres) {
        this.alquileres = alquileres;
    }
    
//Metodos
    public void registrarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }
    
    public void registrarVehiculo(Vehiculo vehiculo) {
        this.vehiculos.add(vehiculo);
    }
    
    public void imprimirClientes(){
        System.out.println("NIF cliente\tNombre\tApellidos");
        for (Cliente c : this.clientes){
            System.out.println(c.getAtributosCliente());
        }
    }
    
    public void imprimirVehiculos(){
        System.out.println("Matricula\tModelo\t" + "\t\tColor" + "\tImporte Disponible");
        for(Vehiculo v : this.vehiculos){
            System.out.println(v.getAtributosVehiculo());
        }
    }
    
    public void alquilarVehiculo(String matricula, String nif, int dias){
        Cliente cliente = getCliente(nif);
        Vehiculo vehiculo = getVehiculo(matricula);
        diaHoy = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        mesHoy = Calendar.getInstance().get(Calendar.MONTH);
        anioHoy = Calendar.getInstance().get(Calendar.YEAR);
        if (vehiculo.isDisponible()){
            vehiculo.setDisponible(false);
            this.alquileres.add(new VehiculoAlquilado(cliente, vehiculo, diaHoy, mesHoy, anioHoy, dias));
        } 
    }
    
    public void recibirVehiculo(String matricula){
        Vehiculo vehiculo = getVehiculo(matricula);
        if (vehiculo != null)
                vehiculo.setDisponible(true);
    }
}
