package encinas;

import org.junit.Assert;
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

    @Test
    public void enviarMensajeTest(){
        tarjeta.enviarMensaje(9);
        assertEquals(4.19, tarjeta.getSaldo(), 0.0);
        tarjeta.ingresarSaldo(10.0);
        tarjeta.enviarMensaje(2);
        assertEquals(14.01, tarjeta.getSaldo(), 0.001);
    }


}
