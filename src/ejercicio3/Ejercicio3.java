package ejercicio3;
/**
 *
 * @author isc_arae
 */
public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        Alumno constructor1 = new Alumno();
        
        Alumno constructor2 = new Alumno(constructor1.nombre);
        constructor2.imprimirDatos();
        constructor2.esMayor();
        constructor2.promedio();        
    }
    
}
