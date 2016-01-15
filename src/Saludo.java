
import javax.swing.JOptionPane;
/**
 * 
 * @author Sain Pedraza Guerrero
 *
 */
public class Saludo {
	/**
	 * 
	 * @param args parametro para declarar funcion y vareables
	 */
	public static void main(String[] args) {
		/**
		 *  nombre valor de la persona
		 *  edad valor string de la persona
		 */
		String nombre = "Sain";
		String edad = "21";
		
		//System.out.println("Hola" + nombre );
		//System.out.printf("Hola: %s", nombre);
	
		JOptionPane.showMessageDialog(null, String.format("Hola %s tu edad es %s años de edad", nombre, edad));
		/**
		 * mensaje para agregar a vareables de persona string
		 */
	}

}
