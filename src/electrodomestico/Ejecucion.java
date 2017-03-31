package electrodomestico;
/**
 * esta clase contiene los campos de ejecucion del programa 
 * el array que se pide crear en el enunciado del proyecto junto con los datos asignados
 * en el.
 * @author Juan Ricardo Rodriguez Campos
 * @version 1.0.0
 * @since Electrodomesticos 1.0.0
 */
public class Ejecucion {
    // constructor 1
    public Ejecucion(){
        //inicio del metodo init para ejecutar el cuerpo del programa
        init();
    }
    // metodo que ejecuta el cuerpo del programa
    public void init(){
    Electrodomestico Electrodomesticos[]=new Electrodomestico[10];
   
        //Asignamos los valores a las posiciones del arreglo
        Electrodomesticos[0]=new Electrodomestico(300, 40, 'D', "negro") {};
        Electrodomesticos[1]=new Lavadora(150, 20);
        Electrodomesticos[2]=new Television(900, 80, 'E', "balnco", 40, false);
        Electrodomesticos[3]=new Electrodomestico() {};
        Electrodomesticos[4]=new Electrodomestico(200, 20, 'F', "verde") {};
        Electrodomesticos[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
        Electrodomesticos[6]=new Television(250, 70);
        Electrodomesticos[7]=new Lavadora(600, 200, 'B', "verde", 15);
        Electrodomesticos[8]=new Television(100, 90, 'F', "", 30, true);
        Electrodomesticos[9]=new Electrodomestico(50, 10) {};
   
        //almacenamiento de la suma de los precios
        double sumElectro=0;
        double sumTele=0;
        double sumLava=0;
   
        //se recorre el array invocando el metodo precioFinal para calcular las sumas
        for(int i=0;i<Electrodomesticos.length;i++){
   
            if(Electrodomesticos[i] instanceof Electrodomestico){
                sumElectro=sumElectro+Electrodomesticos[i].precioFinal();
            }
            if(Electrodomesticos[i] instanceof Lavadora){
                sumLava=sumLava+Electrodomesticos[i].precioFinal();
            }
            if(Electrodomesticos[i] instanceof Television){
                sumTele=sumTele+Electrodomesticos[i].precioFinal();
            }
        }
   
        //Resultados
        System.out.println("Suma precio de los electrodomesticos :"+sumElectro);
        System.out.println("Suma precio de las lavadoras : "+sumLava);
        System.out.println("Suma precio de las televisiones : "+sumTele);
    
    
}
//Fin de la clase Ejecucion
}