package data;

public class GraphicSection {

    private Cell cell;
    private int x;
    private int y;
    private int size;

    public GraphicSection(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public Cell getCell() {
        return cell;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }
}
