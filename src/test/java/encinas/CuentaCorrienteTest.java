package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CuentaCorrienteTest {

    //Variables
    private DNI dniJuan = null;
    private CuentaCorriente account = null;

    @Before
    public void init() {
        dniJuan = new DNI("12345678s");
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
        assertEquals(750, account.getSaldo(), 0.0);
        account.retirarDinero(25.50);
        assertEquals(724.50, account.getSaldo(), 0.0);
    }

    @Test
    public void ingresarDineroTest() {
        account.ingresarDinero(250);
        assertEquals(1250, account.getSaldo(), 0.0);
        account.ingresarDinero(25.50);
        assertEquals(1275.50, account.getSaldo(), 0.0);
        account.consultarCuenta();
    }

    @Test
    public void saldoNegativo() {
        assertFalse(account.saldoNegativo());
        account.retirarDinero(1025);
        assertTrue(account.saldoNegativo());
    }
}
