
package RentaAutos;

public class VehiculoAlquilado {
   private Cliente cliente;
   private Vehiculo vehiculo;
   private int diaAlquiler;
   private int mesAlquiler;
   private int anioAlquiler;
   private int totalDiaAlquiler;
   
   public VehiculoAlquilado(Cliente cliente, 
                            Vehiculo vehiculo, 
                            int diaAlquiler, 
                            int mesAlquiler, 
                            int anioAlquiler, 
                            int totalDiasAlquiler){
       this.cliente = cliente;
       this.vehiculo = vehiculo;
       this.diaAlquiler = diaAlquiler;
       this.mesAlquiler = mesAlquiler;
       this.anioAlquiler = anioAlquiler;
       this.totalDiaAlquiler=totalDiasAlquiler;
   }

//Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public int getAnioAlquiler() {
        return anioAlquiler;
    }

    public int getTotalDiaAlquiler() {
        return totalDiaAlquiler;
    }
    
//Setters
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setDiaAlquiler(int diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public void setMesAlquiler(int mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public void setAnioAlquiler(int anioAlquiler) {
        this.anioAlquiler = anioAlquiler;
    }

    public void setTotalDiaAlquiler(int totalDiaAlquiler) {
        this.totalDiaAlquiler = totalDiaAlquiler;
    }
    
   
   
}
