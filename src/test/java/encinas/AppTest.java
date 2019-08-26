package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    //Variable
    private DNI dniJuan = null;
    private DNI dniClau = null;
    private DNI dniCate = null;
    private DNI dniCarlos = null;
    private DNI dniEdu = null;
    private DNI dniToni = null;
    private DNI dniRick = null;
    private CuentaCorriente account = null;

    @Before
    public void init() {

        dniJuan = new DNI("12345678s");
        dniClau = new DNI("73737373c");
        dniCate = new DNI("5555555c");
        dniCarlos = new DNI("171717171J");
        dniEdu = new DNI("1e234567c");
        dniToni = new DNI("87456321d");
        dniRick = new DNI("15973462h");

        account = new CuentaCorriente(
                "Juan",
                "García Aledro",
                "Ricard Ankerman, 4",
                "666999666",
                dniJuan,
                1000.0
    );

    }

    @Test
    public void retirarDineroTest() {
        account.retirarDinero(250);
        assertEquals(750, account.getSaldo() ,0.0);
        account.retirarDinero(25.50);
        assertEquals(724.50, account.getSaldo(),0.0);
    }

    @Test
    public void ingresarDineroTest() {
        account.ingresarDinero(250);
        assertEquals(1250, account.getSaldo() ,0.0);
        account.ingresarDinero(25.50);
        assertEquals(1275.50, account.getSaldo(),0.0);
    }

    @Test
    public void longitudCorrectaTest() {
        assertTrue(dniJuan.longitudCorrecta());
        assertTrue(dniClau.longitudCorrecta());
        assertFalse(dniCate.longitudCorrecta());
        assertFalse(dniCarlos.longitudCorrecta());
        assertTrue(dniEdu.longitudCorrecta());
    }

    @Test
    public void numeroCorrectoTest() {
        assertTrue(dniJuan.numeroCorrecto());
        assertTrue(dniClau.numeroCorrecto());
        assertFalse(dniCate.numeroCorrecto());
        assertTrue(dniCarlos.numeroCorrecto());
        assertFalse(dniEdu.numeroCorrecto());
    }

    @Test
    public void letraCorrectaTest() {
        assertTrue(dniJuan.letraCorrecta());
        assertFalse(dniClau.letraCorrecta());
        assertFalse(dniToni.letraCorrecta());
        assertFalse(dniRick.letraCorrecta());
    }

    @Test
    public void dniCorrectoTest(){
        assertTrue(dniJuan.dniCorrecto());
        assertFalse(dniClau.dniCorrecto());
        assertFalse(dniToni.dniCorrecto());
        assertFalse(dniRick.dniCorrecto());

    }
}
