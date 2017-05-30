package RentaAutos;


public class Turismo extends Vehiculo{
    private int puertas;
    private boolean marchaAutomatica;
    
//Constructor
    public Turismo(String matricula,
                    String marca,
                    String modelo,
                    String color,
                    double tarifa,
                    int puertas,
                    boolean marchaAutomatica){
        super(matricula, marca, modelo, color, tarifa);
        this.puertas = puertas;
        this.marchaAutomatica = this.marchaAutomatica;
    }

//Setters
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
    
    public void setMarchaAutomatica(boolean marchaAutomatica){
        this.marchaAutomatica = marchaAutomatica;
    }

//Getters
    public int getPuertas(){
        return this.puertas;
    }
    
    public boolean isMarchasAutomaticas(){
        return this.marchaAutomatica;
    }
    
    public String getAtributos(){
        return super.getAtributos() + //Polimorfismo
                " Puertas: " + this.puertas +
                " Marcha automatica: " + this.marchaAutomatica;
    }
}
