

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ComputerGamesParamsTest {
    private ComputerGameParams cgp, cgp1, cgp2;
    @Before
    public void initializationOfObject(){
        ArrayList<Genres> genres = new ArrayList<>();
        genres.add(Genres.ACTION);


        cgp = new ComputerGameParams("Counter Strike", genres);
        cgp1 = new ComputerGameParams(cgp);
        genres.add(Genres.MOBA);
        cgp2 = new ComputerGameParams("Some name", "short description", 12.9, 12,
                genres);
    }


    @Test
    public void testToString(){

        assertEquals("ComputerGameParams{name='counter strike', description='null', price=0.0, " +
                "ageRestrinct=0, genres=[action]}", cgp.toString());
        assertEquals("ComputerGameParams{name='counter strike', description='null', price=0.0, " +
                "ageRestrinct=0, genres=[action]}", cgp1.toString());
        assertEquals("ComputerGameParams{name='some name', description='short description', price=12.9, " +
                "ageRestrinct=12, genres=[action, moba]}", cgp2.toString());
    }
}
