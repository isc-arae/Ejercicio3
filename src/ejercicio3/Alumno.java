package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author isc_arae
 */
public class Alumno {
    
    String nombre;
    private int edad;
    private int calificacion;
    
    Scanner leer = new Scanner(System.in);

    public Alumno() {
        System.out.println("Ingrese el Nombre del Alumno: ");
        nombre = leer.nextLine();
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
        System.out.println("Ingrese la Edad del Alumno: ");
        edad = leer.nextInt();
        System.out.println("Ingrese la Calificación del Alumno");
        calificacion = leer.nextInt();
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre del Alumno: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
    
    public void esMayor(){
        if(edad >= 18)
            System.out.println("El Alumno es Mayor de edad");
        else
            System.out.println("El Alumno es Menor de edad");
    }
    
    public void promedio(){
        String mensaje = "";
        if(calificacion < 8)
            mensaje = "Reprobado";
        if(calificacion >= 8 & calificacion < 10)
            mensaje = "Aprobado";
        if(calificacion == 10)
            mensaje = "Excelente";
        
        System.out.println("La Calificación del Alumno es: " + mensaje);
    }
}
