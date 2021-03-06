package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class DNITest {
    /**
     * Rigorous Test :-)
     */

    //Variables
    private DNI dniJuan = null;
    private DNI dniClau = null;
    private DNI dniCate = null;
    private DNI dniCarlos = null;
    private DNI dniEdu = null;
    private DNI dniToni = null;
    private DNI dniRick = null;


    @Before
    public void init() {

        dniJuan = new DNI("12345678s");
        dniClau = new DNI("73737373c");
        dniCate = new DNI("5555555c");
        dniCarlos = new DNI("171717171J");
        dniEdu = new DNI("1e234567c");
        dniToni = new DNI("87456321d");
        dniRick = new DNI("15973462h");


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
