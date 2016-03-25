package gui.components;

import data.Cell;
import data.CellsContainer;
import data.GraphicSection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class DrawingPanel extends JPanel implements MouseMotionListener, MouseListener {

    private CellsContainer cells;
    private ArrayList<GraphicSection> sections;

    private int dimension;
    private int count;

    private boolean allowPainting;

    public DrawingPanel(int d, int count) {
        this.dimension = d;
        this.count = count;
        this.allowPainting = false;

        setPreferredSize(new Dimension(dimension, dimension));
        setBackground(Color.WHITE);

        this.cells = new CellsContainer(count);
        this.sections = new ArrayList<>();
        generateSections();

        addMouseListener(this);
        addMouseMotionListener(this);
    }

    private void generateSections() {
        int cellSize = dimension / count;
        for (int row = 0; row < count; row++) {
            for (int column = 0; column < count; column++) {
                sections.add(new GraphicSection(column * cellSize, row * cellSize, cellSize));
            }
        }

        for (int i = 0; i < sections.size(); i++) {
            GraphicSection s = sections.get(i);
            Cell cell = cells.getCells().get(i);
            s.setCell(cell);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawLines(g);
        fillCells(g);
    }

    private void drawLines(Graphics g) {
        int cellSize = dimension / count;
        g.setColor(Color.LIGHT_GRAY);

        for (int row = 0; row < count; row++) {
            int y = row * cellSize;
            g.drawLine(0, y, dimension, y);
        }

        for (int column = 0; column < count; column++) {
            int x = column * cellSize;
            g.drawLine(x, 0, x, dimension);
        }

        g.drawLine(0, dimension - 1, dimension, dimension - 1);
        g.drawLine(dimension - 1, 0, dimension - 1, dimension);
    }

    private void fillCells(Graphics g) {
        g.setColor(Color.BLACK);

        for (GraphicSection s : sections) {
            if (s.getCell().isActive())
                g.fillRect(s.getX() + 1, s.getY() + 1, s.getSize() - 1, s.getSize() - 1);
        }

    }

    public CellsContainer getCells() {
        return cells;
    }

    public void setAllowPainting(boolean allowPainting) {
        this.allowPainting = allowPainting;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (allowPainting) {
            for (GraphicSection s : sections) {
                int mouseX = e.getX();
                int mouseY = e.getY();
                if (mouseX > s.getX() && mouseY > s.getY() && mouseX < s.getX() + s.getSize() && mouseY < s.getY() + s.getSize()) {
                    s.getCell().setActive(true);
                    repaint();
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (allowPainting) {
            if (SwingUtilities.isLeftMouseButton(e)) {
                switchCellsState(e, true);
            } else if (SwingUtilities.isRightMouseButton(e)) {
                switchCellsState(e, false);
            }
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    private void switchCellsState(MouseEvent e, boolean newState) {
        for (GraphicSection s : sections) {
            int mouseX = e.getX();
            int mouseY = e.getY();
            if (mouseX > s.getX() && mouseY > s.getY() && mouseX < s.getX() + s.getSize() && mouseY < s.getY() + s.getSize()) {
                s.getCell().setActive(newState);
                repaint();
            }
        }
    }
}