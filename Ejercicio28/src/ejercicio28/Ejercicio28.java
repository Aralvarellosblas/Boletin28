package ejercicio28;

/**
 *
 * @author Arturo
 */
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno al=new Alumno("Arturo",10,"Vigo",40);
        System.out.println(al.amosar());
        al.cambiarNota();
        System.out.println(al.amosar());
    }

}
