package RentaAutos;


public class Deportivo extends Vehiculo{
    private int cilindrada;

//Constructor
    public Deportivo(String matricula,
                        String marca,
                        String modelo,
                        String color,
                        double tarifa,
                        int cilindrada){
        super(matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }

//Setters
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
    
//Getters
    
    public int getCilindrada(){
        return this.cilindrada;
    }
    
    public String getAtributos(){
        return super.getAtributos() + //Polimorfismo
                " Cilindrada (cm3): " + this.cilindrada;
    }
}
