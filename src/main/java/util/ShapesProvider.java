package util;

import data.Cell;

import java.util.ArrayList;

public class ShapesProvider {

    public static void setRandomShape(ArrayList<Cell> cells, int dimension) {
        int amount = (int) (Math.random() * dimension * dimension * 0.70);
        for (int i = 0; i < amount; i++) {
            int random = (int) (Math.random() * dimension * dimension);
            cells.get(random).setActive(true);
        }
    }

    public static void setShape1(ArrayList<Cell> cells) {
        cells.get(1831).setActive(true);
        cells.get(1832).setActive(true);
        cells.get(1833).setActive(true);
        cells.get(1773).setActive(true);
        cells.get(1712).setActive(true);
    }

    public static void setShape2(ArrayList<Cell> cells) {
        cells.get(1830).setActive(true);
        cells.get(1769).setActive(true);
        cells.get(1770).setActive(true);
        cells.get(1771).setActive(true);
        cells.get(1709).setActive(true);
        cells.get(1711).setActive(true);
        cells.get(1650).setActive(true);
    }

    public static void setShape3(ArrayList<Cell> cells) {
        cells.get(1828).setActive(true);
        cells.get(1888).setActive(true);
        cells.get(1948).setActive(true);
        cells.get(2008).setActive(true);
        cells.get(2068).setActive(true);
        cells.get(1830).setActive(true);
        cells.get(2070).setActive(true);
        cells.get(1832).setActive(true);
        cells.get(1892).setActive(true);
        cells.get(1952).setActive(true);
        cells.get(2012).setActive(true);
        cells.get(2072).setActive(true);
    }

    public static void setShape4(ArrayList<Cell> cells) {
        cells.get(1825).setActive(true);
        cells.get(1826).setActive(true);
        cells.get(1827).setActive(true);
        cells.get(1828).setActive(true);
        cells.get(1829).setActive(true);
        cells.get(1830).setActive(true);
        cells.get(1831).setActive(true);
        cells.get(1832).setActive(true);
        cells.get(1833).setActive(true);
        cells.get(1834).setActive(true);
    }

    public static void setShape5(ArrayList<Cell> cells) {
        cells.get(1829).setActive(true);
        cells.get(1830).setActive(true);
        cells.get(1831).setActive(true);
        cells.get(1832).setActive(true);
        cells.get(1892).setActive(true);
        cells.get(1952).setActive(true);
        cells.get(1888).setActive(true);
        cells.get(2011).setActive(true);
        cells.get(2008).setActive(true);
    }

    public static void setShape6(ArrayList<Cell> cells) {
        cells.get(1828).setActive(true);
        cells.get(1829).setActive(true);
        cells.get(1768).setActive(true);
        cells.get(1769).setActive(true);
        cells.get(1829).setActive(true);
        cells.get(1889).setActive(true);
        cells.get(1949).setActive(true);
        cells.get(2009).setActive(true);
        cells.get(2068).setActive(true);
        cells.get(2067).setActive(true);
        cells.get(2007).setActive(true);
        cells.get(1947).setActive(true);

        cells.get(1831).setActive(true);
        cells.get(1832).setActive(true);
        cells.get(1771).setActive(true);
        cells.get(1772).setActive(true);
        cells.get(1891).setActive(true);
        cells.get(1951).setActive(true);
        cells.get(2011).setActive(true);
        cells.get(2072).setActive(true);
        cells.get(2073).setActive(true);
        cells.get(2013).setActive(true);
        cells.get(1953).setActive(true);
    }

    public static void setShape7(ArrayList<Cell> cells) {
        cells.get(1210).setActive(true);
        cells.get(1211).setActive(true);
        cells.get(1270).setActive(true);
        cells.get(1271).setActive(true);

        cells.get(1219).setActive(true);
        cells.get(1220).setActive(true);
        cells.get(1278).setActive(true);
        cells.get(1280).setActive(true);
        cells.get(1338).setActive(true);
        cells.get(1339).setActive(true);

        cells.get(1346).setActive(true);
        cells.get(1406).setActive(true);
        cells.get(1466).setActive(true);
        cells.get(1347).setActive(true);
        cells.get(1408).setActive(true);

        cells.get(1232).setActive(true);
        cells.get(1233).setActive(true);
        cells.get(1172).setActive(true);
        cells.get(1174).setActive(true);
        cells.get(1113).setActive(true);
        cells.get(1114).setActive(true);

        cells.get(1124).setActive(true);
        cells.get(1125).setActive(true);
        cells.get(1184).setActive(true);
        cells.get(1185).setActive(true);

        cells.get(1834).setActive(true);
        cells.get(1835).setActive(true);
        cells.get(1836).setActive(true);
        cells.get(1894).setActive(true);
        cells.get(1955).setActive(true);

        cells.get(1545).setActive(true);
        cells.get(1605).setActive(true);
        cells.get(1665).setActive(true);
        cells.get(1546).setActive(true);
        cells.get(1607).setActive(true);
    }
}