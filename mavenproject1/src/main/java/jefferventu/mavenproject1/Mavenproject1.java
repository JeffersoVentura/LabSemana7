package jefferventu.mavenproject1;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Persona;
import Clases.Seguro;

/**
 *
 * @author jeffersonventura
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Cliente clie = new Cliente ();
        Empleado empl = new Empleado ();
        Persona perso = new Persona ("Jefferson", "Ventura", "23454");
        Seguro segu = new Seguro ();
        
        perso.getDatos();
    }
}
