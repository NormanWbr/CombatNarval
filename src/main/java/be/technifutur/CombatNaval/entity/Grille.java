package be.technifutur.CombatNaval.entity;

public class Grille {
    private final int width = 10;
    private final int height = 10;
    private final Character empty = ' ';
    private  Character[][] tab = new Character[width][height];

//--------------------------------------------------//

    private void tabInit(){

    }

//--------------------------------------------------//

    public int width(){
        return width;
    }

    public int height(){
        return height;
    }

    public boolean isEmpty(char i, int j) {
        return tab[i - 'A'][j].equals(empty);
    }
}
