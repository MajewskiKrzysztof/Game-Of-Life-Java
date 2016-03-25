package data;

import util.NeighbourGenerator;
import util.ShapesProvider;

import java.util.ArrayList;

public class CellsContainer {

    private static final int RANDOM = 0;
    private static final int PAINT = 1;
    private static final int SHAPE_1 = 2;
    private static final int SHAPE_2 = 3;
    private static final int SHAPE_3 = 4;
    private static final int SHAPE_4 = 5;
    private static final int SHAPE_5 = 6;
    private static final int SHAPE_6 = 7;
    private static final int SHAPE_7 = 8;
    private static final int CLEAR = 9;

    private ArrayList<Cell> cells;
    private int dimension;

    public CellsContainer(int dimension) {
        this.cells = new ArrayList<>();
        this.dimension = dimension;

        initializeCells();
        generateCells(RANDOM);
    }

    private void initializeCells() {
        for (int i = 0; i < dimension * dimension; i++)
            cells.add(new Cell());

        setNeighbours();
    }

    private void setNeighbours() {
        NeighbourGenerator.setNeighbours(cells, dimension);
    }

    public void generateCells(int type) {
        switch (type) {
            case RANDOM:
                generateRandomCells();
                break;
            case PAINT:
                resetCells();
                break;
            case SHAPE_1:
                generateShape1();
                break;
            case SHAPE_2:
                generateShape2();
                break;
            case SHAPE_3:
                generateShape3();
                break;
            case SHAPE_4:
                generateShape4();
                break;
            case SHAPE_5:
                generateShape5();
                break;
            case SHAPE_6:
                generateShape6();
                break;
            case SHAPE_7:
                generateShape7();
                break;
            case CLEAR:
                resetCells();
                break;
        }
    }

    private void generateRandomCells() {
        resetCells();
        ShapesProvider.setRandomShape(cells, dimension);
    }

    private void generateShape1() {
        resetCells();
        ShapesProvider.setShape1(cells);
    }

    private void generateShape2() {
        resetCells();
        ShapesProvider.setShape2(cells);
    }

    private void generateShape3() {
        resetCells();
        ShapesProvider.setShape3(cells);
    }

    private void generateShape4() {
        resetCells();
        ShapesProvider.setShape4(cells);
    }

    private void generateShape5() {
        resetCells();
        ShapesProvider.setShape5(cells);
    }

    private void generateShape6() {
        resetCells();
        ShapesProvider.setShape6(cells);
    }

    private void generateShape7() {
        resetCells();
        ShapesProvider.setShape7(cells);
    }

    private void resetCells() {
        for (Cell c : cells)
            c.setActive(false);
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }

    public void nextGeneration() {
        ArrayList<Cell> cellsToUpdate = new ArrayList<>();
        for (Cell c : cells) {
            if (c.getActiveNeighbourCount() == 3)
                cellsToUpdate.add(c);
        }

        checkIfCellsShouldDie();

        for (Cell c : cellsToUpdate)
            c.setActive(true);
    }

    public void checkIfCellsShouldDie() {
        ArrayList<Cell> cellsToUpdate = new ArrayList<>();

        for (Cell c : cells) {
            if (c.getActiveNeighbourCount() >= 4 || c.getActiveNeighbourCount() <= 1)
                cellsToUpdate.add(c);
        }

        for (Cell c : cellsToUpdate)
            c.setActive(false);
    }
}