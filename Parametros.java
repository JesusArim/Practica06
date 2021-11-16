/*
 * Clase Parametros por valor y por referencia
 * @author Jesus Rivera
 * @version 1.0
 * */
public class Parametros{
    // Metodo principal donde asignamos valores con parametros por valor y por referencia. 
    public static void main(String[] args){
	int edad1;
	int [] edad2 = new int [3];
	    edad1=10;
	edad2[0] = 20;
	edad2[1] = 30;
        // Imprimimimos los valores asignados. 
	System.out.println("EDAD1: "+ edad1+"años" + " " + edad2[0]+"años" +" "+ edad2[1]+"años");
	// Cambiamos los valores asignados por parametros
	set(edad1, edad2);
	//Imprimimos los valores modificados 
	System.out.println("EDAD3: "+ edad1+"años" + " " + edad2[0]+"años" +" "+ edad2[1]+"años");
     }
    /*
     * Metodo modificador para modificar un dato por paso de  parametro por valor y otros dos datos por paso de parametro por referencia.
     * @param EDAD1 50
     * @param EDAD2[0] 60
     * @param EDAD2[1] 70
     * */
    public static void set(int EDAD1, int [] EDAD2){
	EDAD1 = 50;
	EDAD2[0] = 60;
	EDAD2[1] = 70;
	// Imprimimos EDAD1 por paso de parametro por valor.
	// Imprimimos EDAD2 por paso de parametro por referencia indicada.
	System.out.println("EDAD2: "+ EDAD1+"años" + " " + EDAD2[0]+"años" +" "+ EDAD2[1]+"años");
    }
}
