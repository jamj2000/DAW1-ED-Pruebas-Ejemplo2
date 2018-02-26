import java.util.Arrays;


public class Main {
    
    public static void main(String[] args) {
        System.out.println("\nORDENACIÓN");
        System.out.println( Arrays.toString (Ordenacion.ordenarDescendente(-20, 100, 20)) ); 

        System.out.println("\nPOTENCIAS");
        System.out.println(Potencias.potencia(2,   3));
        System.out.println(Potencias.potencia(3,   3.1));
        System.out.println(Potencias.potencia(4.2, 3.5));
    }
    
}
