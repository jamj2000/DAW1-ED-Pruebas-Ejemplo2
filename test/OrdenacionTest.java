import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class OrdenacionTest {


    @BeforeClass
    public static void setUpClass() {
        Ordenacion prueba = new Ordenacion();
    }

    @Test
    public void testOrdenarDescendentePositivos() {
        assertArrayEquals(new int[]{2, 1, 1},      Ordenacion.ordenarDescendente(1, 2, 1));
        assertArrayEquals(new int[]{10, 3, 2},     Ordenacion.ordenarDescendente(3, 2, 10));
        assertArrayEquals(new int[]{200, 100, 20}, Ordenacion.ordenarDescendente(100, 20, 200));
        assertArrayEquals(new int[]{7, 2, 2},      Ordenacion.ordenarDescendente(2, 2, 7));   
    }

    @Test
    public void testOrdenarDescendenteNegativos() {
        assertArrayEquals(new int[]{-1, -1, -2},      Ordenacion.ordenarDescendente(-1, -2, -1));
        assertArrayEquals(new int[]{-2, -3, -10},     Ordenacion.ordenarDescendente(-3, -2, -10));
        assertArrayEquals(new int[]{-20, -100, -200}, Ordenacion.ordenarDescendente(-100, -20, -200));
        assertArrayEquals(new int[]{-2, -2, -7},      Ordenacion.ordenarDescendente(-2, -2, -7));   
    }

    
    @Test
    public void testOrdenarDescendente() {
        assertArrayEquals(new int[]{1, 0, -2},       Ordenacion.ordenarDescendente(1, -2, 0));
        assertArrayEquals(new int[]{10, -2, -3},     Ordenacion.ordenarDescendente(-3, -2, 10));
        assertArrayEquals(new int[]{200, 100, -200}, Ordenacion.ordenarDescendente(100, 200, -200));
        assertArrayEquals(new int[]{10, -2, -2},     Ordenacion.ordenarDescendente(-2, -2, 10));   
    }


}
