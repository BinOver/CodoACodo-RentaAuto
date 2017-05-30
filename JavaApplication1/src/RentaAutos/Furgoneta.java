package RentaAutos;


public class Furgoneta extends Vehiculo{
    private int carga;
    private int volumen;
    
    public Furgoneta (String matricula,
                        String marca,
                        String modelo,
                        String color,
                        double tarifa,
                        int carga,
                        int volumen){
        super(matricula, marca, modelo, color, tarifa);
        this.carga = carga;
        this.volumen = volumen;
    }
    
//Setters
    public void setCarga(int carga){
        this.carga = carga;
    }
    
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    
//Getters
    public int getCarga(){
        return this.carga;
    }
    
    public int getVolumen(){
        return this.volumen;
    }
    
    public String getAtributos(){
        return super.getAtributos() + //Polimorfismo
                " Carga (kg): " + this.carga +
                " Volumen (m3): " + this.volumen;
    }
}
