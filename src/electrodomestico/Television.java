package electrodomestico;

/**
 * clase Television contiene la informacion heredada de la clase electrodomestico
 * junto con atributos y constantes propias para trabajar
 * @author Juan Ricardo Rodriguez Campos
 * @version 1.0.0
 * @since Electrodomesticos 1.0.0
 */
public class Television extends Electrodomestico implements IElectrodomestico{ 
    /**
     * constante de resolucion definida en el enunciado
     */
    private final static int RESOLUCION=20;  
    /**
     * atributos de la clase television
     */
    private int resolucion;

    private boolean sintonizadorTDT;
     
    /**
     * Constructor 
     */
    public Television(){
        this(PRECIOBASE, PESO, CONSUMOENERGETICO, COLOR, RESOLUCION, false);
    }
    /**
     * Constructor 2 
     * @param precioBase
     * @param peso
     */
    public Television(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICO, COLOR, RESOLUCION, false);
    }
  
    /**
     * Contructor 3
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     * @param resolucion
     * @param sintonizadorTDT
     */
    
    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }
    
    
    /**
     * Precio final de la television
     * @return preciofinal con el incremento
     */
    @Override
    
    public double precioFinal(){
        
        double incremento=super.precioFinal();
  
        //se añade la resolucion y sintnonizadorTDT para hacer los calculos
        if (resolucion>40){
            incremento=incremento+precioBase*0.3;
        }
        if (sintonizadorTDT){
            incremento=incremento+50;
        }
        return incremento;
    }
    //fin de la clase Television
}
