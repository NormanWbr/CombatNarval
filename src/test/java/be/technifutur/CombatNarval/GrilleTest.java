package be.technifutur.CombatNarval;

import static org.junit.jupiter.api.Assertions.*;

import be.technifutur.CombatNaval.entity.Grille;
import org.junit.jupiter.api.Test;

public class GrilleTest {

    @Test
    void testCreateGrille() {
        Grille g = new Grille();
        assertEquals(10, g.width());
        assertEquals(10, g.height());
    }

    @Test
    void testNewGrille() {
        Grille g = new Grille();
        for (int i = 0; i < g.width(); i++) {
            char column = (char) ('A'+i);
            for (int j = 0; j < g.height(); j++) {
                final int line = j;
                assertTrue(g.isEmpty(column, j),() -> String.format("Case %c%d is not empty", column + line));
            }
        }
    }

}
//mec on dirait un chargement