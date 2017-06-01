package RentaAutos;


public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;
    
    
// Constructor default
    public Vehiculo(String matricula, String marca, String modelo, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = 0.0;
        this.disponible = false;
    }

// Constructor Sobrecargado
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }

// Setters 
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
//Getters
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public String getAtributos() {
        return "Matricula: " + this.matricula + 
                " \nMarca: " + this.marca + " " + this.modelo + 
                " \nColor: " + this.color + " Tarifa: " + this.tarifa + 
                " \nDisponible: " + this.disponible +"";
     }
    
    public String getAtributosVehiculo() {
        return this.matricula + "\t" +
                    this.marca + " " + this.modelo + "\t" +
                    this.color + "\t" +
                    this.tarifa + "\t" +
                    this.disponible +"";
     }
}
