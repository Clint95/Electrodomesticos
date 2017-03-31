package electrodomestico;

/**
 * Clase Lavadora
 * esta clase almacena los datos de este tipo de electrodomestico y calcula
 * su precio final sobreescribiendo el metodo madre 
 * @author Juan Ricardo Rodriguez Campos
 * @version 1.0.0
 * @since Electrodomesticos 1.0.0
 */
public class Lavadora extends Electrodomestico implements IElectrodomestico{
    /*
    * constante de CARGA que esta definida en el enunciado
    */
    private final static int CARGA=5;
  
    /*
    * atributo carga, unico atributo propia de esta clase
    */
    private int carga;  
    /**
     * Contructor
     */
    public Lavadora(){
        this(PRECIOBASE, PESO, CONSUMOENERGETICO, COLOR, CARGA);
    }
  
    /**
     * Constructor 2
     * @param precioBase
     * @param peso
     */
    public Lavadora(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICO, COLOR, CARGA);
    }
  
    /**
     * Constructor 3 
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param carga
     */
    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase,peso, consumoEnergetico,color);
        this.carga=carga;
    }
    
    /**
     *  metodo get que retorna el valor carga
     * @return carga
     */
    public int getCarga() {
        return carga;
    }
  
    /**
     * Sobreescribe el metodo precioFinal de la madre 
     * @return precio final de la lavadora
     */
    @Override
    public double precioFinal(){
        double incremento=super.precioFinal();
  
        //valor añadido para el calculo
        if (carga>30){
            incremento=incremento+50;
        }
        return incremento;
    }
    
//Fin de la clase Lavadora
    
}