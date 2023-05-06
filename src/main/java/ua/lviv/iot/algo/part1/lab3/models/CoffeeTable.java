package ua.lviv.iot.algo.part1.lab3.models;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CoffeeTable extends Desk {
    private Integer ID;
    private double areaOfSurface;
    private int numOfJournals;

    public CoffeeTable(final int width, final int length, final int height,
                       final int maxHeight, final int minHeight, final int numOfDrawers,
                       final double areaOfSurface, final int numOfJournals) {
        super(width, length, height, maxHeight, minHeight, numOfDrawers);

        this.numOfJournals = numOfJournals;
        this.areaOfSurface = areaOfSurface;
    }

    @Override
    public String toString() {
        return "CoffeeTable{" + super.toString()
                + "areaOfSurface=" + areaOfSurface
                + ", numOfJournals=" + numOfJournals
                + '}';
    }

    @Override
    public void adjustHeight(final int centimeters) {
        if (getHeight() + centimeters > getMaxHeight()) {
            return;
        }
        setHeight(getHeight() + centimeters);
    }

    @Override
    public void moveDown(final int centimeters) {
        if (getHeight() - centimeters < getMinHeight()) {
            return;
        }
        setHeight(getHeight() - centimeters);
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "areaOfSurface, numOfJournals";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", "
                + areaOfSurface + ", "
                + numOfJournals;
    }
}
