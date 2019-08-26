package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HoraTest {

    //Variables
    private Hora hora = null;
    private Hora aroh = null;
    private Hora raho = null;
    private Hora ohra = null;

    @Before
    public void init(){
        hora = new Hora(10,12,56);
        aroh = new Hora(5,5,84);
        raho = new Hora(90,12,12);
        ohra = new Hora(14, 60,28);
    }

    @Test
    public void setGetHoraTest(){
        assertEquals("Horas: 10 Minutos: 12 Segundos: 56", hora.getHora());
        assertEquals("Horas: 0 Minutos: 0 Segundos: 0", aroh.getHora());
        assertEquals("Horas: 0 Minutos: 0 Segundos: 0", raho.getHora());
        assertEquals("Horas: 0 Minutos: 0 Segundos: 0", ohra.getHora());
    }
}
