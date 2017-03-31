package electrodomestico;
/**
 * Clase Electrodomestico
 *
 * esta es la clase madre del proyecto y contiene
 * la informacion basica de los electrodomesticos
 * @author Juan Ricardo Rodriguez Campos
 * @version 1.0.0
 * @since Electrodomesticos 1.0.0
 */
public class Electrodomestico {
  /**
  * Declaracion de constantes definadas en el enunciado 
  */
    protected final static String COLOR="blanco";
 
    protected final static char CONSUMOENERGETICO='F';

    protected final static double PRECIOBASE=100;

    protected final static double PESO=5;
    /**
    * Atributos de la clase que se requieren por el enunciado del proyecto
    */
    protected double precioBase;
   
    protected String color;

    protected char consumoEnergetico;
  
    protected double peso;
    
    /**
    * Contructor por defecto
    */
    public  Electrodomestico(){
        this(PRECIOBASE, PESO, CONSUMOENERGETICO, COLOR);
    }
   
    /**
     * Contructor 1
     * @param precioBase 
     * @param peso 
     */
    public Electrodomestico(double precioBase, double peso){
        this(precioBase, peso, CONSUMOENERGETICO, COLOR);
    }
   
    /**
     * Constructor 2
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     */
    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){
        this.precioBase=precioBase;
        this.peso=peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
    }
    
    //Metodos get que retornan la informacion del electrodomestico
    //precioBase,color,consumoEnergetico
    
    /**
     * 
     * @return preciobase
     */
    public double getPrecioBase() {
        return precioBase;
    }
    /**
     * 
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * 
     * @return consumoenergetico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    /**
     * 
     * @return peso
     */
    public double getPeso() {
        return peso;
    }
    
    /**
    * este metodo privado de la clase eletrodomestico valida el color insertado 
    */
    private void comprobarColor(String color){
   
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean encontrado=false;
  
        for(int i=0;i<colores.length && !encontrado;i++){
            //comparacion que determiona si es igual a los colores definidos  
            if(colores[i].equals(color)){
                encontrado=true;
            }
              
        }
          
        if(encontrado){
            this.color=color;
        }else{
            this.color=COLOR;
        }
          
          
    }
      
    /**
     * Comprueba el consumo energetico del electrodomestico validando
     * que solo se ingrese letras mayusculas A,B,C,D,E,F
     * @param consumoEnergetico
     */
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMOENERGETICO;
        }
          
    }
    /**
     * metodo que calcula el precio final del electrodomestico con un ciclo switch
     * para capturar la categoria de consumo de energia.
     * @return precioBase + incremento
     */
    public double precioFinal(){
        double incremento=0;
        switch(consumoEnergetico){
            case 'A':
                incremento=incremento+100;
                break;
            case 'B':
                incremento=incremento+80;
                break;
            case 'C':
                incremento=incremento+60;
                break;
            case 'D':
                incremento=incremento+50;
                break;
            case 'E':
                incremento=incremento+30;
                break;
            case 'F':
                incremento=incremento+10;
                break;
        }
        if(peso>=0 && peso<19){
            incremento=incremento+10;
        }else if(peso>=20 && peso<49){
            incremento=incremento+50;
        }else if(peso>=50 && peso<=79){
            incremento=incremento+80;
        }else if(peso>=80){
            incremento=incremento+100;
        }
   
        return precioBase+incremento;
    }

    //Fin de la clase Electrodomestico
   
}
