package data;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CellsContainerTest {

    @Test
    public void testNeighboursAmount() {
        CellsContainer cells = new CellsContainer(10);
        cells.generateCells(10);
        ArrayList<Cell> cellsList = cells.getCells();

        int threeNeighbours = 0;
        int fiveNeighbours = 0;
        int eightNeighbours = 0;
        int badNeighbourAmount = 0;

        for (int row = 0; row < cellsList.size() / 10; row++) {
            for (int column = 0; column < cellsList.size() / 10; column++) {
                int cellNeighbours = cellsList.get(row * 10 + column).getNeighbours().size();
                if (cellNeighbours == 3)
                    threeNeighbours++;
                else if (cellNeighbours == 5)
                    fiveNeighbours++;
                else if (cellNeighbours == 8)
                    eightNeighbours++;
                else
                    badNeighbourAmount++;
            }

        }

        assertEquals(threeNeighbours, 4);
        assertEquals(fiveNeighbours, 32);
        assertEquals(eightNeighbours, 64);
        assertEquals(badNeighbourAmount, 0);
    }

}