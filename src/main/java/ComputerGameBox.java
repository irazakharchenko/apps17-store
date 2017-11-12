
import sun.awt.image.ImageWatched;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class ComputerGameBox {
    protected ArrayList<ComputerGame> obj = new ArrayList<ComputerGame>();

    public ComputerGameBox(ArrayList<ComputerGame> obj) {
        setObj(new ArrayList<ComputerGame>(obj));
    }

    public ComputerGameBox() {
    }

    public ArrayList<ComputerGame> getObj() {
        return obj;
    }


    public void setObj(ArrayList<ComputerGame> obj) {
        this.obj = obj;
    }

    public ComputerGame getGame(String name) {
        name = name.toLowerCase();
        for (ComputerGame game : obj) {
            if (game.getSpec().getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    public void addGame(ComputerGame game) {

        obj.add(game);


    }

    public List<ComputerGame> search(ComputerGameParams searchPar) {
        List matchingGames = new ArrayList();

            for (ComputerGame game : obj) {
                if (game.getSpec().matches(searchPar)) {
                    matchingGames.add(obj);
                }


            }



        return matchingGames;


    }
}

