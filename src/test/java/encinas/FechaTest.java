package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FechaTest {

    //Variables

    private Fecha fecha = null;
    private Fecha febreroBis = null;
    private Fecha febreroNor = null;

    @Before
    public void init(){
        fecha = new Fecha(12,12,1990);
        febreroBis = new Fecha(20,2,1984);
        febreroNor = new Fecha(20,2,1983);
    }

    @Test
    public void incrementarFechaTest(){
        fecha.imprimirFecha();
        fecha.incrementarFecha(60);
        fecha.imprimirFecha();
        assertEquals(1991, fecha.getAnno(), 0.0);
        assertEquals(2, fecha.getMes(), 0.0);
        assertEquals(10, fecha.getDia(), 0.0);
        febreroBis.imprimirFecha();
        febreroBis.incrementarFecha(75);
        febreroBis.imprimirFecha();
        assertEquals(1984, febreroBis.getAnno(), 0.0);
        assertEquals(5, febreroBis.getMes(), 0.0);
        assertEquals(5, febreroBis.getDia(), 0.0);
        febreroNor.imprimirFecha();
        febreroNor.incrementarFecha(75);
        febreroNor.imprimirFecha();
        assertEquals(1983, febreroNor.getAnno(), 0.0);
        assertEquals(5, febreroNor.getMes(), 0.0);
        assertEquals(6, febreroNor.getDia(), 0.0);
    }

}
