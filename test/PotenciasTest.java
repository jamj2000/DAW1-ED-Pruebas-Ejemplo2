import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class PotenciasTest {

    @BeforeClass
    public static void setUpClass() {
        Potencias prueba = new Potencias();
    }


    @Test
    public void testPotencia_int_int() {
        assertEquals(4,   Potencias.potencia(2, 2));
        assertEquals(9,   Potencias.potencia(3, 2));
        assertEquals(-8,  Potencias.potencia(-2, 3));
        assertEquals(64,  Potencias.potencia(2, 6));
    }


    @Test
    public void testPotencia_int_double() {
        assertEquals(6.7739, Potencias.potencia(2, 2.76), 0.001);
        assertEquals(10.156, Potencias.potencia(3, 2.11), 0.001);
        assertEquals(8.1116, Potencias.potencia(2, 3.02), 0.001);
        assertEquals(0.013,  Potencias.potencia(2, -6.2), 0.001);
        // El tercer parámetro (aquí 0.001) es el margen de error máximo entre lo esperado y lo obtenido
    }


    @Test
    public void testPotencia_double_double() {
        assertEquals(6.868,  Potencias.potencia(2.01, 2.76), 0.001);
        assertEquals(14.06,  Potencias.potencia(3.5,  2.11), 0.001);
        assertEquals(14.246, Potencias.potencia(2.41, 3.02), 0.001);
        assertEquals(0.007,  Potencias.potencia(2.22, -6.2), 0.001);
        // El tercer parámetro (aquí 0.001) es el margen de error máximo entre lo esperado y lo obtenido
    }

}
