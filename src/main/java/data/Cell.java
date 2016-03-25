package data;

import java.util.ArrayList;

public class Cell {

    private boolean active;
    private ArrayList<Cell> neighbours;

    public Cell() {
        this.active = false;
        this.neighbours = new ArrayList<>();
    }

    public void addNeighbour(Cell neighbour) {
        neighbours.add(neighbour);
    }

    public int getActiveNeighbourCount() {
        int activeNeighbours = 0;
        for(Cell c : neighbours) {
            if(c.isActive())
                activeNeighbours++;
        }

        return activeNeighbours;
    }

    public ArrayList<Cell> getNeighbours() {
        return neighbours;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}