package internetshop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ComputerGamesParamsTest {
    private ComputerGameParams cgp;
    @Before
    public void initializationOfObject(){
        ArrayList<Genres> genres = new ArrayList<>();
        genres.add(Genres.ACTION);
        cgp = new ComputerGameParams("Counter Strike", genres);
    }


    @Test
    public void testToString(){

        assertEquals("'Counter Strike'", cgp.toString());
    }
}
