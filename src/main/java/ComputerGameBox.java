package internetshop;

import java.util.ArrayList;

public class ComputerGameBox{
    protected ArrayList<ComputerGame> obj;

    public ComputerGameBox(ArrayList<ComputerGame> obj){
        setObj(new ArrayList<ComputerGame>(obj));
    }

    public ArrayList<ComputerGame> getObj() {
        return obj;
    }

    public void setObj(ArrayList<ComputerGame> obj) {
        this.obj = obj;
    }

    public ComputerGame getGame(String name){
        name = name.toLowerCase();
        for (ComputerGame game: obj){
            if (game.getSpec().getName() == name){
                return game;
            }
        }
        return null;
    }

    public void addGame(String name,
                        String description,
                        double price,
                        int ageRestrinct){
        ComputerGame game = new ComputerGame(new ComputerGameParams(name.toLowerCase(), description.toLowerCase(),
                price,ageRestrinct));
        obj.add(game);


    }





    //public ArrayList<ComputerGame> filter(String filt, String categoryFilter) {
        //switch (categoryFilter);

    //}
}
