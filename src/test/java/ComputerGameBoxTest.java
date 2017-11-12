import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ComputerGameBoxTest {

    private ComputerGameParams cgp, cgp1, cgp2;
    private ComputerGameBox cgbox, cgbox2;
    private ComputerGame cg, cg1, cg2;
    @Before
    public void initializationOfObject(){
        ArrayList<Genres> genres = new ArrayList<>();
        genres.add(Genres.ACTION);
        genres.add(Genres.SIMULATION);


        cgp = new ComputerGameParams("Counter Strike", genres);
        cgp1 = new ComputerGameParams(cgp);
        genres.add(Genres.MOBA);
        cgp2 = new ComputerGameParams("Some name", "short description", 12.9, 12,
                genres);
        cg = new ComputerGame(cgp);
        cg1 = new ComputerGame(cgp1);
        cg2 = new ComputerGame(cgp2);
        cgbox = new ComputerGameBox();

        cgbox.addGame(cg);

        cgbox.addGame(cg2);
        cgbox2 = new ComputerGameBox(cgbox.getObj());
    }



    @Test
    public void search() throws Exception {

        assertEquals(cgbox.getObj().get(1), cg2);
        assertEquals(cgbox2.getObj().get(0), cg);
        cgbox2.search(cgp);
        assertEquals(cgbox.search(cgp1).get(0), cg);
        //assertEquals(cgbox2.search(cgp1), );

        assertEquals(cgbox2.equals(cgbox), false);
        assertEquals(cgbox2.getObj().get(0).getSpec().toString(), "ComputerGameParams{name='Counter Strike', " +
                "description='null', price=0.0, ageRestrinct=0, genres=[action, simulation]}");
    }

    @Test
    public void getGame() throws Exception {

    }

}