package util;

import data.Cell;

import java.util.ArrayList;

public class NeighbourGenerator {

    public static void setNeighbours(ArrayList<Cell> cells, int dimension) {
        addLeftNeighbours(cells, dimension);
        addRightNeighbours(cells, dimension);
        addTopNeighbours(cells, dimension);
        addBottomNeighbours(cells, dimension);
        addTopLeftCornerNeighbours(cells, dimension);
        addTopRightCornerNeighbours(cells, dimension);
        addBottomLeftCornerNeighbours(cells, dimension);
        addBottomRightCornerNeighbours(cells, dimension);
    }

    private static void addLeftNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 0; row < dimension; row++) {
            for (int column = 1; column < dimension; column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell leftNeighbour = cells.get(row * dimension + column - 1);

                cell.addNeighbour(leftNeighbour);
            }
        }
    }

    private static void addRightNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < (dimension - 1); column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell rightNeighbour = cells.get(row * dimension + column + 1);

                cell.addNeighbour(rightNeighbour);
            }
        }
    }

    private static void addTopNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 1; row < dimension; row++) {
            for (int column = 0; column < dimension; column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell topNeighbour = cells.get((row - 1) * dimension + column);

                cell.addNeighbour(topNeighbour);
            }
        }
    }

    private static void addBottomNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 0; row < (dimension - 1); row++) {
            for (int column = 0; column < dimension; column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell bottomNeighbour = cells.get((row + 1) * dimension + column);

                cell.addNeighbour(bottomNeighbour);
            }
        }
    }

    private static void addTopLeftCornerNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 1; row < dimension; row++) {
            for (int column = 1; column < dimension; column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell bottomNeighbour = cells.get((row - 1) * dimension + (column - 1));

                cell.addNeighbour(bottomNeighbour);
            }
        }
    }

    private static void addTopRightCornerNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 1; row < dimension; row++) {
            for (int column = 0; column < (dimension - 1); column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell bottomNeighbour = cells.get((row - 1) * dimension + (column + 1));

                cell.addNeighbour(bottomNeighbour);
            }
        }
    }

    private static void addBottomLeftCornerNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 0; row < (dimension - 1); row++) {
            for (int column = 1; column < dimension; column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell bottomNeighbour = cells.get((row + 1) * dimension + (column - 1));

                cell.addNeighbour(bottomNeighbour);
            }
        }
    }

    private static void addBottomRightCornerNeighbours(ArrayList<Cell> cells, int dimension) {
        for (int row = 0; row < (dimension - 1); row++) {
            for (int column = 0; column < (dimension - 1); column++) {
                Cell cell = cells.get(row * dimension + column);
                Cell bottomNeighbour = cells.get((row + 1) * dimension + (column + 1));

                cell.addNeighbour(bottomNeighbour);
            }
        }
    }
}