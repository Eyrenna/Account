package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TarjetaPrepagoTest {

    //Variables
    private DNI dniJuan = null;
    private TarjetaPrepago tarjeta = null;

    @Before
    public void init(){
        dniJuan = new DNI("12345678s");
        tarjeta = new TarjetaPrepago("971971971", dniJuan, 5.0);
    }

    @Test
    public void ingresarSaldoTest(){
        tarjeta.ingresarSaldo(10.0);
        assertEquals(15.0,tarjeta.getSaldo(),0.0);
    }


}
